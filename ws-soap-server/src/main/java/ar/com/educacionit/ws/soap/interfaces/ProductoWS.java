package ar.com.educacionit.ws.soap.interfaces;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import ar.com.educacionit.ws.domain.Producto;
import ar.com.educacionit.ws.soap.dto.ProductoRequestDTO;
import ar.com.educacionit.ws.soap.faults.InternalServerError;
import ar.com.educacionit.ws.soap.faults.ProductoNoExisteException;

@WebService
public interface ProductoWS {

	@WebMethod(operationName = "obtenerProductoPorCodigo" )
	@WebResult(name = "miProducto")
	public Producto getProducto(@WebParam(name="id") Long idProducto) throws InternalServerError, ProductoNoExisteException;
	
	@WebMethod(operationName = "obtenerTodos")
	public List<Producto> findAll() throws InternalServerError;
	
	@WebMethod(operationName = "crearProducto")
	public Producto newProducto(ProductoRequestDTO request) throws InternalServerError;
}
