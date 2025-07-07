package es.cursojava.inicio.bluces.ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner;
		int opcion;
		boolean flag = true;
		int altura;
		int ancho;
		while(flag) {
			System.out.println("==================MENU==================");
			System.out.println("1. Pintar Cuadrado");
			System.out.println("2. Validar Email");
			System.out.println("3. Añadir Alumno");
			System.out.println("4. Salir");
			System.out.println("========================================");
			scanner = new Scanner(System.in);
			opcion = scanner.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Ingrese la altura:");
				scanner = new Scanner(System.in);
				altura = scanner.nextInt();
				System.out.println("Ingrese el ancho:");
				scanner = new Scanner(System.in);
				ancho = scanner.nextInt();
				for(int i = 0; i < ancho ; i++) {
					for(int j = 0; j< altura; j++) {
						if((i==0 || i == ancho-1) || (j==0 || j == altura-1))
							System.out.print("* ");
						else
							System.out.print("  ");
					}
					System.out.println();
				}
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
