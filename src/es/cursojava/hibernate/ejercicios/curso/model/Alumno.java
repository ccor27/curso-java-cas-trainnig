package es.cursojava.hibernate.ejercicios.curso.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_ALUMNO")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 40)
	private String nombre;
	@Column(unique = true)
	private String email;
	private int edad;
	private String codigoCurso;

}
