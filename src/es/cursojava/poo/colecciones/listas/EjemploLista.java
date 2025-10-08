package es.cursojava.poo.colecciones.listas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
		Set<Persona> conjunto = new HashSet<Persona>();
		for(int i = 0; i < 10; i++) {
			conjunto.add(new Persona());
		}
		Iterator ite = conjunto.iterator();
	}

}
