
package formSoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para docenteCurso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="docenteCurso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cui" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_curso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_usuario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombre_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre_u" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "docenteCurso", propOrder = {
    "apellido",
    "creditos",
    "cui",
    "idCurso",
    "idUsuario",
    "nombreC",
    "nombreU"
})
public class DocenteCurso {

    protected String apellido;
    protected int creditos;
    protected int cui;
    @XmlElement(name = "id_curso")
    protected int idCurso;
    @XmlElement(name = "id_usuario")
    protected int idUsuario;
    @XmlElement(name = "nombre_c")
    protected String nombreC;
    @XmlElement(name = "nombre_u")
    protected String nombreU;

    /**
     * Obtiene el valor de la propiedad apellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Define el valor de la propiedad apellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido(String value) {
        this.apellido = value;
    }

    /**
     * Obtiene el valor de la propiedad creditos.
     * 
     */
    public int getCreditos() {
        return creditos;
    }

    /**
     * Define el valor de la propiedad creditos.
     * 
     */
    public void setCreditos(int value) {
        this.creditos = value;
    }

    /**
     * Obtiene el valor de la propiedad cui.
     * 
     */
    public int getCui() {
        return cui;
    }

    /**
     * Define el valor de la propiedad cui.
     * 
     */
    public void setCui(int value) {
        this.cui = value;
    }

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

    /**
     * Obtiene el valor de la propiedad idUsuario.
     * 
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define el valor de la propiedad idUsuario.
     * 
     */
    public void setIdUsuario(int value) {
        this.idUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreC() {
        return nombreC;
    }

    /**
     * Define el valor de la propiedad nombreC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreC(String value) {
        this.nombreC = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreU() {
        return nombreU;
    }

    /**
     * Define el valor de la propiedad nombreU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreU(String value) {
        this.nombreU = value;
    }

}
