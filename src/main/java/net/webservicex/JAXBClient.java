package net.webservicex;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class JAXBClient {

    public ConvertSpeedsSoap client;

    public JAXBClient() {

        try {
            URL url = new URL("http://www.webservicex.net/ConvertSpeed.asmx?wsdl");

            QName qname = new QName("http://www.webservicex.net/", "ConvertSpeeds");

            Service service = Service.create(url, qname);

            //service.setHandlerResolver(new JaxWsHandlerResolver());
            client = service.getPort(ConvertSpeedsSoap.class);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
