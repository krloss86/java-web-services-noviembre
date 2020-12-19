package ar.com.educacionit.ws.soap.calculadora;

public class Operacion {

	private String operacion;
	
	private Double primerValor;
	
	private Double segundoValor;

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public Double getPrimerValor() {
		return primerValor;
	}

	public void setPrimerValor(Double primerValor) {
		this.primerValor = primerValor;
	}

	public Double getSegundoValor() {
		return segundoValor;
	}

	public void setSegundoValor(Double segundoValor) {
		this.segundoValor = segundoValor;
	}
}
