
package report;

import javax.jws.WebMethod;
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
@WebService(name = "Reporte", targetNamespace = "http://Reporte/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Reporte {


    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cantidadDocente", targetNamespace = "http://Reporte/", className = "report.CantidadDocente")
    @ResponseWrapper(localName = "cantidadDocenteResponse", targetNamespace = "http://Reporte/", className = "report.CantidadDocenteResponse")
    @Action(input = "http://Reporte/Reporte/cantidadDocenteRequest", output = "http://Reporte/Reporte/cantidadDocenteResponse")
    public int cantidadDocente();

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cantidadCurso", targetNamespace = "http://Reporte/", className = "report.CantidadCurso")
    @ResponseWrapper(localName = "cantidadCursoResponse", targetNamespace = "http://Reporte/", className = "report.CantidadCursoResponse")
    @Action(input = "http://Reporte/Reporte/cantidadCursoRequest", output = "http://Reporte/Reporte/cantidadCursoResponse")
    public int cantidadCurso();

}
