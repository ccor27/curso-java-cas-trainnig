package es.cursojava.hibernate.ejercicios.uno.dao;

import java.util.List;

import org.hibernate.Session;

import es.cursojava.hibernate.ejercicios.uno.pojo.CursoPrimerEjercicio;
import es.cursojava.hibernate.utils.Hibernateutil;

public class CursoDAO {

	
	private Session session;
	
	public CursoDAO() {
		session = Hibernateutil.getSessionFactory();
	}
	public void guardarCurso(CursoPrimerEjercicio curso) {
		session.persist(curso);
	}
	public void eliminarCurso() {
		
	}
	public void actualizarCurso() {
		
	}
	public void obtenerCurso() {
		
	}
	public List<CursoPrimerEjercicio> obtenerTodosLosCursos(){
		return null;
	}
}
