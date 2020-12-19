package ar.com.educacionit.ws.soap.faults;

public class ProductoNoExisteException extends Exception {

	private static final long serialVersionUID = 8394508927511627966L;

	public ProductoNoExisteException(String message) {
		super(message);
	}
	
}
