package es.cursojava.hibernate.ejercicios.uno.dao;

import java.util.List;

import org.hibernate.Session;

import es.cursojava.hibernate.ejercicios.uno.pojo.Curso;
import es.cursojava.hibernate.utils.Hibernateutil;

public class CursoDAO {

	
	private Session session;
	
	public CursoDAO() {
		session = Hibernateutil.getSessionFactory();
	}
	public void guardarCurso(Curso curso) {
		session.persist(curso);
	}
	public void eliminarCurso() {
		
	}
	public void actualizarCurso() {
		
	}
	public void obtenerCurso() {
		
	}
	public List<Curso> obtenerTodosLosCursos(){
		return null;
	}
}
