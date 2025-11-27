package es.cursojava.hibernate.ejercicios.tres.interfaces;

import java.time.LocalDate;
import java.util.List;

import es.cursojava.hibernate.ejercicios.tres.pojos.Codigo;
import es.cursojava.hibernate.ejercicios.tres.pojos.Curso;


public interface CursoDAO {

	public void guardarCursos(List<Curso> cursos);
	public Curso obtenerCursoPorId(Codigo codigo);
	public List<Curso> obtenerCursosPorCategoria(String categoria);
	public List<Curso> obtenerCursosPorNivelYHorasYFechaInicio(String nivel, int horas, LocalDate fechaInicio);
	public void commitTransaction();
}
