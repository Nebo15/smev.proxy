package ru.fms.sx.kernel.webservices.incomingrequests.v2_4_3;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2015-05-08T11:53:39.584-04:00
 * Generated source version: 2.6.1
 * 
 */
@WebServiceClient(name = "incomingRequests_v2_4_3", 
                  wsdlLocation = "/home/smev/smev.proxy/src/main/resources/wsdl/SID0003418/fms.wsdl",
                  targetNamespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru") 
public class IncomingRequestsV243 extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "incomingRequests_v2_4_3");
    public final static QName IncomingRequestsPort = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "incomingRequestsPort");
    static {
        URL url = IncomingRequestsV243.class.getResource("/home/smev/smev.proxy/src/main/resources/wsdl/SID0003418/fms.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(IncomingRequestsV243.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "/home/smev/smev.proxy/src/main/resources/wsdl/SID0003418/fms.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public IncomingRequestsV243(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IncomingRequestsV243(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IncomingRequestsV243() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IncomingRequestsV243(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IncomingRequestsV243(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IncomingRequestsV243(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns IncomingRequestsServiceV243
     */
    @WebEndpoint(name = "incomingRequestsPort")
    public IncomingRequestsServiceV243 getIncomingRequestsPort() {
        return super.getPort(IncomingRequestsPort, IncomingRequestsServiceV243.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IncomingRequestsServiceV243
     */
    @WebEndpoint(name = "incomingRequestsPort")
    public IncomingRequestsServiceV243 getIncomingRequestsPort(WebServiceFeature... features) {
        return super.getPort(IncomingRequestsPort, IncomingRequestsServiceV243.class, features);
    }

}
