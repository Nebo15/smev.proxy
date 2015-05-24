
package ru.synq.smev.services.inn;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import ru.gosuslugi.smev.rev111111.MessageType;
import unisoft.ws.fnsinn.response.Документ;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class InnResponse {
    private static final String NS = "http://smev.gosuslugi.ru/rev111111";

    @XmlElement(name = "Message", required = true, namespace = NS)
    public MessageType message;
    @XmlElement(name = "MessageData", required = true, namespace = NS)
    public MessageData messageData;


    public static class MessageData {
        @XmlElement(name = "AppData", namespace = NS)
        public AppData appData;
    }

    @JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
    public static class AppData {
        @XmlElement(name = "noreturn", namespace = NS)
        public NoReturn noreturn;
        @XmlElement(name = "return", namespace = NS)
        public String returnValue;
        @XmlElement(name = "Документ", namespace = "http://ws.unisoft/FNSINN/response")
        public Документ doc;

        public static class NoReturn {
            @XmlAttribute(name = "КодОбр")
            public String code;
        }
    }
}
