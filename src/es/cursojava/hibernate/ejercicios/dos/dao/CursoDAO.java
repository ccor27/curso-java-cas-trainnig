package es.cursojava.hibernate.ejercicios.dos.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.hibernate.ejercicios.dos.pojo.Curso;
import es.cursojava.hibernate.ejercicios.dos.utils.HibernateUtil;

public class CursoDAO {

	private Session session;
	private Transaction transaction;
	
	public CursoDAO() {
	session = HibernateUtil.getSessionFactory();
	transaction = session.beginTransaction();
	}
	
	public void guardarCursos(List<Curso> cursos) {
		for (Curso curso : cursos) {
			session.persist(curso);
		}
	}
	
	public Curso obtenerCursoPorId(Long id) {
		return session.get(Curso.class, id);
	}
	
	public List<Curso> obtenerCursos(){
		return session.createQuery("FROM Curso",Curso.class).list();
	}
	
	public void commitTransaction() {
		transaction.commit();
	}
}
