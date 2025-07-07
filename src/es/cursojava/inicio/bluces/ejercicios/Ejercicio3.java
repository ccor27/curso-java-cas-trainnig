package es.cursojava.inicio.bluces.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner;
		int multiplosDeTres = 0;
		int multiplosDeCinco = 0;
		int num;
		for(int i = 1; i <= 10; i++) {
			System.out.println("Ingresa el numero "+i+":");
			 scanner = new Scanner(System.in);
			 num = scanner.nextInt(); 
			 if(num % 3 == 0)
				 multiplosDeTres++;
			 if(num % 5 == 0)
				 multiplosDeCinco++;
		}
		System.out.println("Numero de multiplos de 3: "+multiplosDeTres);
		System.out.println("Numero de multiplos de 5: "+multiplosDeCinco);

	}

}
