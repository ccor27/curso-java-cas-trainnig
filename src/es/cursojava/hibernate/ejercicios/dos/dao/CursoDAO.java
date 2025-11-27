package es.cursojava.hibernate.ejercicios.dos.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.hibernate.ejercicios.dos.pojo.CursoDos;
import es.cursojava.hibernate.ejercicios.dos.utils.HibernateUtil;

public class CursoDAO {

	private Session session;
	private Transaction transaction;
	
	public CursoDAO() {
	session = HibernateUtil.getSessionFactory();
	transaction = session.beginTransaction();
	}
	
	public void guardarCursos(List<CursoDos> cursos) {
		for (CursoDos curso : cursos) {
			session.persist(curso);
		}
	}
	
	public CursoDos obtenerCursoPorId(Long id) {
		return session.get(CursoDos.class, id);
	}
	
	public List<CursoDos> obtenerCursos(){
		return session.createQuery("FROM Curso",CursoDos.class).list();
	}
	
	public void commitTransaction() {
		transaction.commit();
	}
}
