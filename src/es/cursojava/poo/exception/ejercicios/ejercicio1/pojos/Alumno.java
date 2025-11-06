package es.cursojava.poo.exception.ejercicios.ejercicio1.pojos;

import es.cursojava.poo.exception.ejercicios.ejercicio1.exceptions.NotaInvalidaException;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Alumno {

	private int age;
	private double grade;
	
	public Alumno(int age, double grade)throws NotaInvalidaException, IllegalArgumentException {
		if(age < 0) {
			throw new IllegalArgumentException("La edad del alumno no puede ser negativa!");
		}else{
			this.age = age;
		}
		if(!(grade >= 0 && grade <=10)) {
			throw new NotaInvalidaException("La nota debe estar en un rango de 0 entre 10!");
		}else{
			this.grade = grade;
		}
	}
}
