package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner scanner;

		int option;
		boolean flag = true;
		while (flag) {
			System.out.println("=====================MENU==============================");
			System.out.println("1. Pintar Cuadro");
			System.out.println("2. Validar Email");
			System.out.println("3. Añadir alumno");
			System.out.println("4. Salir");
			System.out.println("=======================================================");
			System.out.println("Seleccione una opcion");
			scanner = new Scanner(System.in);
			option = scanner.nextInt();
			switch (option) {
			case 1:
				System.out.println("Ha elegido: Pintar cuadro");
				break;
			case 2:
				System.out.println("Ha elegido: Validar Email");
				break;
			case 3:
				System.out.println("Ha elegido: Añadir alumno");
				break;
			case 4: {
				System.out.println("Adios!");
				flag = false;
				break;
			}
			default:
				System.out.println("Debe elegir una opcion valida!");
			}
		}
	}
}
