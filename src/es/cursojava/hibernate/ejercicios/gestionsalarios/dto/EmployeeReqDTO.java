package es.cursojava.hibernate.ejercicios.gestionsalarios.dto;


public record EmployeeReqDTO(
		String nif,
		String name,
		String deparment,
		double salary) {

}
