package es.cursojava.inicio.ficheros.ejercicios;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

import es.cursojava.poo.exception.ejercicios.ejercicio2.pojos.TazaCafe;

public class UtilidadesFicheros {

	private static final String DEFAULT_FOLDER = "recursos\\"; 
	public static String calculaEdad(int ano) {
		return ("Tienes una edad de: " + (2025 - ano) + " año");
	}

	public static void pintaMenu(String[] options) {
		pintaMenu(options, "Introduce una opcion:");
	}

	public static void pintaMenu(String[] options, String message) {
		System.out.println("   =========== Menu ===========");
		for (int i = 1; i <= options.length; i++) {
			System.out.println(i + ". " + options[i - 1]);
		}
		System.out.println("   ============================");
		System.out.println(message);
	}

	public static double pideDatoDecimal(String texto) {
		if (!texto.isEmpty() && !texto.isBlank()) {
			System.out.print(texto);
		}
		Scanner scan;
		double dato = 0;
		boolean flag = true;
		while (flag) {
			try {
				scan = new Scanner(System.in);
				dato = scan.nextDouble();
				flag = false;
			} catch (Exception e) {
				System.out.println("Ingrese solo valores decimales!.\n");
			}
		}
		return dato;
	}
	public static int pideDatoNumerico(String texto) {
		if (!texto.isEmpty() && !texto.isBlank()) {
			System.out.print(texto);
		}
		Scanner scan;
		int dato = 0;
		boolean flag = true;
		while (flag) {
			try {
				scan = new Scanner(System.in);
				dato = scan.nextInt();
				flag = false;
			} catch (Exception e) {
				System.out.println("Ingrese solo digitos!.\n");
			}
		}
		return dato;
	}

	public static String pideDatoCadena(String texto) {
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		String dato = scan.nextLine();
		return dato;
	}
	/**
	 * Method to print like a tree the file that are in a file
	 * @param directory
	 */
	public static void showFileContent(File directory) {
		File[] files = directory.listFiles();
		File[] subFiles = null;
		for (File f : files) {
			System.out.println("|-"+f.getName());
			if(f.isDirectory()){				
				subFiles = f.listFiles();
				for (File sf : subFiles) {
					System.out.println("  |");
					System.out.println("  ---"+sf.getName());
				}
			}
		}
	}
	
	/**
	 * Method to rename a file's names of folder 
	 * @param directory
	 */
	public static void renameFilesName(File directory) {
		File[] files = directory.listFiles();
		int i = 1;
		for (File file : files) {
			File fileModifed = new File(directory.getAbsolutePath()+"\\cristian-"+i);
			file.renameTo(fileModifed);
			i++;
		}
	}
	
	
	public static void crearArchivo2(String nombre) {
//		File folder = new File(DEFAULT_FOLDER+nombre);
//		
//		if(folder.)
//		
//		try (PrintWriter buffer = new PrintWriter(archivo)) {
//			// try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo))){
//
//			buffer.println("Hola que tal amigos!");
//			buffer.println("Todo bien? yo acá escribiendo un archivo...");
//			buffer.printf("Hasta luego %s! %s", "JoseLuis", "Cadena");
//			// buffer.close();
//			System.out.println("El archivo se ha creado con éxito!");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
