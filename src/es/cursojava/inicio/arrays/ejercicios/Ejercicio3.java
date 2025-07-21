package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TODO: caso de nombres iguales!
		String [][] aula = new String[2][3];
		Scanner scanner;
		String alumnoABuscar;
		boolean alumnoFueEncontrado = false;
		boolean menu = true;
		int opcion;
		while(menu) {
			System.out.println("===========Colegio-Alumnos===========");
			System.out.println("1. Insertar alumnos");
			System.out.println("2. Mostrar alumnos");
			System.out.println("3. Buscar alumno");
			System.out.println("4. Borrar alumno");
			System.out.println("5. salir");
			System.out.println("=====================================");
			scanner = new Scanner(System.in);
			opcion = scanner.nextInt();
			switch (opcion) {
			case 1: {
				System.out.println("Ahora, por favor ingrese el nombre de los alumnos en cada aula y silla");
				for (int i = 0; i < aula.length; i++) {
					for (int j = 0; j < aula[i].length; j++) {
						if(aula[i][j]==null) {
							System.out.print("Ingrese el nombre del alumno en el aula "+(i+1)+" silla "+(j+1));
							scanner = new Scanner(System.in);
							aula[i][j] = scanner.nextLine();
						}
					}
				}
				break;
			}
			case 2:{
				for (int i = 0; i < aula.length; i++) {
					for (int j = 0; j < aula[i].length; j++) {
						if(aula[i][j]!=null)
							System.out.println("aula "+(i+1)+" silla "+(j+1)+": "+aula[i][j]);
						else
							System.out.println("aula "+(i+1)+" silla "+(j+1)+": vacio");
					}
					System.out.println();
				}
				break;
			}
			case 3:{
				System.out.print("Ingrese el nombre del alumno a buscar:");
				scanner = new Scanner(System.in);
				alumnoABuscar = scanner.nextLine();
				for (int i = 0; i < aula.length; i++) {
					for (int j = 0; j < aula[i].length; j++) {
						if(alumnoABuscar.equalsIgnoreCase(aula[i][j])) {
							System.out.println("El alumno "+alumnoABuscar+" se encuentra en el aula "+(i+1)+" silla "+(j+1));
							alumnoFueEncontrado = true;
							break;
						}
					}
//					if(alumnoFueEncontrado)
//						break;
				}
				if(!alumnoFueEncontrado)
					System.out.println("El alumno "+alumnoABuscar+" no existe!");
				alumnoABuscar = null;
				alumnoFueEncontrado = false;
				break;
			}
			case 4:{
				System.out.print("Ingrese el nombre del alumno a borrar:");
				scanner = new Scanner(System.in);
				alumnoABuscar = scanner.nextLine();
				for (int i = 0; i < aula.length; i++) {
					for (int j = 0; j < aula[i].length; j++) {
						if(alumnoABuscar.equalsIgnoreCase(aula[i][j])) {
							System.out.println("El alumno "+alumnoABuscar+" fue borrado del aula "+(i+1)+" silla "+(j+1));
							aula[i][j] = null;
							alumnoFueEncontrado = true;
							break;
						}
					}
//					if(alumnoFueEncontrado)
//						break;
				}
				if(!alumnoFueEncontrado)
					System.out.println("El alumno "+alumnoABuscar+" no existe!, por lo tanto no es posible borrarlo");
				alumnoABuscar = null;
				alumnoFueEncontrado = false;
				break;
			}
			case 5:{
				menu=false;
				System.out.println("Adios!");
				break;
			}
			default:
				System.out.println("Opcion no valida!");
			}
		}
	}

}
