
package formSoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for docenteCurso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the apellido property.
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
     * Sets the value of the apellido property.
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
     * Gets the value of the creditos property.
     * 
     */
    public int getCreditos() {
        return creditos;
    }

    /**
     * Sets the value of the creditos property.
     * 
     */
    public void setCreditos(int value) {
        this.creditos = value;
    }

    /**
     * Gets the value of the cui property.
     * 
     */
    public int getCui() {
        return cui;
    }

    /**
     * Sets the value of the cui property.
     * 
     */
    public void setCui(int value) {
        this.cui = value;
    }

    /**
     * Gets the value of the idCurso property.
     * 
     */
    public int getIdCurso() {
        return idCurso;
    }

    /**
     * Sets the value of the idCurso property.
     * 
     */
    public void setIdCurso(int value) {
        this.idCurso = value;
    }

    /**
     * Gets the value of the idUsuario property.
     * 
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Sets the value of the idUsuario property.
     * 
     */
    public void setIdUsuario(int value) {
        this.idUsuario = value;
    }

    /**
     * Gets the value of the nombreC property.
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
     * Sets the value of the nombreC property.
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
     * Gets the value of the nombreU property.
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
     * Sets the value of the nombreU property.
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
