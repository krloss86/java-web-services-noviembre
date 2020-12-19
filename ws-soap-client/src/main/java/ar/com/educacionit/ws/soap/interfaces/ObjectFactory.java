
package ar.com.educacionit.ws.soap.interfaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ar.com.educacionit.ws.soap.interfaces package. 
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

    private final static QName _CrearProducto_QNAME = new QName("http://interfaces.soap.ws.educacionit.com.ar/", "crearProducto");
    private final static QName _ObtenerProductoPorCodigo_QNAME = new QName("http://interfaces.soap.ws.educacionit.com.ar/", "obtenerProductoPorCodigo");
    private final static QName _ObtenerProductoPorCodigoResponse_QNAME = new QName("http://interfaces.soap.ws.educacionit.com.ar/", "obtenerProductoPorCodigoResponse");
    private final static QName _ObtenerTodos_QNAME = new QName("http://interfaces.soap.ws.educacionit.com.ar/", "obtenerTodos");
    private final static QName _ProductoNoExisteException_QNAME = new QName("http://interfaces.soap.ws.educacionit.com.ar/", "ProductoNoExisteException");
    private final static QName _ObtenerTodosResponse_QNAME = new QName("http://interfaces.soap.ws.educacionit.com.ar/", "obtenerTodosResponse");
    private final static QName _InternalServerError_QNAME = new QName("http://interfaces.soap.ws.educacionit.com.ar/", "InternalServerError");
    private final static QName _CrearProductoResponse_QNAME = new QName("http://interfaces.soap.ws.educacionit.com.ar/", "crearProductoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ar.com.educacionit.ws.soap.interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearProducto }
     * 
     */
    public CrearProducto createCrearProducto() {
        return new CrearProducto();
    }

    /**
     * Create an instance of {@link ObtenerProductoPorCodigo }
     * 
     */
    public ObtenerProductoPorCodigo createObtenerProductoPorCodigo() {
        return new ObtenerProductoPorCodigo();
    }

    /**
     * Create an instance of {@link ObtenerProductoPorCodigoResponse }
     * 
     */
    public ObtenerProductoPorCodigoResponse createObtenerProductoPorCodigoResponse() {
        return new ObtenerProductoPorCodigoResponse();
    }

    /**
     * Create an instance of {@link ObtenerTodos }
     * 
     */
    public ObtenerTodos createObtenerTodos() {
        return new ObtenerTodos();
    }

    /**
     * Create an instance of {@link ProductoNoExisteException }
     * 
     */
    public ProductoNoExisteException createProductoNoExisteException() {
        return new ProductoNoExisteException();
    }

    /**
     * Create an instance of {@link InternalServerError }
     * 
     */
    public InternalServerError createInternalServerError() {
        return new InternalServerError();
    }

    /**
     * Create an instance of {@link CrearProductoResponse }
     * 
     */
    public CrearProductoResponse createCrearProductoResponse() {
        return new CrearProductoResponse();
    }

    /**
     * Create an instance of {@link ObtenerTodosResponse }
     * 
     */
    public ObtenerTodosResponse createObtenerTodosResponse() {
        return new ObtenerTodosResponse();
    }

    /**
     * Create an instance of {@link ProductoRequestDTO }
     * 
     */
    public ProductoRequestDTO createProductoRequestDTO() {
        return new ProductoRequestDTO();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.soap.ws.educacionit.com.ar/", name = "crearProducto")
    public JAXBElement<CrearProducto> createCrearProducto(CrearProducto value) {
        return new JAXBElement<CrearProducto>(_CrearProducto_QNAME, CrearProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerProductoPorCodigo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.soap.ws.educacionit.com.ar/", name = "obtenerProductoPorCodigo")
    public JAXBElement<ObtenerProductoPorCodigo> createObtenerProductoPorCodigo(ObtenerProductoPorCodigo value) {
        return new JAXBElement<ObtenerProductoPorCodigo>(_ObtenerProductoPorCodigo_QNAME, ObtenerProductoPorCodigo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerProductoPorCodigoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.soap.ws.educacionit.com.ar/", name = "obtenerProductoPorCodigoResponse")
    public JAXBElement<ObtenerProductoPorCodigoResponse> createObtenerProductoPorCodigoResponse(ObtenerProductoPorCodigoResponse value) {
        return new JAXBElement<ObtenerProductoPorCodigoResponse>(_ObtenerProductoPorCodigoResponse_QNAME, ObtenerProductoPorCodigoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.soap.ws.educacionit.com.ar/", name = "obtenerTodos")
    public JAXBElement<ObtenerTodos> createObtenerTodos(ObtenerTodos value) {
        return new JAXBElement<ObtenerTodos>(_ObtenerTodos_QNAME, ObtenerTodos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoNoExisteException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.soap.ws.educacionit.com.ar/", name = "ProductoNoExisteException")
    public JAXBElement<ProductoNoExisteException> createProductoNoExisteException(ProductoNoExisteException value) {
        return new JAXBElement<ProductoNoExisteException>(_ProductoNoExisteException_QNAME, ProductoNoExisteException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.soap.ws.educacionit.com.ar/", name = "obtenerTodosResponse")
    public JAXBElement<ObtenerTodosResponse> createObtenerTodosResponse(ObtenerTodosResponse value) {
        return new JAXBElement<ObtenerTodosResponse>(_ObtenerTodosResponse_QNAME, ObtenerTodosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternalServerError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.soap.ws.educacionit.com.ar/", name = "InternalServerError")
    public JAXBElement<InternalServerError> createInternalServerError(InternalServerError value) {
        return new JAXBElement<InternalServerError>(_InternalServerError_QNAME, InternalServerError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.soap.ws.educacionit.com.ar/", name = "crearProductoResponse")
    public JAXBElement<CrearProductoResponse> createCrearProductoResponse(CrearProductoResponse value) {
        return new JAXBElement<CrearProductoResponse>(_CrearProductoResponse_QNAME, CrearProductoResponse.class, null, value);
    }

}
