package es.cursojava.metodos.ejercicios;

public class Ejercicio2 {
	
	public static int countNames(String[] names) {
		int count = 0;
		for (String name : names) {
			if(name.startsWith("A") && name.contains("t"))
				count++;
		}
		return count;
	}

}
