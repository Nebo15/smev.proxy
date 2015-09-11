package ru.synq.smev;

import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.bus.spring.SpringBusFactory;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.interceptor.transform.TransformOutInterceptor;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.WSConstants;
import org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException;
import org.apache.xml.security.signature.XMLSignatureException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.http.HttpStatus;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.CryptoPro.JCP.KeyStore.HDImage.HDImageStore;
import ru.synq.smev.Response.ErrorResponse;
import ru.synq.smev.soap.xml.security.XmlDSignTools;
import ru.synq.smev.soap.xml.security.action.LocalSignatureAction;

import javax.annotation.PostConstruct;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import static java.util.Collections.singletonMap;

@SuppressWarnings("SpringJavaAutowiringInspection")
@RestController
@SpringBootApplication
@ComponentScan("ru.synq.smev")
@ImportResource("beans.xml")
public class Application {
    private static Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Value("${org.apache.ws.security.crypto.merlin.keystore.file}") String keyStoreDir;
    @Value("${skip-cxf-init:false}") boolean skipCxfInitFlag;

    @PostConstruct
    public void init() throws XMLSignatureException, AlgorithmAlreadyRegisteredException, ClassNotFoundException, IOException, NoSuchAlgorithmException {
        if (skipCxfInitFlag) {
            log.info("Apache cxf initialization skipped by parameter skip-cxf-init");
            return;
        }

        if (keyStoreDir.startsWith("/")) { // run only under linux
            HDImageStore.setDir(keyStoreDir);
        } else {
            SecureRandom.getInstance("SHA1PRNG");
        }
	    log.info("HDImageStore dir: {}", HDImageStore.getDir());
	    XmlDSignTools.init();
        SpringBusFactory bf = new SpringBusFactory();
        Bus bus = bf.createBus();
        BusFactory.setDefaultBus(bus);

        TransformOutInterceptor transformOutInterceptor = new TransformOutInterceptor();
        transformOutInterceptor.setOutTransformElements(singletonMap("{http://www.w3.org/2005/08/addressing}Action", ""));
        bus.getOutInterceptors().add(transformOutInterceptor);
        bus.getInInterceptors().add(new LoggingInInterceptor());
        bus.getOutInterceptors().add(new LoggingOutInterceptor());
    }

    @RequestMapping("**")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse notFoundError() {
        return Response.error(HttpStatus.NOT_FOUND);
    }

    private Map<String, Object> properties() {
        final HashMap<String, Object> outProps = new HashMap<>();
        Map<Integer, Class<?>> wssConfigMap = new HashMap<>();
        wssConfigMap.put(WSConstants.SIGN, LocalSignatureAction.class);
        outProps.put("wss4j.action.map", wssConfigMap);
        outProps.put("action", "Signature");
        outProps.put("passwordType", "PasswordDigest");
        outProps.put("actor", "http://smev.gosuslugi.ru/actors/smev");
        outProps.put("passwordCallbackClass", "ru.synq.smev.soap.client.UTPasswordCallback");
        outProps.put("signaturePropFile", "application.properties");
        outProps.put("signatureKeyIdentifier", "DirectReference");
        outProps.put("signatureParts", "{Element}{http://schemas.xmlsoap.org/soap/envelope/}Body");
        outProps.put("signatureAlgorithm", "http://www.w3.org/2001/04/xmldsig-more#gostr34102001-gostr3411");
        outProps.put("signatureDigestAlgorithm", "http://www.w3.org/2001/04/xmldsig-more#gostr3411");
        outProps.put("mustUnderstand", "false");
        return outProps;
    }

    @Bean(name = "testConfig")
    public WSS4JOutInterceptor testConfig() {
        Map<String, Object> properties = properties();
        properties.put("user", "RaUser");
        return new WSS4JOutInterceptor(properties);
    }

    @Bean(name = "prodConfig")
    public WSS4JOutInterceptor prodConfig() {
        Map<String, Object> properties = properties();
        properties.put("user", "prod");
        return new WSS4JOutInterceptor(properties);
    }

    @Bean(name = "fmsTestConfig")
    public WSS4JOutInterceptor fmsTestConfig() {
        Map<String, Object> properties = properties();
        properties.put("user", "FMSTest");
        return new WSS4JOutInterceptor(properties);
    }

    @Bean(name = "fmsProdConfig")
    public WSS4JOutInterceptor fmsProdConfig() {
        Map<String, Object> properties = properties();
        properties.put("user", "FMSProd");
        return new WSS4JOutInterceptor(properties);
    }

    @Bean(name = "currentDate")
    public XMLGregorianCalendar getCurrentDate() throws DatatypeConfigurationException {
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
    }

    @Bean
    @Autowired
    public LocalValidatorFactoryBean validator(MessageSource messageSource) {
        LocalValidatorFactoryBean validatorFactoryBean = new LocalValidatorFactoryBean();
        validatorFactoryBean.setValidationMessageSource(messageSource);
        return validatorFactoryBean;
    }

    @Bean
    public RequestLoggingFilter loggingFilter() {
        return RequestLoggingFilter.builder().build();
    }
}
