package es.cursojava.poo.mapas.ejercicios.alumnos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import es.cursojava.poo.Alumno;

public class Main {

	public static void main(String[] args) {
		ejercicio1();
		System.out.println("====================================================== Ejercicio 2 ======================================================");
		List<Colegio> colegios = crearColegiosEjercicio2();
		for (Colegio colegio : colegios) {
			System.out.println("======================= Datos colegio =======================");
			colegio.mostrarDatosColegio();
			System.out.println("=============================================================");
		}
	}
	
	public static List<Colegio> crearColegiosEjercicio2() {
		Map<String, List<Alumno>> aulas1 = new HashMap<>();
		aulas1.put("aula1", Arrays.asList(
		    new Alumno("Pedro", "García", "1232345A", 5.4, new String[]{"Matemáticas", "Física"}),
		    new Alumno("María", "López", "2232345B", 7.8, new String[]{"Química", "Biología"})
		));
		aulas1.put("aula2", Arrays.asList(
		    new Alumno("Luis", "Martínez", "3232345C", 6.2, new String[]{"Historia"})
		));
		aulas1.put("aula3", Arrays.asList(
		    new Alumno("Ana", "Pérez", "4232345D", 9.1, new String[]{"Literatura", "Arte"}),
		    new Alumno("Carlos", "Sánchez", "5232345E", 4.7, null),
		    new Alumno("Lucía", "Gómez", "6232345F", 8.3, new String[]{"Matemáticas"}),
		    new Alumno("Jorge", "Ruiz", "7232345G", 3.9, new String[]{"Deporte"})
		));

		Colegio colegio1 = new Colegio("Colegio San Juan", "Getafe", aulas1);

		Map<String, List<Alumno>> aulas2 = new HashMap<>();
		aulas2.put("aulaA", Arrays.asList(
		    new Alumno("Laura", "Díaz", "8232345H", 7.0, new String[]{"Física"}),
		    new Alumno("David", "Fernández", "9232345I", 6.5, new String[]{"Química", "Matemáticas"})
		));
		aulas2.put("aulaB", Arrays.asList(
		    new Alumno("Sara", "Morales", "1032345J", 8.9, new String[]{"Historia", "Arte"})
		));

		Colegio colegio2 = new Colegio("Colegio Nuestra Señora", "Madrid", aulas2);

		Map<String, List<Alumno>> aulas3 = new HashMap<>();
		aulas3.put("grupo1", Arrays.asList(
		    new Alumno("Elena", "Navarro", "1132345K", 9.3, new String[]{"Literatura"}),
		    new Alumno("Pablo", "Cruz", "1232345L", 5.1, null)
		));
		aulas3.put("grupo2", Arrays.asList(
		    new Alumno("Marta", "Ortiz", "1332345M", 7.7, new String[]{"Biología", "Química"}),
		    new Alumno("Alberto", "Vega", "1432345N", 6.9, new String[]{"Matemáticas"})
		));

		Colegio colegio3 = new Colegio("Colegio El Roble", "Barcelona", aulas3);
		return Arrays.asList(colegio1,colegio2,colegio3);
	}
	public static void  ejercicio1() {
		
		Map<String, List<Alumno>> aulas = new HashMap<String, List<Alumno>>();
		List<Alumno> alumnosAula1 = Arrays.asList(
				new Alumno("pedro","1232345A","osorio", 5.4, null),
				new Alumno("María", "2232345B","gomez", 7.8, null)
				);
		aulas.put("aula1", alumnosAula1);
		List<Alumno> alumnosAula2 = Arrays.asList(
				new Alumno("Luis", "3232345C","perez", 6.2, null)
				);
		aulas.put("aula2", alumnosAula2);
		List<Alumno> alumnosAula3 = Arrays.asList(
				   new Alumno("Ana", "4232345D","osorio", 9.1, null),
				    new Alumno("Carlos", "5232345E","García", 4.7, null),
				    new Alumno("Lucía", "6232345F","Sánchez", 8.3, null),
				    new Alumno("Jorge", "7232345G","Ruiz", 3.9, null)
				);
		aulas.put("aula3", alumnosAula3);
		
		Colegio colegio = new Colegio("colegio 1", "getafe",aulas);
		
		colegio.mostrarCantidadAulas();
		System.out.println();
		colegio.mostrarDatosDeAlumosPorAula();
		System.out.println();
		colegio.mostrarCantidadAlumnosPorAula();
		System.out.println();
		colegio.mostrarAlumnosDeUnAula("aula1");
		System.out.println();
		colegio.mostrarAlumnosDeUnAula("aula10");
		System.out.println();
		colegio.mostrarAulaConElAlumnoConMasNotaMedia();
	}
}
