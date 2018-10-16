
package report;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the report package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CantidadCurso_QNAME = new QName("http://Reporte/", "cantidadCurso");
    private final static QName _CantidadCursoResponse_QNAME = new QName("http://Reporte/", "cantidadCursoResponse");
    private final static QName _CantidadDocente_QNAME = new QName("http://Reporte/", "cantidadDocente");
    private final static QName _CantidadDocenteResponse_QNAME = new QName("http://Reporte/", "cantidadDocenteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: report
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CantidadDocenteResponse }
     * 
     */
    public CantidadDocenteResponse createCantidadDocenteResponse() {
        return new CantidadDocenteResponse();
    }

    /**
     * Create an instance of {@link CantidadDocente }
     * 
     */
    public CantidadDocente createCantidadDocente() {
        return new CantidadDocente();
    }

    /**
     * Create an instance of {@link CantidadCurso }
     * 
     */
    public CantidadCurso createCantidadCurso() {
        return new CantidadCurso();
    }

    /**
     * Create an instance of {@link CantidadCursoResponse }
     * 
     */
    public CantidadCursoResponse createCantidadCursoResponse() {
        return new CantidadCursoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantidadCurso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Reporte/", name = "cantidadCurso")
    public JAXBElement<CantidadCurso> createCantidadCurso(CantidadCurso value) {
        return new JAXBElement<CantidadCurso>(_CantidadCurso_QNAME, CantidadCurso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantidadCursoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Reporte/", name = "cantidadCursoResponse")
    public JAXBElement<CantidadCursoResponse> createCantidadCursoResponse(CantidadCursoResponse value) {
        return new JAXBElement<CantidadCursoResponse>(_CantidadCursoResponse_QNAME, CantidadCursoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantidadDocente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Reporte/", name = "cantidadDocente")
    public JAXBElement<CantidadDocente> createCantidadDocente(CantidadDocente value) {
        return new JAXBElement<CantidadDocente>(_CantidadDocente_QNAME, CantidadDocente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantidadDocenteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Reporte/", name = "cantidadDocenteResponse")
    public JAXBElement<CantidadDocenteResponse> createCantidadDocenteResponse(CantidadDocenteResponse value) {
        return new JAXBElement<CantidadDocenteResponse>(_CantidadDocenteResponse_QNAME, CantidadDocenteResponse.class, null, value);
    }

}
