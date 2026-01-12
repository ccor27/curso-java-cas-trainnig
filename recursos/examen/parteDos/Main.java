package es.cursojava.examen.parteDos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {


		List<String> lineas = new ArrayList<String>();
		try {
			 lineas = Utilidades.leerArchivo("./recursos/application.log.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		//indicar el numero total de lineas del fichero
		System.out.println("El numero de lineas que tiene el archivo es: "+lineas.size());
		
		//contador para saber cuantas veces aparece java
	    System.out.println("El numero de veces que aparece la palabra java en el archivo es: "+Utilidades.numeroVecesPalabraExiste(lineas, "java"));
	    
		//mapa para guardar
		Map<Integer,String> map = Utilidades.generarMapaDelArchivo(lineas);
		Utilidades.mostrarDondeAparecePalabra(map, "java");
		Utilidades.mostrarSumaClaveYCaracteres(map);
		
	}
}
