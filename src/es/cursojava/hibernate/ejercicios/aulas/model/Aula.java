package es.cursojava.hibernate.ejercicios.aulas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CRISTIAN_AULA")
public class Aula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoAula;
	private int capacidad;
	private String ubicacion;
}
