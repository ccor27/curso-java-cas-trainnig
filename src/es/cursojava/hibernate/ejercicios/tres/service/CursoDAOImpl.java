package es.cursojava.hibernate.ejercicios.tres.service;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import es.cursojava.hibernate.ejercicios.dos.utils.HibernateUtil;
import es.cursojava.hibernate.ejercicios.tres.interfaces.CursoDAO;
import es.cursojava.hibernate.ejercicios.tres.pojos.Codigo;
import es.cursojava.hibernate.ejercicios.tres.pojos.Curso;

public class CursoDAOImpl implements CursoDAO {
	
	private Session session;
	private Transaction transaction;
	
	public CursoDAOImpl() {
	session = HibernateUtil.getSessionFactory();
	transaction = session.beginTransaction();
	}

	@Override
	public void guardarCursos(List<Curso> cursos) {
		// TODO Auto-generated method stub

	}

	@Override
	public Curso obtenerCursoPorId(Codigo codigo) {
		Query<Curso> query = session.createQuery("from Curso where codigo =: codigoParam",Curso.class);
		query.setParameter("codigoParam",codigo);
		return query.uniqueResult();
	}

	@Override
	public List<Curso> obtenerCursosPorCategoria(String categoria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Curso> obtenerCursosPorNivelYHorasYFechaInicio(String nivel, int horas, LocalDate fechaInicio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void commitTransaction() {
		transaction.commit();
		
	}

}
