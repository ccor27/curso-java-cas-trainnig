package es.cursojava.hibernate.ejercicios.aulas.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "CRISTIAN_CURSO")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	private String descripcion;
	private int horasTotales;
	private boolean activo;
	private Nivel nivel;
	private Categoria categoria;
	private double precio;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private LocalDate fechaCreacion;
	//relacion con aula
	@ManyToOne
	@JoinColumn(
			name = "codigo_aula",
			referencedColumnName = "codigoAula")
	private Aula aula;
	@OneToMany(mappedBy = "curso")
	private List<Alumno> alumnos;
}
