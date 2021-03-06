
package formSoap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WebServiceCurso", targetNamespace = "http://WebServiceCurso/", wsdlLocation = "http://35.197.30.148:8080/AyD2F3/WebServiceCurso?wsdl")
public class WebServiceCurso_Service
    extends Service
{

    private final static URL WEBSERVICECURSO_WSDL_LOCATION;
    private final static WebServiceException WEBSERVICECURSO_EXCEPTION;
    private final static QName WEBSERVICECURSO_QNAME = new QName("http://WebServiceCurso/", "WebServiceCurso");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://35.197.30.148:8080/AyD2F3/WebServiceCurso?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVICECURSO_WSDL_LOCATION = url;
        WEBSERVICECURSO_EXCEPTION = e;
    }

    public WebServiceCurso_Service() {
        super(__getWsdlLocation(), WEBSERVICECURSO_QNAME);
    }

    public WebServiceCurso_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVICECURSO_QNAME, features);
    }

    public WebServiceCurso_Service(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVICECURSO_QNAME);
    }

    public WebServiceCurso_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVICECURSO_QNAME, features);
    }

    public WebServiceCurso_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebServiceCurso_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebServiceCurso
     */
    @WebEndpoint(name = "WebServiceCursoPort")
    public WebServiceCurso getWebServiceCursoPort() {
        return super.getPort(new QName("http://WebServiceCurso/", "WebServiceCursoPort"), WebServiceCurso.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceCurso
     */
    @WebEndpoint(name = "WebServiceCursoPort")
    public WebServiceCurso getWebServiceCursoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebServiceCurso/", "WebServiceCursoPort"), WebServiceCurso.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVICECURSO_EXCEPTION!= null) {
            throw WEBSERVICECURSO_EXCEPTION;
        }
        return WEBSERVICECURSO_WSDL_LOCATION;
    }

}
