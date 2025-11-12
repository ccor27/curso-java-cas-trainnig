package es.cursojava.poo.exception.ejercicios.ejercicio2;

import java.util.Arrays;
import java.util.List;

import es.cursojava.poo.exception.ejercicios.Utilidades;
import es.cursojava.poo.exception.ejercicios.ejercicio2.exceptions.TemperatureException;
import es.cursojava.poo.exception.ejercicios.ejercicio2.pojos.Asiduo;
import es.cursojava.poo.exception.ejercicios.ejercicio2.pojos.Cliente;
import es.cursojava.poo.exception.ejercicios.ejercicio2.pojos.ClienteTomaCafe;
import es.cursojava.poo.exception.ejercicios.ejercicio2.pojos.Comensal;
import es.cursojava.poo.exception.ejercicios.ejercicio2.pojos.Huesped;

public class Bar {

	public static void main(String[] args) {
		List<Cliente> clientes = abrirBar();
		for (Cliente cliente : clientes) {
			if (cliente != null) {
				try {
					if (cliente instanceof ClienteTomaCafe) {
						((Comensal) cliente).tomar(Utilidades.generarTaza());
					}
				} catch (TemperatureException | NullPointerException exception) {
					System.out.println(exception);
				}
			}
		}
	}

	private static List<Cliente> abrirBar() {

		return Arrays.asList(new Huesped("Lucia", "45123987"), new Comensal("Mateo", true),
				new Asiduo("Sofía", "La tacaña"));
	}

}
