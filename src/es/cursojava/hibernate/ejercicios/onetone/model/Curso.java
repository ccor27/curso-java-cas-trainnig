package es.cursojava.hibernate.ejercicios.onetone.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TB_CURSO")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Enumerated(EnumType.STRING)
	private Codigo codigo;
	private String titulo;
	private String descripcion;           
    private int duracionHoras;            
    private boolean disponible;          
    private String nivel;                 
    private String categoria;             
    private double precio;                
    private LocalDate fechaInicio;        
    private LocalDate fechaFin;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aula_id")
    private Aula aula;
	@Override
	public String toString() {
		return "\nCurso\n    id: "+id+"\n    codigo: "+codigo+"\n    titulo: "+titulo+"\n    descripcion: "+descripcion+"\n    duracion horas: "+duracionHoras
				+"\n    disponible: "+disponible+"\n    nivel: "+nivel+"\n    categoria: "+categoria+"\n    precio: "+precio+"\n    fecha de inicio: "+fechaInicio
				+"\n    fecha de finalizacion: "+fechaFin+"\n";
	}  
    
    
}
