
package ru.fms.sx.kernel.webservices.incomingrequests.v2_4_3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.gosuslugi.smev.rev111111.BookRequestResponseMessage;
import ru.gosuslugi.smev.rev111111.GetDictionaryValuesMessage;
import ru.gosuslugi.smev.rev111111.GetDictionaryValuesResponseMessage;
import ru.gosuslugi.smev.rev111111.GetResultMessage;
import ru.gosuslugi.smev.rev111111.GetResultResponseMessage;
import ru.gosuslugi.smev.rev111111.GetTaskTypesMessage;
import ru.gosuslugi.smev.rev111111.GetTaskTypesResponseMessage;
import ru.gosuslugi.smev.rev111111.ProcessTaskResponseMessage;
import ru.gosuslugi.smev.rev111111.SendErrorReportMessage;
import ru.gosuslugi.smev.rev111111.SendErrorReportResponseMessage;
import ru.gosuslugi.smev.rev111111.ServiceRequestMessage;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.fms.sx.kernel.webservices.incomingrequests.v2_4_3 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BookRequestResponse_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "bookRequestResponse");
    private final static QName _SendErrorReport_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "sendErrorReport");
    private final static QName _GetResult_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "getResult");
    private final static QName _GetDictionaryValues_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "getDictionaryValues");
    private final static QName _GetDictionaryValuesResponse_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "getDictionaryValuesResponse");
    private final static QName _ProcessTask_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "processTask");
    private final static QName _GetResultResponse_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "getResultResponse");
    private final static QName _BookRequest_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "bookRequest");
    private final static QName _GetTaskTypesResponse_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "getTaskTypesResponse");
    private final static QName _ProcessTaskResponse_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "processTaskResponse");
    private final static QName _SendErrorReportResponse_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "sendErrorReportResponse");
    private final static QName _GetTaskTypes_QNAME = new QName("http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", "getTaskTypes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.fms.sx.kernel.webservices.incomingrequests.v2_4_3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookRequestResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "bookRequestResponse")
    public JAXBElement<BookRequestResponseMessage> createBookRequestResponse(BookRequestResponseMessage value) {
        return new JAXBElement<BookRequestResponseMessage>(_BookRequestResponse_QNAME, BookRequestResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendErrorReportMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "sendErrorReport")
    public JAXBElement<SendErrorReportMessage> createSendErrorReport(SendErrorReportMessage value) {
        return new JAXBElement<SendErrorReportMessage>(_SendErrorReport_QNAME, SendErrorReportMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "getResult")
    public JAXBElement<GetResultMessage> createGetResult(GetResultMessage value) {
        return new JAXBElement<GetResultMessage>(_GetResult_QNAME, GetResultMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDictionaryValuesMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "getDictionaryValues")
    public JAXBElement<GetDictionaryValuesMessage> createGetDictionaryValues(GetDictionaryValuesMessage value) {
        return new JAXBElement<GetDictionaryValuesMessage>(_GetDictionaryValues_QNAME, GetDictionaryValuesMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDictionaryValuesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "getDictionaryValuesResponse")
    public JAXBElement<GetDictionaryValuesResponseMessage> createGetDictionaryValuesResponse(GetDictionaryValuesResponseMessage value) {
        return new JAXBElement<GetDictionaryValuesResponseMessage>(_GetDictionaryValuesResponse_QNAME, GetDictionaryValuesResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "processTask")
    public JAXBElement<ServiceRequestMessage> createProcessTask(ServiceRequestMessage value) {
        return new JAXBElement<ServiceRequestMessage>(_ProcessTask_QNAME, ServiceRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "getResultResponse")
    public JAXBElement<GetResultResponseMessage> createGetResultResponse(GetResultResponseMessage value) {
        return new JAXBElement<GetResultResponseMessage>(_GetResultResponse_QNAME, GetResultResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "bookRequest")
    public JAXBElement<ServiceRequestMessage> createBookRequest(ServiceRequestMessage value) {
        return new JAXBElement<ServiceRequestMessage>(_BookRequest_QNAME, ServiceRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaskTypesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "getTaskTypesResponse")
    public JAXBElement<GetTaskTypesResponseMessage> createGetTaskTypesResponse(GetTaskTypesResponseMessage value) {
        return new JAXBElement<GetTaskTypesResponseMessage>(_GetTaskTypesResponse_QNAME, GetTaskTypesResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessTaskResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "processTaskResponse")
    public JAXBElement<ProcessTaskResponseMessage> createProcessTaskResponse(ProcessTaskResponseMessage value) {
        return new JAXBElement<ProcessTaskResponseMessage>(_ProcessTaskResponse_QNAME, ProcessTaskResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendErrorReportResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "sendErrorReportResponse")
    public JAXBElement<SendErrorReportResponseMessage> createSendErrorReportResponse(SendErrorReportResponseMessage value) {
        return new JAXBElement<SendErrorReportResponseMessage>(_SendErrorReportResponse_QNAME, SendErrorReportResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaskTypesMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru", name = "getTaskTypes")
    public JAXBElement<GetTaskTypesMessage> createGetTaskTypes(GetTaskTypesMessage value) {
        return new JAXBElement<GetTaskTypesMessage>(_GetTaskTypes_QNAME, GetTaskTypesMessage.class, null, value);
    }

}
