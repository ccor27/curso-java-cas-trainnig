package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan;
		System.out.print("Ingrese el numero de alumnos: ");
		scan = new Scanner(System.in);
		int numeroAlumnos = scan.nextInt();
		int numeroAprobados = 0;
		double media = 0;
		double sumaNotas = 0;
		double[] notas = new double[numeroAlumnos];
		for (int i = 0; i < numeroAlumnos; i++) {
			System.out.print("Ingrese la nota del alumno " + (i + 1) + " :");
			scan = new Scanner(System.in);
			notas[i] = scan.nextDouble();
		}
		scan.close();
		for(int i = 0; i < numeroAlumnos; i++) {
			if (notas[i] >= 5.0)
				numeroAprobados++;
			sumaNotas += notas[i];
		}
		media = sumaNotas / numeroAlumnos;
		System.out.println("El numero de alumnos que han aprobado es: " + numeroAprobados + "\n"
				+ "La media de todos los alumnos es: " + media);
	}
//		int [][] matrix = {
//				            {1,2,3},
//				            {4,5,6}
//				          };
//		for (int i = 0; i < matrix.length; i++) {//para recorrer las filas
//			//System.out.println("estamos en la fila: "+i);
//			for (int j = 0; j < matrix[i].length; j++) {//para recorrer las columnas
//				//System.out.println("estamos en la columna: "+j);
//				System.out.print(matrix[i][j]+" ");
//			}
//			System.out.println();
//		}

}
