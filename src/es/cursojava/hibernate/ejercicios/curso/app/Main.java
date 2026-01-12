package es.cursojava.hibernate.ejercicios.curso.app;

import es.cursojava.hibernate.ejercicios.curso.dao.AlumnoDAO;
import es.cursojava.hibernate.ejercicios.curso.exception.CustomException;
import es.cursojava.hibernate.ejercicios.curso.model.Alumno;

public class Main {
	
	public static void main(String[] args) {
		AlumnoDAO dao = new AlumnoDAO();
		try {
			dao.create(new Alumno(null, "test", "test@gmail.com", 20, "123"));
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("nice!");
	}
}