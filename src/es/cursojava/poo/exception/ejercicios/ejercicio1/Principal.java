package es.cursojava.poo.exception.ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.poo.exception.ejercicios.Utilidades;
import es.cursojava.poo.exception.ejercicios.ejercicio1.exceptions.NotaInvalidaException;
import es.cursojava.poo.exception.ejercicios.ejercicio1.pojos.Alumno;

public class Principal {

	public static void main(String[] args) {
		List<Alumno> alumnos = new ArrayList<>();
		System.out.println("================================================= Ejercicio 1 =================================================");
		alumnos = pedirAlumnos();		
		mostrarAlumnos(alumnos);
		System.out.println("===============================================================================================================");

	}
	
	private static List<Alumno> pedirAlumnos() {
		List<Alumno> alumnos = new ArrayList<>();
		Alumno a = null;
		for (int i = 0; i < 5; i++) {
			try {
				a = new Alumno(Utilidades.pideDatoNumerico("Ingresa la edad del alumno [" + (i + 1) + "] "),
						Utilidades.pideDatoDecimal("Ingrese la nota del alumno [" + (i + 1) + "] en un rango de 0-10 "));
				alumnos.add(a);
			} catch (NotaInvalidaException nie) {
				System.out.println(nie);
			} catch (IllegalArgumentException ilae) {
				System.out.println(ilae);
			}

		}
		return alumnos;
	}
	private static void mostrarAlumnos(List<Alumno> alumnos) {
		for (Alumno alumno : alumnos) {
			if(alumno!=null) {
				System.out.println(alumno);
			}
		}
	}
}
