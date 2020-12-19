package ar.com.educacionit.ws.soap.client.main;

import java.util.List;

import ar.com.educacionit.ws.soap.impl.InternalServerError;
import ar.com.educacionit.ws.soap.impl.ProductoWS;
import ar.com.educacionit.ws.soap.impl.ProductoWSImplService;
import ar.com.educacionit.ws.soap.interfaces.Producto;

public class WSClientMain {

	public static void main(String[] args) {
		
		ProductoWS psws = new ProductoWSImplService().getProductoWSImplPort();
		try {
			List<Producto> productos = psws.obtenerTodos();
			System.out.println(productos);
		} catch (InternalServerError e) {			
			e.printStackTrace();
		}
	}

}
