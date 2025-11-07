package es.cursojava.poo.exception.ejercicios.ejercicio2;

import java.util.Arrays;
import java.util.List;

import es.cursojava.poo.exception.ejercicios.Utilidades;
import es.cursojava.poo.exception.ejercicios.ejercicio2.exceptions.TemperatureException;
import es.cursojava.poo.exception.ejercicios.ejercicio2.exceptions.TooColdTemperatureException;
import es.cursojava.poo.exception.ejercicios.ejercicio2.exceptions.TooHotTemperatureException;
import es.cursojava.poo.exception.ejercicios.ejercicio2.interfaces.Tomable;
import es.cursojava.poo.exception.ejercicios.ejercicio2.pojos.Asiduo;
import es.cursojava.poo.exception.ejercicios.ejercicio2.pojos.Cliente;
import es.cursojava.poo.exception.ejercicios.ejercicio2.pojos.Comensal;
import es.cursojava.poo.exception.ejercicios.ejercicio2.pojos.Huesped;
import es.cursojava.poo.exception.ejercicios.ejercicio2.pojos.TazaCafe;

public class Bar {

	public static void main(String[] args) {
		List<Cliente> clientes = abrirBar();
		for (Cliente cliente : clientes) {
			if(cliente!=null) {
				try {
				if(cliente instanceof Comensal) {
					clientesBeben((Comensal) cliente);
				}else if(cliente instanceof Asiduo) {
					clientesBeben((Asiduo) cliente);
				}
//				}catch(TemperatureException  te) {
//					System.out.println(te);
//				}catch( NullPointerException npe) {
//					System.out.println(npe);
//				}
				}catch(TemperatureException | NullPointerException exception) {
					System.out.println(exception);
				}
			}
		}

//		Comensal comensal = new Comensal("Julio", false);
//		clientesBeben(comensal);
	}
	
	private static List<Cliente> abrirBar() {
		
		return Arrays.asList(
				new Huesped("Lucia", "45123987"),
				new Comensal("Mateo", true),
				new Asiduo("Sofía", "La tacaña"));
	}
	
	private static void clientesBeben(Tomable cliente) throws TooColdTemperatureException, TooHotTemperatureException, NullPointerException {
		//TODO: finish
		TazaCafe cafe = Utilidades.generarTaza();
			cliente.tomar(cafe);
		
	}
	
}
