package demo.wssec.client;

import java.io.Closeable;
import java.lang.reflect.UndeclaredThrowableException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import mserver.SoapHelper;

import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.aegis.type.java5.XMLGregorianCalendarType;
import org.apache.cxf.bus.spring.SpringBusFactory;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.hello_world_soap_http.Greeter;
import org.apache.cxf.hello_world_soap_http.GreeterService;
import org.apache.cxf.ws.security.wss4j.DefaultCryptoCoverageChecker;
import org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;

import ru.gosuslugi.smev.rev111111.BaseMessageType;
import ru.gosuslugi.smev.rev111111.MessageType;
import ru.gosuslugi.smev.rev111111.OrgExternalType;
import ru.socit.pfr.service.ServicePFR;
import ru.socit.pfr.service.ServicePFRService;

/**
 * A DOM-based client
 */
public final class Client {

    private static final String WSSE_NS 
        = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
    private static final String WSU_NS
        = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";

    private Client() {
    }

    public static void main(String args[]) throws Exception {
        try {

            SpringBusFactory bf = new SpringBusFactory();
            URL busFile = Client.class.getResource("wssec.xml");
            Bus bus = bf.createBus(busFile.toString());
            BusFactory.setDefaultBus(bus);

            Map<String, Object> outProps = new HashMap<String, Object>();
            outProps.put("action", "Signature");//"UsernameToken Timestamp Signature Encrypt"

            outProps.put("passwordType", "PasswordDigest");

            outProps.put("user", "abcd");
            outProps.put("signatureUser", "clientx509v1");

            outProps.put("passwordCallbackClass", "demo.wssec.client.UTPasswordCallback");

            outProps.put("encryptionUser", "serverx509v1");
            outProps.put("encryptionPropFile", "etc/Client_Encrypt.properties");
            outProps.put("encryptionKeyIdentifier", "IssuerSerial");
//            outProps.put("encryptionParts",
//                         "{Element}{" + WSSE_NS + "}UsernameToken;"
//                         + "{Content}{http://schemas.xmlsoap.org/soap/envelope/}Body");

            outProps.put("signaturePropFile", "etc/Client_Sign.properties");
            outProps.put("signatureKeyIdentifier", "DirectReference");
            outProps.put("signatureParts",
//                         "{Element}{" + WSU_NS + "}Timestamp;" +
//            		"{Element}{http://www.w3.org/2005/08/addressing/}MessageID;" +
                         "{Element}{http://schemas.xmlsoap.org/soap/envelope/}Body;" +
                         "{}{http://www.w3.org/2005/08/addressing}ReplyTo;");

            outProps.put("encryptionKeyTransportAlgorithm", 
                         "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p");
            outProps.put("signatureAlgorithm", "http://www.w3.org/2000/09/xmldsig#rsa-sha1");


            Map<String, Object> inProps = new HashMap<String, Object>();

            inProps.put("action", "UsernameToken Timestamp Signature Encrypt");
            inProps.put("passwordType", "PasswordText");
            inProps.put("passwordCallbackClass", "demo.wssec.client.UTPasswordCallback");

            inProps.put("decryptionPropFile", "etc/Client_Sign.properties");
            inProps.put("encryptionKeyIdentifier", "IssuerSerial");

            inProps.put("signaturePropFile", "etc/Client_Encrypt.properties");
            inProps.put("signatureKeyIdentifier", "DirectReference");

            inProps.put("encryptionKeyTransportAlgorithm", 
                         "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p");
            inProps.put("signatureAlgorithm", "http://www.w3.org/2000/09/xmldsig#rsa-sha1");


            // Check to make sure that the SOAP Body and Timestamp were signed,
            // and that the SOAP Body was encrypted
            DefaultCryptoCoverageChecker coverageChecker = new DefaultCryptoCoverageChecker();
            coverageChecker.setSignBody(true);
            coverageChecker.setSignTimestamp(true);
            coverageChecker.setEncryptBody(true);//true

            GreeterService service = new GreeterService();
            Greeter port = service.getGreeterPort();
            org.apache.cxf.endpoint.Client client = ClientProxy.getClient(port);
            client.getInInterceptors().add(new WSS4JInInterceptor(inProps));
            client.getOutInterceptors().add(new WSS4JOutInterceptor(outProps));
//            client.getInInterceptors().add(coverageChecker);
            
            ServicePFRService pfrService = new ServicePFRService();
            ServicePFR pfrPort = pfrService.getServicePFR();
                        
            BaseMessageType bmt = SoapHelper.createTestPfrData();

            
            org.apache.cxf.endpoint.Client pfrClient = ClientProxy.getClient(pfrPort);
            pfrClient.getInInterceptors().add(new WSS4JInInterceptor(inProps));
            pfrClient.getOutInterceptors().add(new WSS4JOutInterceptor(outProps));
            pfrClient.getInInterceptors().add(coverageChecker);
            pfrPort.process(bmt);

            String[] names = new String[] {"Anne", "Bill", "Chris", "Sachin Tendulkar"};
            // make a sequence of 4 invocations
            for (int i = 0; i < 4; i++) {
                System.out.println("Invoking greetMe...");
                String response = port.greetMe(names[i]);
                System.out.println("response: " + response + "\n");
            }

            // allow asynchronous resends to occur
            Thread.sleep(10 * 1000);

            if (port instanceof Closeable) {
                ((Closeable)port).close();
            }

            bus.shutdown(true);

        } catch (UndeclaredThrowableException ex) {
            ex.getUndeclaredThrowable().printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.exit(0);
        }
    }
}
