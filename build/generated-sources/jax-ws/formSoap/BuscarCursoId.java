
package formSoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscarCurso_Id complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscarCurso_Id">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_curso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarCurso_Id", propOrder = {
    "idCurso"
})
public class BuscarCursoId {

    @XmlElement(name = "id_curso")
    protected int idCurso;

    /**
     * Obtiene el valor de la propiedad idCurso.
     * 
     */
    public int getIdCurso() {
        return idCurso;
    }

    /**
     * Define el valor de la propiedad idCurso.
     * 
     */
    public void setIdCurso(int value) {
        this.idCurso = value;
    }

}
