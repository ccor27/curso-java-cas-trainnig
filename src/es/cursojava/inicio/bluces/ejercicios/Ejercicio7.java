package es.cursojava.inicio.bluces.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero de repeticiones de Fibonacci: ");
		int repeticiones = scanner.nextInt();
		scanner.close();
		
		int a = 0, b = 1;
		for (int i = 0; i < repeticiones; i++) {
			System.out.print(a);

			if (i < repeticiones - 1) {
				System.out.print(", ");
			}

			int next = a + b;
			a = b;
			b = next;
		}

	}

}