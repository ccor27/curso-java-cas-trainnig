package es.cursojava.poo.colecciones.listas;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.poo.Persona;

public class EjemploLista {

	public static void main(String[] args) {
		
		List lista = new ArrayList();
		lista.add("Amarillo");
		lista.add(100.5);
		for (int i = 0; i < 10000; i++) {
			lista.add(new Persona());
		}

		System.out.println(lista.size());
		
		for (Object object : lista) {
			if(object instanceof Persona) {
				Persona p = (Persona) object;
			}
		}
	}

}
