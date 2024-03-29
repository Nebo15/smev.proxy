package ru.synq.smev.services.inn;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.URL;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2015-04-30T10:39:13.071+03:00
 * Generated source version: 2.6.1
 * 
 */
@WebServiceClient(name = "FNSINNSvc_24", 
                  wsdlLocation = "wsdl/SID0003450/inn.wsdl",
                  targetNamespace = "http://ws.unisoft/") 
public class InnService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.unisoft/", "FNSINNSvc_24");
    public final static QName FNSINNSvc24Port = new QName("http://ws.unisoft/", "FNSINNSvc_24Port");
    static {
        WSDL_LOCATION = InnService.class.getClassLoader().getResource("wsdl/SID0003450/inn.wsdl");
    }

    public InnService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public InnService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InnService() {
        super(WSDL_LOCATION, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public InnService(WebServiceFeature... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public InnService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public InnService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns FNSINNSvc24Port
     */
    @WebEndpoint(name = "FNSINNSvc_24Port")
    public InnPort getPort() {
        return super.getPort(FNSINNSvc24Port, InnPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FNSINNSvc24Port
     */
    @WebEndpoint(name = "FNSINNSvc_24Port")
    public InnPort getFNSINNSvc24Port(WebServiceFeature... features) {
        return super.getPort(FNSINNSvc24Port, InnPort.class, features);
    }

}
