package es.cursojava.poo.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Botella {

	private double capacidad;
	private String nombre;
	private String material;
	private int tamanio;
	private String forma;
	@Exclude
	private String contenido;
}
