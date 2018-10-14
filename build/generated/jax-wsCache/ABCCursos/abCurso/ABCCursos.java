
package abCurso;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ABCCursos", targetNamespace = "http://ABCCursos/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ABCCursos {


    /**
     * 
     * @param creditos
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "agregar", targetNamespace = "http://ABCCursos/", className = "abCurso.Agregar")
    @ResponseWrapper(localName = "agregarResponse", targetNamespace = "http://ABCCursos/", className = "abCurso.AgregarResponse")
    @Action(input = "http://ABCCursos/ABCCursos/agregarRequest", output = "http://ABCCursos/ABCCursos/agregarResponse")
    public String agregar(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "creditos", targetNamespace = "")
        int creditos);

    /**
     * 
     * @param codigo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminar", targetNamespace = "http://ABCCursos/", className = "abCurso.Eliminar")
    @ResponseWrapper(localName = "eliminarResponse", targetNamespace = "http://ABCCursos/", className = "abCurso.EliminarResponse")
    @Action(input = "http://ABCCursos/ABCCursos/eliminarRequest", output = "http://ABCCursos/ABCCursos/eliminarResponse")
    public String eliminar(
        @WebParam(name = "codigo", targetNamespace = "")
        int codigo);

}
