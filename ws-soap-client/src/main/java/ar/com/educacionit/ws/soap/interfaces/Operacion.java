
package ar.com.educacionit.ws.soap.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para operacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="operacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerValor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="segundoValor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operacion", propOrder = {
    "operacion",
    "primerValor",
    "segundoValor"
})
public class Operacion {

    protected String operacion;
    protected Double primerValor;
    protected Double segundoValor;

    /**
     * Obtiene el valor de la propiedad operacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Define el valor de la propiedad operacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperacion(String value) {
        this.operacion = value;
    }

    /**
     * Obtiene el valor de la propiedad primerValor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrimerValor() {
        return primerValor;
    }

    /**
     * Define el valor de la propiedad primerValor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrimerValor(Double value) {
        this.primerValor = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoValor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSegundoValor() {
        return segundoValor;
    }

    /**
     * Define el valor de la propiedad segundoValor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSegundoValor(Double value) {
        this.segundoValor = value;
    }

}
