package es.cursojava.hibernate.ejercicios.tres;

import java.io.IOException;
import java.util.List;

import es.cursojava.hibernate.ejercicios.tres.service.CursoDAOImpl;
import es.cursojava.hibernate.ejercicios.tres.utils.HibernateUtils;

public class Main {

	public static void main(String[] args) {
	//leer fichero
	//guardar lo obtenido en la base de datos
	//leer de la base de datos con hibernate
//		try {
//			List<?> cursos = HibernateUtils.leerArchivo("./recursos/cursos.txt");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//TODO: terminar esto
		String[] opciones = {
				"  Ver información de un Curso por su Código.",
				"  Ver información de cursos por categoría y fecha inicio > 1/02/2025.",
				"  Ver información de todos los cursos por nivel, por horas > y fecha inicio.",
				"  Salir."};
		CursoDAOImpl cursoDAOImpl = new CursoDAOImpl();
		HibernateUtils.menuHibernateCursos(opciones, cursoDAOImpl);
	}

}
