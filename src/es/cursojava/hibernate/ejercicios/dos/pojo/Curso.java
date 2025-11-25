package es.cursojava.hibernate.ejercicios.dos.pojo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
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
}
