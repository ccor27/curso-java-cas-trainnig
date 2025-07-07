package es.cursojava.inicio;

import java.util.Scanner;

public class TiposDeDatos {

	public static void main(String[] args) {
		
		//******************************************
		//Primitive types
		//******************************************
		
		//Integers
		//byte 8 (-128,127) 
		byte age = 10;
		//short 16 (-32.768, 32.767)
		short number2 = 123;
		//int 32 (-2.147.483.648, 2.147.483.647)
		int number = 2300;
		//long 64 [ -2^(63), 2^(63) -1 ] 
		long number3 = 1890;
		
		//Decimals
		double decimal1 = 9.7;
		float decimal2 = 100.9f;
		
		//Characters
		char character = 48;
		
		//Booleans
		boolean isGrather = 7 > 8;

		//******************************************
		//Object types
		//******************************************
		String name = "Cristian Osorio";
		name.toUpperCase();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your surname:");
		String surname = scanner.nextLine();
		
		System.out.println("Enter your height:");
		double height = scanner.nextDouble();
		
		System.out.println(name + " "+ surname +" "+height);
		scanner.close();
	}

}
