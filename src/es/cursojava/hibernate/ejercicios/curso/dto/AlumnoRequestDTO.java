package es.cursojava.hibernate.ejercicios.curso.dto;

public record AlumnoRequestDTO(
		String nombre,
		String email,
		int edad,
		String codigoCurso) {

}
