package ar.com.educacionit.ws.soap.interfaces;

import javax.jws.WebMethod;
import javax.jws.WebService;

import ar.com.educacionit.ws.soap.calculadora.Operacion;
import ar.com.educacionit.ws.soap.calculadora.Resultado;
import ar.com.educacionit.ws.soap.faults.CalculoMatematicoInvalidaException;
import ar.com.educacionit.ws.soap.faults.OperacionInvalidaException;

@WebService
public interface CalculadoraWS {

	@WebMethod
	public double sumar(double a, double b);
	
	@WebMethod
	public Resultado ejecutar(Operacion operacion) throws OperacionInvalidaException, CalculoMatematicoInvalidaException;
}
