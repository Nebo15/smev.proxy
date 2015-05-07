package ru.synq.smev.services;

import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.gosuslugi.smev.rev111111.INNFLRs;
import ru.gosuslugi.smev.rev111111.MessageType;
import ru.synq.smev.services.inn.InnPort;
import ru.synq.smev.services.inn.InnService;
import ru.synq.smev.services.inn.bind.InnAppData;
import ru.synq.smev.services.inn.bind.InnFlRequest;
import ru.synq.smev.services.inn.bind.InnMessageData;
import ru.synq.smev.services.inn.bind.individual.InnIndividualDocument;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.validation.Valid;
import java.util.UUID;

/**
 * Наименование:
 * Сервис предоставления сведений об ИНН физического лица на основании полных паспортных данных по запросу органов
 * государственной власти
 * Назначение:
 * Сервис предназначен для обеспечения возможности взаимодействия органов исполнительной власти с электронным сервисом
 * ФНС России, предоставляющим сведения об ИНН ФЛ, содержащиеся в Едином государственном реестре налогоплательщиков,
 * в рамках единой системы межведомственного электронного взаимодействия (СМЭВ)
 */
@RestController
@RequestMapping({"inn","SID0003450"})
public class InnController {
    @Autowired WSS4JOutInterceptor wss4JOutInterceptor;
    @Inject @Qualifier("innMessage") Provider<MessageType> messageProvider;
    @Value("${skip-cxf-init:false}") boolean skipCxfInitFlag;

    /**
     * Код: queryINNFL
     * Наименование: определение ИНН ФЛ по сведениям о физическом лице по единичному запросу.
     * Назначение:
     Передача запроса для определения ИНН ФЛ в формате XML и получение результата обработки запроса в виде строки, содержащей:
     - значение ИНН ФЛ
     либо
     - строку с xml <noreturn КодОбр="90"> (по заданным сведениям о ФЛ не найдено ни одного либо найдено несколько ИНН ФЛ).
     */
    @RequestMapping
    public INNFLRs queryGet(@Valid InnIndividualDocument doc) {
        return query(doc);
    }

    @RequestMapping(method = RequestMethod.POST)
    public INNFLRs query(@Valid @RequestBody InnIndividualDocument doc) {
        doc.setИдЗапрос(UUID.randomUUID().toString());
        final InnPort port = getPort();
        final InnFlRequest inn = new InnFlRequest();
        InnAppData appData = new InnAppData();
        appData.setДокумент(doc);
        InnMessageData mData = new InnMessageData();
        mData.setAppData(appData);
        inn.setMessageData(mData);
        inn.setMessage(messageProvider.get());
        return port.queryINNFL(inn);
    }

    /**
     * Код: queryINNFLGR
     * Наименование: передача группового запроса для определения ИНН ФЛ по сведениям о физическом лице.
     * Назначение:
     * Передача группового запроса для определения ИНН ФЛ в формате XML и получение строки с идентификатором группы запросов.
     */
    @RequestMapping("group/query")
    public void groupQuery() {

    }

    /**
     * Код: getINNFLGR
     * Наименование: получение результатов обработки группового запроса для определения ИНН ФЛ.
     * Назначение:
     * Передача идентификатора группы запросов в формате XML и получение результата обработки запроса:
     - в формате XML результата обработки группового запроса для определения ИНН ФЛ
     либо
     - в виде строки с xml <noreturn КодОбр="91"> (групповой запрос не найден) или с xml <noreturn КодОбр="92"> (групповой запрос не обработан)
     */
    @RequestMapping("group/get")
    public void groupGet() {

    }

/*    @RequestMapping("test")
    @Autowired
    public SnilsValidationResponseType test(MessageType message) {
        HeaderType smevHeader = new HeaderType();
        SnilsValidationRequestType parameters = new SnilsValidationRequestType();
        parameters.setMessage(message);
        MessageDataType messageData = new MessageDataType();
        AppDataType appData = new AppDataType();
        // SnilsValidationRequestType does not has request property
        messageData.setAppData(appData);
        parameters.setMessageData(messageData);
        return request(smevHeader, parameters);
    }*/

    protected InnPort getPort() {
        InnService service = new InnService();
        InnPort port = service.getFNSINNSvc24Port();
        if (!skipCxfInitFlag) {
            ClientProxy.getClient(port).getOutInterceptors().add(wss4JOutInterceptor);
        }
        return port;
    }
}
