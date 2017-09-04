
package net.webservicex;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ConvertSpeeds", targetNamespace = "http://www.webserviceX.NET/", wsdlLocation = "http://www.webservicex.net/ConvertSpeed.asmx?WSDL")
public class ConvertSpeeds
    extends Service
{

    private final static URL CONVERTSPEEDS_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(ConvertSpeeds.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = ConvertSpeeds.class.getResource(".");
            url = new URL(baseUrl, "http://www.webservicex.net/ConvertSpeed.asmx?WSDL");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://www.webservicex.net/ConvertSpeed.asmx?WSDL', retrying as a local file");
            logger.warning(e.getMessage());
        }
        CONVERTSPEEDS_WSDL_LOCATION = url;
    }

    public ConvertSpeeds(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConvertSpeeds() {
        super(CONVERTSPEEDS_WSDL_LOCATION, new QName("http://www.webserviceX.NET/", "ConvertSpeeds"));
    }

    /**
     *
     * @return
     *     returns ConvertSpeedsSoap
     */
    @WebEndpoint(name = "ConvertSpeedsSoap")
    public ConvertSpeedsSoap getConvertSpeedsSoap() {
        return super.getPort(new QName("http://www.webserviceX.NET/", "ConvertSpeedsSoap"), ConvertSpeedsSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConvertSpeedsSoap
     */
    @WebEndpoint(name = "ConvertSpeedsSoap")
    public ConvertSpeedsSoap getConvertSpeedsSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET/", "ConvertSpeedsSoap"), ConvertSpeedsSoap.class, features);
    }

}
