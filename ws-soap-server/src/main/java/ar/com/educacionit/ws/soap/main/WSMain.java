package ar.com.educacionit.ws.soap.main;

import javax.xml.ws.Endpoint;

import ar.com.educacionit.ws.soap.impl.CalculadoraWSImpl;
import ar.com.educacionit.ws.soap.impl.ProductoWSImpl;

public class WSMain {

	public static void main(String[] args) {
		
		System.out.println("Publicando ws soap en el puerto 9000");
		
		Endpoint.publish("http://localhost:9000/", new CalculadoraWSImpl());
		
		//web de producto
		Endpoint.publish("http://localhost:9000/producto", new ProductoWSImpl());

		System.out.println("Se ha iniciado CalculadoraWS en http://localhost:9000");
		
		System.out.println("El WSDL está publicado en: http://localhost:9000/?wsdl");
		
		System.out.println("El WSDL de producto está publicado en: http://localhost:9000/producto/?wsdl");
	}

}
