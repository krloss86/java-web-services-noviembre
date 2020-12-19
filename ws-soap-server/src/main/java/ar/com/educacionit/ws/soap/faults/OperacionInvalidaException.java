package ar.com.educacionit.ws.soap.faults;

import javax.xml.ws.WebFault;

@WebFault
public class OperacionInvalidaException extends Exception {

	private static final long serialVersionUID = -4380897213937625192L;
	
	private String mensaje;

	public OperacionInvalidaException(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
