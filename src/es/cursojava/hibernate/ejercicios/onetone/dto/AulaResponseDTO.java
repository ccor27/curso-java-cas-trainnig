package es.cursojava.hibernate.ejercicios.onetone.dto;

public record AulaResponseDTO(
		 Long id,
		 String codigoAula,
		 int capacidad,
		 String ubicacion) {}
