package es.cursojava.inicio.bluces.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero de tenistas del torneo:");
		int numeroTenistas = scanner.nextInt();
		int numeroTenistasTop10 = 0;
		int posicion = 0;
		for(int i = 1; i <= numeroTenistas; i++) {
			System.out.println("Ingrese el puesto de la APT del tenista: ");
			scanner = new Scanner(System.in);
			posicion = scanner.nextInt();
			if(posicion >= 1 && posicion <= 10)
				numeroTenistasTop10++;
		}
		System.out.println("El numero de tenistas en el top 10 son: "+numeroTenistasTop10);
		scanner.close();
	}

}
