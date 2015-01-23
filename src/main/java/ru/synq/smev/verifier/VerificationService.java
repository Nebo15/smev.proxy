package ru.synq.smev.verifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ru.synq.smev.Data;

@Component
public class VerificationService {
    private Logger log = LoggerFactory.getLogger(VerificationService.class);

    public void verify(Data data) throws Exception {
        // send request to SMEV and set response data to Data object
        if (data.getInput1().equals("error")) {
            throw new Exception("Test error");
        }
        Thread.sleep(10000); // 10 sec delay

        data.setProviderId("test"+Math.random());
    }
}
