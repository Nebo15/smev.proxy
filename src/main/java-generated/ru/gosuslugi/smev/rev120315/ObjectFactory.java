
package ru.gosuslugi.smev.rev120315;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.gosuslugi.smev.rev120315 package. 
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

    private final static QName _DigestValue_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "DigestValue");
    private final static QName _Originator_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "Originator");
    private final static QName _AppDocument_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "AppDocument");
    private final static QName _Message_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "Message");
    private final static QName _BinaryData_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "BinaryData");
    private final static QName _AppData_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "AppData");
    private final static QName _SubRequestNumber_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "SubRequestNumber");
    private final static QName _SubMessages_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "SubMessages");
    private final static QName _TimeStamp_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "TimeStamp");
    private final static QName _Status_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "Status");
    private final static QName _BaseMessage_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "BaseMessage");
    private final static QName _Reference_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "Reference");
    private final static QName _Id_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "Id");
    private final static QName _SubMessage_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "SubMessage");
    private final static QName _RequestCode_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "RequestCode");
    private final static QName _Service_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "Service");
    private final static QName _MessageClass_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "MessageClass");
    private final static QName _OKTMO_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "OKTMO");
    private final static QName _TestMsg_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "TestMsg");
    private final static QName _MessageData_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "MessageData");
    private final static QName _NodeId_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "NodeId");
    private final static QName _Sender_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "Sender");
    private final static QName _ExchangeType_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "ExchangeType");
    private final static QName _RequestIdRef_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "RequestIdRef");
    private final static QName _PacketIds_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "PacketIds");
    private final static QName _MessageId_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "MessageId");
    private final static QName _ServiceName_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "ServiceName");
    private final static QName _Header_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "Header");
    private final static QName _TypeCode_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "TypeCode");
    private final static QName _Date_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "Date");
    private final static QName _ServiceCode_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "ServiceCode");
    private final static QName _OriginRequestIdRef_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "OriginRequestIdRef");
    private final static QName _Recipient_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "Recipient");
    private final static QName _CaseNumber_QNAME = new QName("http://smev.gosuslugi.ru/rev120315", "CaseNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.gosuslugi.smev.rev120315
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link PacketIdsType }
     * 
     */
    public PacketIdsType createPacketIdsType() {
        return new PacketIdsType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link MessageType }
     * 
     */
    public MessageType createMessageType() {
        return new MessageType();
    }

    /**
     * Create an instance of {@link OrgExternalType }
     * 
     */
    public OrgExternalType createOrgExternalType() {
        return new OrgExternalType();
    }

    /**
     * Create an instance of {@link PacketIdType }
     * 
     */
    public PacketIdType createPacketIdType() {
        return new PacketIdType();
    }

    /**
     * Create an instance of {@link SubMessageType }
     * 
     */
    public SubMessageType createSubMessageType() {
        return new SubMessageType();
    }

    /**
     * Create an instance of {@link BaseMessageType }
     * 
     */
    public BaseMessageType createBaseMessageType() {
        return new BaseMessageType();
    }

    /**
     * Create an instance of {@link SubMessagesType }
     * 
     */
    public SubMessagesType createSubMessagesType() {
        return new SubMessagesType();
    }

    /**
     * Create an instance of {@link AppDocumentType }
     * 
     */
    public AppDocumentType createAppDocumentType() {
        return new AppDocumentType();
    }

    /**
     * Create an instance of {@link SnilsValidationRequestType }
     * 
     */
    public SnilsValidationRequestType createSnilsValidationRequestType() {
        return new SnilsValidationRequestType();
    }

    /**
     * Create an instance of {@link MessageDataType }
     * 
     */
    public MessageDataType createMessageDataType() {
        return new MessageDataType();
    }

    /**
     * Create an instance of {@link ServiceType }
     * 
     */
    public ServiceType createServiceType() {
        return new ServiceType();
    }

    /**
     * Create an instance of {@link AppDataType }
     * 
     */
    public AppDataType createAppDataType() {
        return new AppDataType();
    }

    /**
     * Create an instance of {@link SnilsValidationResponseType }
     * 
     */
    public SnilsValidationResponseType createSnilsValidationResponseType() {
        return new SnilsValidationResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "DigestValue")
    public JAXBElement<byte[]> createDigestValue(byte[] value) {
        return new JAXBElement<byte[]>(_DigestValue_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrgExternalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "Originator")
    public JAXBElement<OrgExternalType> createOriginator(OrgExternalType value) {
        return new JAXBElement<OrgExternalType>(_Originator_QNAME, OrgExternalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "AppDocument")
    public JAXBElement<AppDocumentType> createAppDocument(AppDocumentType value) {
        return new JAXBElement<AppDocumentType>(_AppDocument_QNAME, AppDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "Message")
    public JAXBElement<MessageType> createMessage(MessageType value) {
        return new JAXBElement<MessageType>(_Message_QNAME, MessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "BinaryData")
    public JAXBElement<byte[]> createBinaryData(byte[] value) {
        return new JAXBElement<byte[]>(_BinaryData_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "AppData")
    public JAXBElement<AppDataType> createAppData(AppDataType value) {
        return new JAXBElement<AppDataType>(_AppData_QNAME, AppDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "SubRequestNumber")
    public JAXBElement<String> createSubRequestNumber(String value) {
        return new JAXBElement<String>(_SubRequestNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubMessagesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "SubMessages")
    public JAXBElement<SubMessagesType> createSubMessages(SubMessagesType value) {
        return new JAXBElement<SubMessagesType>(_SubMessages_QNAME, SubMessagesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "TimeStamp")
    public JAXBElement<XMLGregorianCalendar> createTimeStamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TimeStamp_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "Status")
    public JAXBElement<StatusType> createStatus(StatusType value) {
        return new JAXBElement<StatusType>(_Status_QNAME, StatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "BaseMessage")
    public JAXBElement<BaseMessageType> createBaseMessage(BaseMessageType value) {
        return new JAXBElement<BaseMessageType>(_BaseMessage_QNAME, BaseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "Reference")
    public JAXBElement<ReferenceType> createReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_Reference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PacketIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "Id")
    public JAXBElement<PacketIdType> createId(PacketIdType value) {
        return new JAXBElement<PacketIdType>(_Id_QNAME, PacketIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "SubMessage")
    public JAXBElement<SubMessageType> createSubMessage(SubMessageType value) {
        return new JAXBElement<SubMessageType>(_SubMessage_QNAME, SubMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "RequestCode")
    public JAXBElement<String> createRequestCode(String value) {
        return new JAXBElement<String>(_RequestCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "Service")
    public JAXBElement<ServiceType> createService(ServiceType value) {
        return new JAXBElement<ServiceType>(_Service_QNAME, ServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageClassType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "MessageClass")
    public JAXBElement<MessageClassType> createMessageClass(MessageClassType value) {
        return new JAXBElement<MessageClassType>(_MessageClass_QNAME, MessageClassType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "OKTMO")
    public JAXBElement<String> createOKTMO(String value) {
        return new JAXBElement<String>(_OKTMO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "TestMsg")
    public JAXBElement<String> createTestMsg(String value) {
        return new JAXBElement<String>(_TestMsg_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "MessageData")
    public JAXBElement<MessageDataType> createMessageData(MessageDataType value) {
        return new JAXBElement<MessageDataType>(_MessageData_QNAME, MessageDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "NodeId")
    public JAXBElement<String> createNodeId(String value) {
        return new JAXBElement<String>(_NodeId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrgExternalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "Sender")
    public JAXBElement<OrgExternalType> createSender(OrgExternalType value) {
        return new JAXBElement<OrgExternalType>(_Sender_QNAME, OrgExternalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "ExchangeType")
    public JAXBElement<String> createExchangeType(String value) {
        return new JAXBElement<String>(_ExchangeType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "RequestIdRef")
    public JAXBElement<String> createRequestIdRef(String value) {
        return new JAXBElement<String>(_RequestIdRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PacketIdsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "PacketIds")
    public JAXBElement<PacketIdsType> createPacketIds(PacketIdsType value) {
        return new JAXBElement<PacketIdsType>(_PacketIds_QNAME, PacketIdsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "MessageId")
    public JAXBElement<String> createMessageId(String value) {
        return new JAXBElement<String>(_MessageId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "ServiceName")
    public JAXBElement<String> createServiceName(String value) {
        return new JAXBElement<String>(_ServiceName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "Header")
    public JAXBElement<HeaderType> createHeader(HeaderType value) {
        return new JAXBElement<HeaderType>(_Header_QNAME, HeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "TypeCode")
    public JAXBElement<TypeCodeType> createTypeCode(TypeCodeType value) {
        return new JAXBElement<TypeCodeType>(_TypeCode_QNAME, TypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "Date")
    public JAXBElement<XMLGregorianCalendar> createDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_Date_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "ServiceCode")
    public JAXBElement<String> createServiceCode(String value) {
        return new JAXBElement<String>(_ServiceCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "OriginRequestIdRef")
    public JAXBElement<String> createOriginRequestIdRef(String value) {
        return new JAXBElement<String>(_OriginRequestIdRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrgExternalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "Recipient")
    public JAXBElement<OrgExternalType> createRecipient(OrgExternalType value) {
        return new JAXBElement<OrgExternalType>(_Recipient_QNAME, OrgExternalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smev.gosuslugi.ru/rev120315", name = "CaseNumber")
    public JAXBElement<String> createCaseNumber(String value) {
        return new JAXBElement<String>(_CaseNumber_QNAME, String.class, null, value);
    }

}
