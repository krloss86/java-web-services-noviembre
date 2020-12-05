package ar.com.educacionit.ws.repository;

import java.util.List;

import ar.com.educacionit.ws.domain.Producto;

public interface ProductoRepository {

	public Producto getByID(Long id);

	public List<Producto> findAll();
}
