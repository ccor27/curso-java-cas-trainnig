package es.cursojava.hibernate.ejercicios.onetone.dto;

import java.time.LocalDate;

public record CursoRequestDTO(
		 String codigo,
		 String titulo,
		 String descripcion,           
	     int duracionHoras,            
	     boolean disponible,          
	     String nivel,                 
	     String categoria,             
	     double precio,                
	     LocalDate fechaInicio,        
	     LocalDate fechaFin,
	     AulaRequestDTO aula) {}
