
package formSoap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the formSoap package. 
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

    private final static QName _BuscarCursoIdResponse_QNAME = new QName("http://WebServiceCurso/", "buscarCurso_IdResponse");
    private final static QName _ListaDocenteCursoResponse_QNAME = new QName("http://WebServiceCurso/", "listaDocenteCursoResponse");
    private final static QName _AgregarCurso_QNAME = new QName("http://WebServiceCurso/", "agregarCurso");
    private final static QName _BuscarCursoNombreResponse_QNAME = new QName("http://WebServiceCurso/", "buscarCurso_nombreResponse");
    private final static QName _AgregarCursoResponse_QNAME = new QName("http://WebServiceCurso/", "agregarCursoResponse");
    private final static QName _Listacurso_QNAME = new QName("http://WebServiceCurso/", "listacurso");
    private final static QName _BuscarCursoId_QNAME = new QName("http://WebServiceCurso/", "buscarCurso_Id");
    private final static QName _ListacursoResponse_QNAME = new QName("http://WebServiceCurso/", "listacursoResponse");
    private final static QName _ListaDocenteCurso_QNAME = new QName("http://WebServiceCurso/", "listaDocenteCurso");
    private final static QName _BuscarCursoNombre_QNAME = new QName("http://WebServiceCurso/", "buscarCurso_nombre");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: formSoap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarCursoIdResponse }
     * 
     */
    public BuscarCursoIdResponse createBuscarCursoIdResponse() {
        return new BuscarCursoIdResponse();
    }

    /**
     * Create an instance of {@link ListaDocenteCursoResponse }
     * 
     */
    public ListaDocenteCursoResponse createListaDocenteCursoResponse() {
        return new ListaDocenteCursoResponse();
    }

    /**
     * Create an instance of {@link AgregarCurso }
     * 
     */
    public AgregarCurso createAgregarCurso() {
        return new AgregarCurso();
    }

    /**
     * Create an instance of {@link ListacursoResponse }
     * 
     */
    public ListacursoResponse createListacursoResponse() {
        return new ListacursoResponse();
    }

    /**
     * Create an instance of {@link ListaDocenteCurso }
     * 
     */
    public ListaDocenteCurso createListaDocenteCurso() {
        return new ListaDocenteCurso();
    }

    /**
     * Create an instance of {@link BuscarCursoNombre }
     * 
     */
    public BuscarCursoNombre createBuscarCursoNombre() {
        return new BuscarCursoNombre();
    }

    /**
     * Create an instance of {@link BuscarCursoNombreResponse }
     * 
     */
    public BuscarCursoNombreResponse createBuscarCursoNombreResponse() {
        return new BuscarCursoNombreResponse();
    }

    /**
     * Create an instance of {@link AgregarCursoResponse }
     * 
     */
    public AgregarCursoResponse createAgregarCursoResponse() {
        return new AgregarCursoResponse();
    }

    /**
     * Create an instance of {@link Listacurso }
     * 
     */
    public Listacurso createListacurso() {
        return new Listacurso();
    }

    /**
     * Create an instance of {@link BuscarCursoId }
     * 
     */
    public BuscarCursoId createBuscarCursoId() {
        return new BuscarCursoId();
    }

    /**
     * Create an instance of {@link DocenteCurso }
     * 
     */
    public DocenteCurso createDocenteCurso() {
        return new DocenteCurso();
    }

    /**
     * Create an instance of {@link Curso }
     * 
     */
    public Curso createCurso() {
        return new Curso();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCursoIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServiceCurso/", name = "buscarCurso_IdResponse")
    public JAXBElement<BuscarCursoIdResponse> createBuscarCursoIdResponse(BuscarCursoIdResponse value) {
        return new JAXBElement<BuscarCursoIdResponse>(_BuscarCursoIdResponse_QNAME, BuscarCursoIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDocenteCursoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServiceCurso/", name = "listaDocenteCursoResponse")
    public JAXBElement<ListaDocenteCursoResponse> createListaDocenteCursoResponse(ListaDocenteCursoResponse value) {
        return new JAXBElement<ListaDocenteCursoResponse>(_ListaDocenteCursoResponse_QNAME, ListaDocenteCursoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarCurso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServiceCurso/", name = "agregarCurso")
    public JAXBElement<AgregarCurso> createAgregarCurso(AgregarCurso value) {
        return new JAXBElement<AgregarCurso>(_AgregarCurso_QNAME, AgregarCurso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCursoNombreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServiceCurso/", name = "buscarCurso_nombreResponse")
    public JAXBElement<BuscarCursoNombreResponse> createBuscarCursoNombreResponse(BuscarCursoNombreResponse value) {
        return new JAXBElement<BuscarCursoNombreResponse>(_BuscarCursoNombreResponse_QNAME, BuscarCursoNombreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarCursoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServiceCurso/", name = "agregarCursoResponse")
    public JAXBElement<AgregarCursoResponse> createAgregarCursoResponse(AgregarCursoResponse value) {
        return new JAXBElement<AgregarCursoResponse>(_AgregarCursoResponse_QNAME, AgregarCursoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listacurso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServiceCurso/", name = "listacurso")
    public JAXBElement<Listacurso> createListacurso(Listacurso value) {
        return new JAXBElement<Listacurso>(_Listacurso_QNAME, Listacurso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCursoId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServiceCurso/", name = "buscarCurso_Id")
    public JAXBElement<BuscarCursoId> createBuscarCursoId(BuscarCursoId value) {
        return new JAXBElement<BuscarCursoId>(_BuscarCursoId_QNAME, BuscarCursoId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListacursoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServiceCurso/", name = "listacursoResponse")
    public JAXBElement<ListacursoResponse> createListacursoResponse(ListacursoResponse value) {
        return new JAXBElement<ListacursoResponse>(_ListacursoResponse_QNAME, ListacursoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDocenteCurso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServiceCurso/", name = "listaDocenteCurso")
    public JAXBElement<ListaDocenteCurso> createListaDocenteCurso(ListaDocenteCurso value) {
        return new JAXBElement<ListaDocenteCurso>(_ListaDocenteCurso_QNAME, ListaDocenteCurso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCursoNombre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServiceCurso/", name = "buscarCurso_nombre")
    public JAXBElement<BuscarCursoNombre> createBuscarCursoNombre(BuscarCursoNombre value) {
        return new JAXBElement<BuscarCursoNombre>(_BuscarCursoNombre_QNAME, BuscarCursoNombre.class, null, value);
    }

}
