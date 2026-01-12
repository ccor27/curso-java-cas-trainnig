package es.cursojava.hibernate.ejercicios.curso.dao;

import java.util.List;

import es.cursojava.hibernate.ejercicios.curso.dto.AlumnoRequestDTO;
import es.cursojava.hibernate.ejercicios.curso.dto.AlumnoResponseDTO;
import es.cursojava.hibernate.ejercicios.curso.exception.CustomException;
import es.cursojava.hibernate.ejercicios.curso.model.Alumno;

public interface IAlumnoDAO {

	Alumno create(Alumno alumno)throws CustomException;
	List<Alumno> getAll()throws CustomException;
}
