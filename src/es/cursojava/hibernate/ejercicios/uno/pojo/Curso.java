package es.cursojava.hibernate.ejercicios.uno.pojo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "TB_CURSO")
@Builder
@NoArgsConstructor
@AllArgsConstructor //si la elimino me da error el builder
@Getter
@Setter
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull //avoid objects with this attribute null
	@Column(nullable = false,unique = true,length = 20)//generate a constraint in DB
	private String codigo;
	
	@NotBlank
	@NotNull
	@Column(nullable = false,length = 100)
	private String nombre;
	
	@Column(length = 500)
	private String descripcion;
	
	@NotNull(message = "No puedes ingresar horas negativas")
	@Positive // to avoid negative numbers
	@Column(name = "horas_totales",nullable = false)
	private int horasTotales;
	
	@NotNull(message = "Debes especificar si es o no activo")
	@Column(nullable = false)
	private boolean activo = true;
	
	@NotNull(message = "No puedes tener un curso sin nivel")
	@Column(nullable = false, length = 20)
	private String nivel;

	@Column(length = 50)
	private String categoria;
	
	@Positive
	private double precio;
	
	@Column(name = "fecha_inicio")
	private LocalDate fechaInicio;
	
	//Si existe, debe ser igual o posterior a fecha_inicio. -> se puede hacer con anotaciones propias
	@Column(name = "fecha_fin")
	private LocalDate fechaFin;
}
