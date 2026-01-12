package es.cursojava.examen.parteTres;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Producto {

	private int id;
	private String nombre;
	private String tipo;
	private double precio;
	private int stock;
}
