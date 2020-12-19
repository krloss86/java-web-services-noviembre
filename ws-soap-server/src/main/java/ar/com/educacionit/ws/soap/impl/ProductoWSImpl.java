package ar.com.educacionit.ws.soap.impl;

import java.util.List;

import javax.jws.WebService;

import ar.com.educacionit.ws.domain.Producto;
import ar.com.educacionit.ws.exceptions.ServiceException;
import ar.com.educacionit.ws.services.ProductoService;
import ar.com.educacionit.ws.services.impl.ProductoServiceImpl;
import ar.com.educacionit.ws.soap.dto.ProductoRequestDTO;
import ar.com.educacionit.ws.soap.faults.InternalServerError;
import ar.com.educacionit.ws.soap.faults.ProductoNoExisteException;
import ar.com.educacionit.ws.soap.interfaces.ProductoWS;

@WebService(endpointInterface = "ar.com.educacionit.ws.soap.interfaces.ProductoWS")
public class ProductoWSImpl implements ProductoWS {

	private ProductoService ps = new ProductoServiceImpl();
	
	@Override
	public Producto getProducto(Long idProducto) throws InternalServerError, ProductoNoExisteException {
		
		Producto p;
		try {
			p = ps.getProductoById(idProducto);
		} catch (ServiceException e) {
			throw new InternalServerError(e.getCause().getMessage(),"Error en findAll",e);
		}
		if(p == null) {
			throw new ProductoNoExisteException("No existe el id:"+idProducto);
		}
		return p;
	}

	@Override
	public List<Producto> findAll() throws InternalServerError {
		
		try {
			return ps.findProductos();
		} catch (ServiceException e) {
			throw new InternalServerError(e.getCause().getMessage(),"Error en findAll",e);
		} 
	}

	@Override
	public Producto newProducto(ProductoRequestDTO request) throws InternalServerError {
			
		try {
			Producto productoACrear = new Producto(request.getTitulo(), 
					request.getCodigo(), 
					request.getPrecio(), request.getTipoProducto());
			
			return ps.nuevoProducto(productoACrear);
		}catch (Exception e) {
			throw new InternalServerError(e.getCause().getMessage(),"Error en newProducto",e);
		}
			
	}

}
