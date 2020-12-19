package ar.com.educacionit.ws.soap.faults;

import javax.xml.ws.WebFault;

@WebFault
public class CalculoMatematicoInvalidaException extends Exception {

	private static final long serialVersionUID = -4380897213937625192L;
	
	public CalculoMatematicoInvalidaException(String mensaje) {
		super(mensaje);
	}
	
}
