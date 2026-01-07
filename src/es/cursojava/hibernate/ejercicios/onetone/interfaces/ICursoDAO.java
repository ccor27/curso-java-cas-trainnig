package es.cursojava.hibernate.ejercicios.onetone.interfaces;


import es.cursojava.hibernate.ejercicios.onetone.exception.CursoException;
import es.cursojava.hibernate.ejercicios.onetone.model.Curso;

public interface ICursoDAO {

	Curso save(Curso curso) throws CursoException;
	Curso findParticalCursoById(Long id)throws CursoException;
	Curso findCompleteCursoById(Long id)throws CursoException;
}
