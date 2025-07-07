package es.cursojava.inicio.bluces.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero:");
		int numero = scanner.nextInt();
		scanner.close();
		for(int i = 1; i<=numero;i++) {
			System.out.println("=============="+i+"==============");
			for(int j = 1; j<=10;j++)
				System.out.println(i+" x "+j+" = "+ i*j);
			System.out.println("=================================");
		}

	}

}
