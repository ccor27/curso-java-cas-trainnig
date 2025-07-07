package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String operacion = scan.nextLine();
		String operacion2 = "suma";
		String operacion21 = "suma";
		String operacion3 = new String("suma");
		String operacion4 = "suma";
		operacion4 = operacion4.toUpperCase();
		
		if (operacion3.equals(operacion4)) {
			System.out.println("Suma0");
		}
		
		if (operacion == operacion2) {
			System.out.println("Suma1");
		}
		
		if(operacion2 == operacion21) {
			System.out.println("Suma2");
		}
		
		if(operacion3 == operacion2) {
			System.out.println("Suma3");
		}
		
		if(operacion3.equals(operacion2)) {
			System.out.println("Suma4");
		}
	}
	
}
