package ru.synq.smev.soap;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

public class EncodingOutInterceptor extends AbstractPhaseInterceptor<Message> {
    public EncodingOutInterceptor() {
        super(Phase.PRE_STREAM_ENDING);
    }

    public void handleMessage(Message message) throws Fault {
        message.put(Message.ENCODING, "UTF-8");
    }
}
