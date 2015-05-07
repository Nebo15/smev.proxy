package ru.synq.smev.services.inn;

import ru.gosuslugi.smev.rev111111.INNFLRs;
import ru.synq.smev.services.inn.bind.group.InnGroupRequest;
import ru.synq.smev.services.inn.bind.individual.InnIndividualRequest;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.ResponseWrapper;


@WebService(targetNamespace = "http://ws.unisoft/", name = "FNSINNSvc_24Port")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface InnPort {

//    @RequestWrapper(localName = "queryINNFL", targetNamespace = "http://ws.unisoft/", className = "ru.synq.smev.soap.inn.INNFL")
    @WebMethod(operationName = "queryINNFL")
    @ResponseWrapper(localName = "queryINNFLResponse", targetNamespace = "http://ws.unisoft/", className = "ru.gosuslugi.smev.rev111111.INNFLRs")
    public INNFLRs queryIndividual(@WebParam(name = "queryINNFL", targetNamespace = "http://ws.unisoft/") InnIndividualRequest baseMessage);

    @WebMethod(operationName = "queryINNFLGR")
    @ResponseWrapper(localName = "queryINNFLGRResponse", targetNamespace = "http://ws.unisoft/", className = "ru.gosuslugi.smev.rev111111.INNFLGRRs")
    public INNFLRs queryGroup(@WebParam(name = "queryINNFLGR", targetNamespace = "http://ws.unisoft/") InnGroupRequest baseMessage);
}
