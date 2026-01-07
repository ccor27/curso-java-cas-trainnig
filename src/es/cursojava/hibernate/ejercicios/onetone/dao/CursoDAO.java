package es.cursojava.hibernate.ejercicios.onetone.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.hibernate.ejercicios.onetone.exception.CursoException;
import es.cursojava.hibernate.ejercicios.onetone.interfaces.ICursoDAO;
import es.cursojava.hibernate.ejercicios.onetone.model.Curso;
import es.cursojava.hibernate.utils.Hibernateutil;

public class CursoDAO implements ICursoDAO {

	@Override
	public Curso save(Curso curso) throws CursoException{
		Transaction tx = null;
		try(Session session = Hibernateutil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			session.persist(curso);
			session.flush();
			tx.commit();
			return curso;
		}catch (Exception e) {
			if (tx != null) tx.rollback();
			throw new CursoException("Error: "+e.getLocalizedMessage());
		}
	}

	@Override
	public Curso findParticalCursoById(Long id)throws CursoException {
		Transaction tx = null;
		try(Session session = Hibernateutil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			Curso curso = session.get(Curso.class, id);
			tx.commit();
			return curso;
		}catch (Exception e) {
			if (tx != null) tx.rollback();
			throw new CursoException("Error: "+e.getLocalizedMessage());
		}
	}

	@Override
	public Curso findCompleteCursoById(Long id)throws CursoException {
		Transaction tx = null;
		try(Session session = Hibernateutil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			Curso curso = session.get(Curso.class, id);
			if(curso!=null) {
				curso.getAula();
			}
			tx.commit();
			return curso;
		}catch (Exception e) {
			if (tx != null) tx.rollback();
			throw new CursoException("Error: "+e.getLocalizedMessage());
		}
	}

	
	
}
