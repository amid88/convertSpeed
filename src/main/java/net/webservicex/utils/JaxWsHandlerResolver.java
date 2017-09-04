package net.webservicex.utils;

import java.util.ArrayList;
import java.util.List;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

public class JaxWsHandlerResolver implements HandlerResolver{
    @Override
    public List<Handler> getHandlerChain(PortInfo portInfo) {
        List<Handler> hchain = new ArrayList<Handler>();
        hchain.add(new SoapClientHandlerLog());
        return hchain;
    }
}
