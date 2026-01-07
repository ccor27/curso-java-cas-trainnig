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
		LocalDate fechaInicio = LocalDate.of(2025,2,1);
		Query<Curso> query = session.createQuery("from Curso where categoria =: categoriaParam and fechaInicio >: fechaInicioParam ",Curso.class);
		query.setParameter("categoriaParam", categoria);
		query.setParameter("fechaInicioParam", fechaInicio);
		return query.getResultList();
	}

	@Override
	public List<Curso> obtenerCursosPorNivelYHorasYFechaInicio(String nivel, int horas, LocalDate fechaInicio) {
		StringBuilder hql = new StringBuilder("from Curso where 1=1");
		if(nivel!=null) {
			hql.append("and nivel =: nivelParam");
		}
		if(horas>0) {
			hql.append("and duracionHoras =: horasParam");
		}
		if(fechaInicio!=null) {
			hql.append("and fechaInicio =: fechaInicioParam");
		}
		Query<Curso> query = session.createQuery(hql.toString(), Curso.class);
		if (nivel != null && !nivel.isBlank()) {
	        query.setParameter("nivelParam", nivel);
	    }
	    if ( horas > 0) {
	        query.setParameter("horasParam", horas);
	    }
	    if (fechaInicio != null) {
	        query.setParameter("fechaInicioParam", fechaInicio);
	    }
	    return query.getResultList();
//		Query<Curso> query = session.createQuery("from Curso where nivel =: nivelParam and fechaInicio >: fechaInicioParam and duracionHoras >=: horasParam",Curso.class);
//		query.setParameter("nivelParam", nivel);
//		query.setParameter("fechaInicioParam", fechaInicio);
//		query.setParameter("horasParam", horas);
//		return query.getResultList();
	}

	@Override
	public void commitTransaction() {
		transaction.commit();
		
	}

}
