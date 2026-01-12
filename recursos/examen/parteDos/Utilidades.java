package es.cursojava.examen.parteDos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Utilidades {

	public static void mostrarSumaClaveYCaracteres(Map<Integer, String> map) {
		Set<Entry<Integer, String>> pares = map.entrySet();

		for (Entry<Integer, String> entry : pares) {
			String linea = entry.getValue();
			int index = entry.getKey();
			System.out.println("suma de clave y caracteres en linea " + index + " es: " + (index + linea.length()));
		}
	}

	public static void mostrarDondeAparecePalabra(Map<Integer, String> map, String palabra) {
		Set<Entry<Integer, String>> pares = map.entrySet();
		for (Entry<Integer, String> entry : pares) {
			String linea = entry.getValue();
			int index = entry.getKey();
			if (linea.contains(palabra)) {
				System.out.println("La palabra [" + palabra + "] aparece en la linea " + index);
			}
		}
	}

	public static Map<Integer, String> generarMapaDelArchivo(List<String> lineas) {
		// variable para saber en que linea estamos
		int index = 1;
		// mapa para guardar
		Map<Integer, String> map = new HashMap<>();
		for (String linea : lineas) {
			if (linea != null) {
				map.put(index, linea);
				index++;
			}
		}
		return map;
	}

	/**
	 * En este metodo convierto la linea (s) en un arreglo de caracters, lo mismo para la palabra (java)
	 * luego recorro la linea, y pregunto si el caracter actual es igual al de la palabra en la primera
	 * posicion, de serlo, hago un nuevo arreglo, esta ves desde 0 hasta el tamaño de la palbra (java)
	 * comparando caracter a caracter lo de la linea con la palabra.
	 * @param s
	 * @param patter
	 * @return
	 */
	private static int numberTimesAppear(String s, String patter) {
		int times = 0;
		int sizeS = s.length();
		int sizeP = patter.length();
		int i = 0;
		int j;
		int aux = 0;
		char[] charactersS = s.toCharArray();
		char[] charactersPatter = patter.toCharArray();
		while(i < sizeS) {
			if(charactersS[i] == charactersPatter[0]) {
				j = 0;
				aux = i;
				while(j < sizeP) {
					if(charactersS[aux] != charactersPatter[j]) {
						break;
					}
					j++;
					aux++;
				}
				if(j == sizeP) {
					times++;
					i += sizeP;
				}
			}
			else {
				i++;
			}
		}
		return times;
	}

	public static int numeroVecesPalabraExiste(List<String> lineas, String palabra) {
		int contador = 0;
		for (String linea : lineas) {
			if (linea != null && linea.contains(palabra)) {
				// esto por si la palabra esta mas de una vez en la linea
				contador += numberTimesAppear(linea, palabra);
			}
		}
		return contador;
	}

	public static List<String> leerArchivo(String nombre) throws IOException {
		Path path = Paths.get(nombre);
		// leer todas las lineas del fichero
		return Files.readAllLines(path);
	}
}
