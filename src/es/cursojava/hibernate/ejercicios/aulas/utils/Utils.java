package es.cursojava.hibernate.ejercicios.aulas.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Utils {

	private final static String	PATH_DATA_ALUMNO_CURSOS = "./recursos/alumnos_curso.txt";
	private final static String	PATH_DATA_AULAS = "";
	private final static String	PATH_DATA_CURSOS_ALUMNO = "./recursos/";
	
	public static void readDataAndStore() throws IOException {
		//create the aulas
		List<String> aulas = readData(PATH_DATA_AULAS);
		//create the curso
		//create the alumnos
		List<String> alumnos = readData(PATH_DATA_ALUMNO_CURSOS);
	}
	private static void processAulas(List<String> alumasString) {
		//1. avoid the first line, it is the table's header
		//2.loop the list
		//3.get data, build dto
	}
	private static List<?> processAulumnoData(){
		//1. avoid the first line, it is the table's header
		//2. loop the list
		//2.1 get info (but not the 
		return null;
	}
	private static List<String> readData(String nombre) throws IOException {
		Path path = Paths.get(nombre);
		// leer todas las lineas del fichero
		return  Files.readAllLines(path);
	}
}
