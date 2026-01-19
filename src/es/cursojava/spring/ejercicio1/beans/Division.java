package es.cursojava.spring.ejercicio1.beans;

import org.springframework.stereotype.Component;

import es.cursojava.spring.ejercicio1.interfaces.Operacion;

@Component
public class Division implements Operacion {

	@Override
	public int calcular(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String obtenerSigno() {
		// TODO Auto-generated method stub
		return "/";
	}

}
