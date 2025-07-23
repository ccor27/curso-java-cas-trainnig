package es.cursojava.inicio.ejercicios;

import java.util.Scanner;

public class PideDatos {

	public static void main(String[] args) {
		
		String streetName;
		int number;
		String population;
		boolean isStreetBig;
		double randomNumber;
		boolean isNumberGrater;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("------------------Ingresa los detalles de la direccion------------------");

		System.out.println("Ingresa el nombre de la calle");
		scanner = new Scanner(System.in);
		streetName = scanner.nextLine();
		
		System.out.println("Ingresa el numero");
		scanner = new Scanner(System.in);
		number = scanner.nextInt();
		
		System.out.println("Ingresa la poblacion");
		scanner = new Scanner(System.in);
		population = scanner.nextLine();
		
		scanner.close();
		System.out.println("Los datos ingresados son: [ calle: "+streetName+" , numero: "+number+" , poblacion: "+population+" ]");
		
		isStreetBig = number > 100;
		
		System.out.println("La calle es grande: "+isStreetBig);
		
		randomNumber = Math.random();
		
		System.out.println("Numero random: "+ randomNumber);
		
		isNumberGrater = randomNumber > 0.5;
		
		System.out.println("Es el numero mayor que 0,5: "+isNumberGrater);

	}

}
