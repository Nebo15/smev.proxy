package ru.synq.smev.services.inn;

import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import ru.gosuslugi.smev.rev111111.INNFLRs;
import ru.gosuslugi.smev.rev111111.MessageType;
import ru.synq.smev.services.inn.group.InnGroupAppData;
import ru.synq.smev.services.inn.group.InnGroupDocument;
import ru.synq.smev.services.inn.group.InnGroupMessageData;
import ru.synq.smev.services.inn.group.InnGroupRequest;
import ru.synq.smev.services.inn.individual.InnIndividualAppData;
import ru.synq.smev.services.inn.individual.InnIndividualDocument;
import ru.synq.smev.services.inn.individual.InnIndividualMessageData;
import ru.synq.smev.services.inn.individual.InnIndividualRequest;

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
        final InnIndividualRequest inn = new InnIndividualRequest();
        InnIndividualAppData appData = new InnIndividualAppData();
        appData.setДокумент(doc);
        InnIndividualMessageData mData = new InnIndividualMessageData();
        mData.setAppData(appData);
        inn.setMessageData(mData);
        inn.setMessage(messageProvider.get());
        return port.queryIndividual(inn);
    }

    /**
     * Код: queryINNFLGR
     * Наименование: передача группового запроса для определения ИНН ФЛ по сведениям о физическом лице.
     * Назначение:
     * Передача группового запроса для определения ИНН ФЛ в формате XML и получение строки с идентификатором группы запросов.
     */
    @RequestMapping(value = "group", method = RequestMethod.POST)
    public INNFLRs groupQuery(@Valid @RequestBody InnGroupDocument doc) {
        if (doc.getИдПакетЗапрос() == null)
        for (InnGroupDocument.Запрос request : doc.getЗапрос()) {
            request.setIndex(String.valueOf(doc.getЗапрос().indexOf(request)+1));
        }
        final InnPort port = getPort();
        final InnGroupRequest inn = new InnGroupRequest();
        InnGroupAppData appData = new InnGroupAppData();
        appData.setДокумент(doc);
        InnGroupMessageData mData = new InnGroupMessageData();
        mData.setAppData(appData);
        inn.setMessageData(mData);
        inn.setMessage(messageProvider.get());
        return port.queryGroup(inn);
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
    @RequestMapping("group/{id:\\d+}")
    public INNFLRs groupGet(@PathVariable String id) {
        InnGroupDocument doc = new InnGroupDocument(id);
        return groupQuery(doc);
    }

    protected InnPort getPort() {
        InnService service = new InnService();
        InnPort port = service.getFNSINNSvc24Port();
        if (!skipCxfInitFlag) {
            ClientProxy.getClient(port).getOutInterceptors().add(wss4JOutInterceptor);
        }
        return port;
    }
}
