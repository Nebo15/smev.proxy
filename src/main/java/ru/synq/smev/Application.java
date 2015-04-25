package ru.synq.smev;

import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.bus.spring.SpringBusFactory;
import org.apache.cxf.interceptor.transform.TransformOutInterceptor;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.WSConstants;
import org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException;
import org.apache.xml.security.signature.XMLSignatureException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.gosuslugi.smev.rev111111.BaseMessageType;
import org.springframework.web.bind.annotation.RestController;
import ru.synq.smev.Response.ErrorResponse;
import ru.synq.smev.soap.xml.security.XmlDSignTools;
import ru.synq.smev.soap.xml.security.action.LocalSignatureAction;

import javax.annotation.PostConstruct;
import javax.servlet.DispatcherType;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.IOException;
import java.net.URL;
import java.util.*;

import static java.util.Collections.singletonMap;

@SuppressWarnings("SpringJavaAutowiringInspection")
@RestController
@SpringBootApplication
@ImportResource("beans.xml")
public class Application {
    private static Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    public Application() throws XMLSignatureException, AlgorithmAlreadyRegisteredException, ClassNotFoundException, IOException {
        XmlDSignTools.init();
        SpringBusFactory bf = new SpringBusFactory();
        URL resource = this.getClass().getClassLoader().getResource("wssec.xml");
        Bus bus = bf.createBus(resource);
        BusFactory.setDefaultBus(bus);

        TransformOutInterceptor transformOutInterceptor = new TransformOutInterceptor();
        transformOutInterceptor.setOutTransformElements(singletonMap("{http://www.w3.org/2005/08/addressing}Action", ""));
        bus.getOutInterceptors().add(transformOutInterceptor);
    }

    @RequestMapping("**")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse notFoundError() {
        return Response.error(HttpStatus.NOT_FOUND);
    }

    @Bean
    @Autowired
    public FilterRegistrationBean authenticationFilter(AuthenticationFilter filter) {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(filter);
        registration.setDispatcherTypes(EnumSet.allOf(DispatcherType.class));
        registration.addUrlPatterns("/**");
        return registration;
    }

    @Bean
    public WSS4JOutInterceptor wsConfig() {
        final HashMap<String, Object> outProps = new HashMap<>();
        Map<Integer, Class<?>> wssConfigMap = new HashMap<>();
        wssConfigMap.put(WSConstants.SIGN, LocalSignatureAction.class);
        outProps.put("wss4j.action.map", wssConfigMap);
        outProps.put("action", "Signature");
        outProps.put("passwordType", "PasswordDigest");
        outProps.put("user", "RaUser");
        outProps.put("actor", "http://smev.gosuslugi.ru/actors/smev");
        outProps.put("passwordCallbackClass", "demo.wssec.client.UTPasswordCallback");
        outProps.put("signaturePropFile", "etc/Client_Sign.properties");
        outProps.put("signatureKeyIdentifier", "DirectReference");
        outProps.put("signatureParts", "{Element}{http://schemas.xmlsoap.org/soap/envelope/}Body");
        outProps.put("signatureAlgorithm", "http://www.w3.org/2001/04/xmldsig-more#gostr34102001-gostr3411");
        outProps.put("signatureDigestAlgorithm", "http://www.w3.org/2001/04/xmldsig-more#gostr3411");
        outProps.put("mustUnderstand", "false");
        return new WSS4JOutInterceptor(outProps);
    }

    @Bean(name = "currentDate")
    public XMLGregorianCalendar getCurrentDate() throws DatatypeConfigurationException {
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
    }

}
