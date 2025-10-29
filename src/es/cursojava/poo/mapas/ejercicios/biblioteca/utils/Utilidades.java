package es.cursojava.poo.mapas.ejercicios.biblioteca.utils;

import java.util.Scanner;

public class Utilidades {

	public static String calculaEdad(int ano) {
		return("Tienes una edad de: "+(2025 - ano)+" año");
	}

	public static void pintaMenu(String[] options) {
		pintaMenu(options, "Introduce una opcion:");
	}
	
	public static void pintaMenu(String[] options, String message) {
		System.out.println("   =========== Menu ===========");
		for (int i = 1; i <= options.length; i++) {
			System.out.println(i+". "+options[i-1]);
		}
		System.out.println("   ============================");
		System.out.println(message);
	}
	
	public static int pideDatoNumerico(String texto) {
		if(!texto.isEmpty() && !texto.isBlank()) {
			System.out.print(texto);
		}
		Scanner scan = new Scanner(System.in);
		int dato = scan.nextInt();
		return dato;
	}
	
	public static String pideDatoCadena(String texto) {
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		String dato = scan.nextLine();
		return dato;
	}
}
