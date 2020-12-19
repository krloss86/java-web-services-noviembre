
package ar.com.educacionit.ws.soap.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerProductoPorCodigoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerProductoPorCodigoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="miProducto" type="{http://interfaces.soap.ws.educacionit.com.ar/}producto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerProductoPorCodigoResponse", propOrder = {
    "miProducto"
})
public class ObtenerProductoPorCodigoResponse {

    protected Producto miProducto;

    /**
     * Obtiene el valor de la propiedad miProducto.
     * 
     * @return
     *     possible object is
     *     {@link Producto }
     *     
     */
    public Producto getMiProducto() {
        return miProducto;
    }

    /**
     * Define el valor de la propiedad miProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link Producto }
     *     
     */
    public void setMiProducto(Producto value) {
        this.miProducto = value;
    }

}
