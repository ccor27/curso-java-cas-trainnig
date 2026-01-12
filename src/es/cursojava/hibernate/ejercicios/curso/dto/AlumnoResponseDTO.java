package es.cursojava.hibernate.ejercicios.curso.dto;

public record AlumnoResponseDTO(
		Long id,
		String nombre,
		String email,
		int edad,
		String codigoCurso) {

}
