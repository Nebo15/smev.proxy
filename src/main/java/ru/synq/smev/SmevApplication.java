package ru.synq.smev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import ru.synq.smev.verifier.VerificationService;

import java.util.Date;

import static com.google.common.base.Preconditions.checkNotNull;

@RestController
@EnableJpaRepositories
@SpringBootApplication
@Transactional
public class SmevApplication {
    private Logger log = LoggerFactory.getLogger(SmevApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SmevApplication.class, args);
    }

    @Autowired VerificationService verificationService;
    @Autowired DataRepository repository;
    @Autowired AsyncTaskExecutor executor;

    @RequestMapping(value = "/test")
    public String test() {
        return "success";
    }

    @RequestMapping(value = "/verify")
    public Data verify(final Data data) {
        checkNotNull(data.getInput1(), "Input 1 is empty");
        checkNotNull(data.getInput2(), "Input 2 is empty");

        // todo
        // Если запись такая в таблице есть и она не старше часа (есть какая-то инфа как часто они обновляются там?),
        // отдавайте её сразу из базы, чтобы мы вас не грузили.
        // Если старше - отдавайте последние сохраненные данные и статус validating. (На случай утери паспорта,
        // когда ты его заявил как утерянный, а потом начал использовать.)

        data.setStatus(DataStatus.input);
        data.setLastUpdateTime(new Date());

        repository.save(data);

        log.info("Data received {}", data);

        executor.submit(new Runnable() {
            @Override
            public void run() {
                data.setStatus(DataStatus.verifying);
                repository.saveAndFlush(data);
                log.info("Start verification, data id {}", data.getId());

                try {
                    verificationService.verify(data);
                } catch (Exception e) {
                    registerError(data, "Verification error: "+e);
                    return;
                }

                if (data.getProviderId() == null || data.getProviderId().isEmpty()){
                    registerError(data, "Provider ID invalid");
                    return;
                }

                data.setStatus(DataStatus.verified);
                repository.saveAndFlush(data);
                log.info("Data verified: {}", data);
            }
        });

        return data;
    }

    @RequestMapping(value = "/status/{id}")
    public Data status(@PathVariable Integer id) {
        checkNotNull(id);
        final Data data = repository.findOne(id);
        checkNotNull(data, "Data not found");
        return data;
    }

    @RequestMapping(value = "/get/{providerId}")
    public Data get(@PathVariable String providerId) {
        checkNotNull(providerId);
        final Data data = repository.findByProviderId(providerId);
        checkNotNull(data, "Data not found");
        return data;
    }

    @RequestMapping(value = "/find")
    /**
     * example http://localhost:8080/find?status=verified&sort=lastUpdateTime,desc&size=2
     */
    public Response.PageResponse find(FindProperties properties, Pageable pageable) {
        final FindSpecification specification = new FindSpecification(properties);
        return Response.page(repository.findAll(specification, pageable));
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Response.ErrorResponse handleError(Exception exception) {
        return Response.error(exception);
    }

    private void registerError(Data data, String message) {
        data.setError(message);
        data.setStatus(DataStatus.error);
        repository.saveAndFlush(data);
        log.warn("Error for data id {}, message: {}", data.getId(), message);
    }

    @Bean
    public AsyncTaskExecutor taskScheduler() {
        final ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setPoolSize(3);
        return scheduler;
    }

}
