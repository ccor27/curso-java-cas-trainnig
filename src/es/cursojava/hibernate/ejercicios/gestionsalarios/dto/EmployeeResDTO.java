package es.cursojava.hibernate.ejercicios.gestionsalarios.dto;

import es.cursojava.hibernate.ejercicios.gestionsalarios.pojo.Deparment;

public record EmployeeResDTO(
		Long id,
		String nif,
		String name,
		Deparment deparment,
		double salary) {

}
