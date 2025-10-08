package es.cursojava.poo.colecciones.listas.ejercicios.supermercado.utilidades;

import java.util.Scanner;

public class Utilidades {

	public static void pintaMenu(String[] options, String title) {
		pintaMenu(options, "Introduce una opcion:");
	}
	
	public static void pintaMenu(String[] options, String message, String title) {
		System.out.println("   =========== Supermercado "+ title +" ===========");
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
	
	public static String menuSeleccionCategoriaCliente(String[] opciones, String nombreCliete, String title) {
		boolean menuFlag = true;
		String seleccion = "";
		while(menuFlag) {
			Utilidades.pintaMenu(opciones, "Bienvenido "+ nombreCliete+", por favor seleccione la categoria que desea comprar:", title);
			int opcion = pideDatoNumerico("");
		    if (opcion >= 1 && opcion <= opciones.length) {
	            seleccion = opciones[opcion - 1];
	            menuFlag = false;
	        } else {
	            System.out.println("Opción inválida. Por favor, ingrese un número entre 1 y " + opciones.length);
	        }
			
		}
		return seleccion;
	}
	public static String menuSeleccionProducto(String[] opciones, String nombreCliete, String title) {
		String producto = "";
		return producto;
	}
}
