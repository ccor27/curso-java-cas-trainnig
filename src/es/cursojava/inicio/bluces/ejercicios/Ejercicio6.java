package es.cursojava.inicio.bluces.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el numero:");
		int num = scanner.nextInt();
		scanner.close();
		while(num != 1) {
			if(num % 2==0)
				num = num/2;
			else
				num = (num*3)+1;
			System.out.println("El numero es: "+num);
		}

	}

}
