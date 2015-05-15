package ru.synq.smev.services.fms;

import ru.fms.sx.kernel.webservices.incomingrequests.v2_4_3.IncomingRequestsServiceV243;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.URL;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2015-05-08T13:03:15.732-04:00
 * Generated source version: 2.6.1
 * 
 */
@WebServiceClient(name = "incomingRequests_v2_4_3", 
                  wsdlLocation = "wsdl/SID0003418/fms.wsdl",
                  targetNamespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru") 
public class FmsService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "incomingRequests_v2_4_3");
    public final static QName IncomingRequestsPort = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "incomingRequestsPort");
    static {
        URL url = FmsService.class.getClassLoader().getResource("wsdl/SID0003418/fms.wsdl");
        if (url == null) {
            throw new Error("Can not initialize the default wsdl from wsdl/SID0003418/fms.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public FmsService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public FmsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FmsService() {
        super(WSDL_LOCATION, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public FmsService(WebServiceFeature... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public FmsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public FmsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
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