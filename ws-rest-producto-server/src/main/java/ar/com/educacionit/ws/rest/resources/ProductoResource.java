package ar.com.educacionit.ws.rest.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ar.com.educacionit.ws.domain.Producto;
import ar.com.educacionit.ws.services.ProductoService;
import ar.com.educacionit.ws.services.impl.ProductoServiceImpl;

@Path("productos")
public class ProductoResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAllProductos() {
		ProductoService ps = new ProductoServiceImpl();
		List<Producto> productos = ps.findProductos();
		return Response.ok(productos).build();
	}
}
