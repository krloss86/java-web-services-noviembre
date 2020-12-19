package ar.com.educacionit.ws.soap.impl;

import javax.jws.WebService;

import ar.com.educacionit.ws.soap.calculadora.Operacion;
import ar.com.educacionit.ws.soap.calculadora.Resultado;
import ar.com.educacionit.ws.soap.faults.CalculoMatematicoInvalidaException;
import ar.com.educacionit.ws.soap.faults.OperacionInvalidaException;
import ar.com.educacionit.ws.soap.interfaces.CalculadoraWS;

@WebService(endpointInterface = "ar.com.educacionit.ws.soap.interfaces.CalculadoraWS")
public class CalculadoraWSImpl implements CalculadoraWS {

	public double sumar(double a, double b) {
		return a + b;
	}

	public Resultado ejecutar(Operacion operacion) throws OperacionInvalidaException, CalculoMatematicoInvalidaException {
		
		Resultado resultado;
		switch (operacion.getOperacion()) {
			case "+":
				resultado = new Resultado(operacion.getPrimerValor() + operacion.getSegundoValor());
				break;
			case "-":
				resultado = new Resultado(operacion.getPrimerValor() - operacion.getSegundoValor());
				break;
			case "*":
				resultado = new Resultado(operacion.getPrimerValor() * operacion.getSegundoValor());
				break;
			case "/":
				if(operacion.getSegundoValor() != 0) {
					resultado = new Resultado(operacion.getPrimerValor() / operacion.getSegundoValor());					
				}else {
					throw new CalculoMatematicoInvalidaException("No es posible dividir por 0");
				}
				break;
			default:
				throw new OperacionInvalidaException("Operacion no soportada" + operacion.getOperacion());
		}
		
		return resultado;
	}

}
