package es.cursojava.poo.mapas;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import es.cursojava.poo.colecciones.listas.ejercicios.supermercado.utilidades.Utilidades;

public class PruebaMaps {

	public static void main(String[] args) {
		/**
		 * Notes from the Maps explanation:
		 * 	- they store data by key value
		 * 	- in the example we are doing, where we are storing a person, we use the
		 * 		person's DNI
		 * 	- if we have a objects with the same key, we're overwriting the key's value
		 * 		(the object that key is associated to)
		 * 	- the put method returns the previous value associated with key, or null if there
		 * 		was no mapping for key
		 */
		Map<String,Persona> personas = new HashMap();
		//storing object with the same keys
		//in this case we are overwriting (the key 111A first will point to the Cristian object
		//then it will point to the Camilo object
		personas.put("111A", new Persona("Cristian","111A"));
		personas.put("111A", new Persona("Camilo","111A"));
		personas.put("112A", new Persona("Marta","111A"));
		personas.put("113A", new Persona("Mar","111A"));
		//In the next line we'll first, overwrite the key's vale, so the 111A will point to Samuel object.
		//the put method will return the previous values associated key, that means it will return the Camilo object, 
		//that was the previous key's values, before it's been overwritten 
		Persona p = personas.put("111A", new Persona("Samuel","111A"));  
		System.out.println(p.getNombre()); //here it will print "Camilo"
		
		//Get value from a person
		String dni = Utilidades.pideDatoCadena("Ingresa el dni de la persona a buscar");
		//here we are getting the value that is associated with that value
		Persona personaBuscada = personas.get(dni);
		System.out.println("La persona es: "+personaBuscada.getNombre());
		
		System.out.println("======================= Getting the keys =========================");
		//Get all the keys of the map
		//in this case as the map's key is String, the keySet will return a Set<String>
		Set<String> dnis = personas.keySet();
		for (String string : dnis) {
			System.out.println(string);
		}
		
		System.out.println("======================= Getting the values using the keys =========================");
		//Get all the values of the map
		//as we've already got the keys, we just loop the map and using the keys just get the value 
		for (String d : dnis) {
			Persona person = personas.get(d);
			System.out.println(person.getNombre());
		}
		
		System.out.println("======================= Getting the values using the keys =========================");
		//another way to get all the values without using the keys is using the values method, that returns a Collection 
		Collection<Persona> colPersonas = personas.values();
		for (Persona person2 : colPersonas) {
			System.out.println(person2.getNombre());			
		}
		
		System.out.println("======================= Getting the keys and values using the entrySet method =========================");
		//Use the entrySet(), that return the key-value pairs of the map
		//this return a Set of Entry, that contains the key and value
		Set<Entry<String,Persona>> entries = personas.entrySet();
		for (Entry<String, Persona> entry : entries) {
			System.out.println("key: "+entry.getKey()+" - value: "+entry.getValue().getNombre());
		}
		
		//This method will remove the object that is associated to the key passed as argument
		//and return the previous value associated with key, or null if there was no mapping for key (like the put)
		personas.remove("111A");
	}
}
