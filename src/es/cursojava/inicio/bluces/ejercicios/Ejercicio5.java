package es.cursojava.inicio.bluces.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero de alumnos:");
		int numeroAlumnos = scanner.nextInt();
		int i = 1;
		double nota = 0;
		double media = 0;
		do{
			System.out.println("Ingrese la nota del alumno "+i+":");
			scanner = new Scanner(System.in);
			nota += scanner.nextDouble();
			
			i++;
		}while(i<=numeroAlumnos);
		scanner.close();
		media = nota / numeroAlumnos;
		System.out.println("La media es:"+media);
	}
}
/*
 Sum of notes = 7.5 + 8.2 + 6.0 + 9.7 + 5.4 = 36.8

Number of students = 5

Media (average) = 36.8 ÷ 5 = 7.36
 */
