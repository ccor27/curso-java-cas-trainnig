package es.cursojava.poo.exception.ejercicios.ejercicio2;

import java.util.Arrays;
import java.util.List;

import es.cursojava.poo.exception.ejercicios.ejercicio2.interfaces.Tomable;
import es.cursojava.poo.exception.ejercicios.ejercicio2.pojos.Asiduo;
import es.cursojava.poo.exception.ejercicios.ejercicio2.pojos.Cliente;
import es.cursojava.poo.exception.ejercicios.ejercicio2.pojos.Comensal;
import es.cursojava.poo.exception.ejercicios.ejercicio2.pojos.Huesped;

public class Bar {

	public static void main(String[] args) {
		List<Cliente> clientes = abrirBar();
	}
	
	private static List<Cliente> abrirBar() {
		
		return Arrays.asList(
				new Huesped("Lucia", "45123987"),
				new Comensal("Mateo", true),
				new Asiduo("Sofía", "La tacaña"));
	}
	
	private static void clientesBeben(Tomable cliente) {
		//TODO: finish
	}
	
}
