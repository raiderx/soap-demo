
package org.soapdemo.client.generated;

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
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "SoapDemoWebServiceService", targetNamespace = "http://server.soapdemo.org/", wsdlLocation = "http://localhost:8080/soap-demo?wsdl")
public class SoapDemoWebServiceService
    extends Service
{

    private final static URL SOAPDEMOWEBSERVICESERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.soapdemo.client.generated.SoapDemoWebServiceService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.soapdemo.client.generated.SoapDemoWebServiceService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/soap-demo?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/soap-demo?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        SOAPDEMOWEBSERVICESERVICE_WSDL_LOCATION = url;
    }

    public SoapDemoWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SoapDemoWebServiceService() {
        super(SOAPDEMOWEBSERVICESERVICE_WSDL_LOCATION, new QName("http://server.soapdemo.org/", "SoapDemoWebServiceService"));
    }

    /**
     * 
     * @return
     *     returns SoapDemoWebService
     */
    @WebEndpoint(name = "SoapDemoWebServicePort")
    public SoapDemoWebService getSoapDemoWebServicePort() {
        return super.getPort(new QName("http://server.soapdemo.org/", "SoapDemoWebServicePort"), SoapDemoWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SoapDemoWebService
     */
    @WebEndpoint(name = "SoapDemoWebServicePort")
    public SoapDemoWebService getSoapDemoWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.soapdemo.org/", "SoapDemoWebServicePort"), SoapDemoWebService.class, features);
    }

}