package ru.synq.smev.services.inn.group;

import ru.gosuslugi.smev.rev111111.MessageType;

public interface InnGroupRequest {
    void setMessageData(InnGroupMessageData mData);

    void setMessage(MessageType messageType);

    InnGroupMessageData createMessageData();

    InnGroupAppData createAppData();
}
