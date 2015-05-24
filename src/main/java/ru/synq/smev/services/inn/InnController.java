package ru.synq.smev.services.inn;

import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import ru.gosuslugi.smev.rev111111.MessageType;
import ru.synq.smev.Environment;
import ru.synq.smev.Response;
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

import static ru.synq.smev.MapBuilder.map;

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
@RequestMapping("{env}/inn")
public class InnController {
    @Value("${skip-cxf-init:false}") boolean skipCxfInitFlag;
    @Autowired @Qualifier("testConfig") WSS4JOutInterceptor testWss4JOutInterceptor;
    @Autowired @Qualifier("prodConfig") WSS4JOutInterceptor prodWss4JOutInterceptor;
    @Inject @Qualifier("innMessage") Provider<MessageType> messageProvider;

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
    public Response queryGet(@Valid InnIndividualDocument doc, @PathVariable Environment env) {
        return query(doc, env);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Response query(@Valid @RequestBody InnIndividualDocument doc, @PathVariable Environment env) {
        doc.setИдЗапрос(UUID.randomUUID().toString());
        final InnPort port = getPort(env);
        final InnIndividualRequest inn = new InnIndividualRequest();
        InnIndividualAppData appData = new InnIndividualAppData();
        appData.setДокумент(doc);
        InnIndividualMessageData mData = new InnIndividualMessageData();
        mData.setAppData(appData);
        inn.setMessageData(mData);
        inn.setMessage(messageProvider.get());
        final InnResponse.AppData response = port.queryIndividual(inn).messageData.appData;
        if (response.noreturn != null) {
            return presentError(response.noreturn);
        }
        return Response.data(response.returnValue);
    }

    private Response presentError(InnResponse.AppData.NoReturn noreturn) {
        String message = "undefined";
        switch (noreturn.code) {
            case "90": message = "по заданным сведениям о ФЛ не найдено ни одного либо найдено несколько ИНН ФЛ"; break;
            case "91": message = "групповой запрос не найден"; break;
            case "92": message = "групповой запрос не обработан"; break;
        }
        return Response.data(map().put("error",
                map().put("code", noreturn.code).put("message", message)));
    }

    /**
     * Код: queryINNFLGR
     * Наименование: передача группового запроса для определения ИНН ФЛ по сведениям о физическом лице.
     * Назначение:
     * Передача группового запроса для определения ИНН ФЛ в формате XML и получение строки с идентификатором группы запросов.
     */
    @RequestMapping(value = "group", method = RequestMethod.POST)
    public Response groupQuery(@Valid @RequestBody InnGroupDocument doc, @PathVariable Environment env) {
        final InnResponse.AppData response = internalGroupQuery(doc, env);
        if (response.noreturn != null) {
            return presentError(response.noreturn);
        }
        return Response.data(response.returnValue);
    }

    public InnResponse.AppData internalGroupQuery(InnGroupDocument doc, @PathVariable Environment env) {
        if (doc.getИдПакетЗапрос() == null)
        for (InnGroupDocument.Запрос request : doc.getЗапрос()) {
            request.setIndex(String.valueOf(doc.getЗапрос().indexOf(request)+1));
        }
        final InnPort port = getPort(env);
        final InnGroupRequest inn = new InnGroupRequest();
        InnGroupAppData appData = new InnGroupAppData();
        appData.setДокумент(doc);
        InnGroupMessageData mData = new InnGroupMessageData();
        mData.setAppData(appData);
        inn.setMessageData(mData);
        inn.setMessage(messageProvider.get());
        return port.queryGroup(inn).messageData.appData;
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
    public Response groupGet(@PathVariable String id, @PathVariable Environment env) {
        InnGroupDocument doc = new InnGroupDocument(id);
        final InnResponse.AppData response = internalGroupQuery(doc, env);
        if (response.noreturn != null) {
            return presentError(response.noreturn);
        }
        return Response.data(response.doc.getОтвет());
    }

    protected InnPort getPort(Environment env) {
        InnService service = new InnService();
        InnPort port = service.getFNSINNSvc24Port();
        if (!skipCxfInitFlag) {
            ClientProxy.getClient(port).getOutInterceptors().add(env.isProd() ? prodWss4JOutInterceptor : testWss4JOutInterceptor);
        }
        return port;
    }
}
