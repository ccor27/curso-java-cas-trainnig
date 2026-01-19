package es.cursojava.spring.ejercicio1.beans;

import org.springframework.stereotype.Component;

import es.cursojava.spring.ejercicio1.interfaces.Operacion;

@Component
public class Suma  implements Operacion{

	@Override
	public int calcular(int a, int b) {
		return a + b;
	}

	@Override
	public String obtenerSigno() {
		// TODO Auto-generated method stub
		return "+";
	}

}
