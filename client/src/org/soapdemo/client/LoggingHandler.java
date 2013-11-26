package org.soapdemo.client;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.PrintStream;
import java.util.Set;

/**
 * Обработчик SOAP сообщений
 * Записывает сообщения в System.out
 * @author Pavel Karpukhin
 * @since 25.06.13
 */
public class LoggingHandler implements SOAPHandler<SOAPMessageContext> {

    private PrintStream stream;

    public LoggingHandler(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        logToSystemOut(context);
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        logToSystemOut(context);
        return true;
    }

    @Override
    public void close(MessageContext context) {
    }

    private void logToSystemOut(SOAPMessageContext smc) {
        Boolean outboundProperty = (Boolean)
                smc.get (MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        if (outboundProperty.booleanValue()) {
            stream.println("Request:");
        } else {
            stream.println("Response:");
        }

        SOAPMessage message = smc.getMessage();
        try {
            message.writeTo(stream);
            stream.println("");               // just to add a newline
        } catch (Exception e) {
            stream.println("Exception in handler: " + e);
        }
    }
}
