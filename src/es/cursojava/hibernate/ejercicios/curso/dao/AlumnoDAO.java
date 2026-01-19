package es.cursojava.hibernate.ejercicios.curso.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.hibernate.ejercicios.curso.exception.CustomException;
import es.cursojava.hibernate.ejercicios.curso.model.Alumno;
import es.cursojava.hibernate.utils.Hibernateutil;

public class AlumnoDAO implements IAlumnoDAO{

	@Override
	public Alumno create(Alumno alumno) throws CustomException {
		Transaction tx = null;
		try(Session session =  Hibernateutil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			session.persist(alumno);
			session.flush();
			tx.commit();
			return alumno;
		}catch (Exception e) {
			if (tx != null) tx.rollback();
			throw new CustomException("Error: "+e.getLocalizedMessage(),null);
		}
	}

	@Override
	public List<Alumno> getAll() throws CustomException {
		Transaction tx = null;
		try(Session session =  Hibernateutil.getSessionFactory().openSession()){
			   tx = session.beginTransaction();

		        List<Alumno> alumnos = session
		                .createQuery("from Alumno", Alumno.class)
		                .getResultList();

		        tx.commit();
		        return alumnos;
		}catch (Exception e) {
			if (tx != null) tx.rollback();
			throw new CustomException("Error: "+e.getLocalizedMessage(),null);
		}
	}


}
