package ru.synq.smev.services.inn;

import ru.synq.smev.services.inn.InnResponse.GroupGet;
import ru.synq.smev.services.inn.InnResponse.GroupQuery;
import ru.synq.smev.services.inn.InnResponse.IndividualQuery;
import ru.synq.smev.services.inn.group.query.InnGroupQueryRequest;
import ru.synq.smev.services.inn.group.get.InnGroupGetRequest;
import ru.synq.smev.services.inn.individual.InnIndividualRequest;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(targetNamespace = "http://ws.unisoft/", name = "FNSINNSvc_24Port")
@XmlSeeAlso({org.w3._2004._08.xop.include.ObjectFactory.class, unisoft.ws.fnsinn.response.ObjectFactory.class, ru.gosuslugi.smev.rev111111.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface InnPort {

    @WebMethod(action = "queryINNFL", operationName = "queryINNFL")
    @WebResult(name = "queryINNFLResponse", targetNamespace = "http://ws.unisoft/", partName = "queryINNFL_OUT")
    public IndividualQuery individualQuery(@WebParam(partName = "queryINNFL_IN", name = "queryINNFL", targetNamespace = "http://ws.unisoft/")
                                           InnIndividualRequest request);

    @WebMethod(action = "queryINNFLGR", operationName = "queryINNFLGR")
    @WebResult(name = "queryINNFLGRResponse", targetNamespace = "http://ws.unisoft/", partName = "queryINNFLGR_OUT")
    public GroupQuery groupQuery(@WebParam(partName = "queryINNFLGR_IN", name = "queryINNFLGR", targetNamespace = "http://ws.unisoft/")
                                      InnGroupQueryRequest request);

    @WebMethod(action = "getINNFLGR", operationName = "getINNFLGR")
    @WebResult(name = "getINNFLGRResponse", targetNamespace = "http://ws.unisoft/", partName = "getINNFLGR_OUT")
    public GroupGet groupGet(@WebParam(partName = "getINNFLGR_IN", name = "getINNFLGR", targetNamespace = "http://ws.unisoft/")
                                 InnGroupGetRequest request);

/*    @RequestWrapper(localName = "getINNFLGR", targetNamespace = "http://ws.unisoft/", className = "ru.gosuslugi.smev.rev111111.ZPINNFLGR")
    @WebMethod(action = "getINNFLGR")
    @ResponseWrapper(localName = "getINNFLGRResponse", targetNamespace = "http://ws.unisoft/", className = "ru.gosuslugi.smev.rev111111.OTINNFLGR")
    public void getINNFLGR();*/

    @WebResult(name = "TestResponse", targetNamespace = "http://ws.unisoft/", partName = "TestRequest_OUT")
    @WebMethod(action = "test")
    public java.lang.String test(
            @WebParam(partName = "TestRequest_IN", name = "TestRequest", targetNamespace = "http://ws.unisoft/")
            java.lang.String testRequestIN
    );
}
