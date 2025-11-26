package es.cursojava.hibernate.ejercicios.dos;

import java.io.IOException;
import java.util.List;

import es.cursojava.hibernate.ejercicios.dos.dao.CursoDAO;
import es.cursojava.hibernate.ejercicios.dos.pojo.Curso;
import es.cursojava.hibernate.ejercicios.dos.utils.HibernateUtil;

public class Main {

public static void main(String[] args) {
		
		try {
			List<Curso> cursos = HibernateUtil.leerArchivo("./recursos/cursos.txt");
			CursoDAO dao = new CursoDAO();
			dao.guardarCursos(cursos);
			cursos = dao.obtenerCursos();
			dao.commitTransaction();
			for (Curso curso :  cursos) {
				System.out.println(curso);
			}
		} catch (IOException e) {
			//Error reading file!
			e.printStackTrace();
		}

	}

}
