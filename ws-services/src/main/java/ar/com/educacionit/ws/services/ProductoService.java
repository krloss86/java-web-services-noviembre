package ar.com.educacionit.ws.services;

import java.util.List;

import ar.com.educacionit.ws.domain.Producto;

public interface ProductoService {

	public Producto obtenerProducto(Long id);

	public List<Producto> findProductos();
}
