package ar.com.educacionit.ws.soap.faults;

import javax.xml.ws.WebFault;

@WebFault
public class InternalServerError extends Exception {

	private static final long serialVersionUID = -8686009358518142263L;
	private String detalle;

	public InternalServerError(String message, String detalle, Exception e) {
		super(message,e);
		this.detalle = detalle;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
}
