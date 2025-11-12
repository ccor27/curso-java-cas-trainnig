package es.cursojava.inicio.bbdd;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TbProductosProfe {

	private int id;
	private String nombre;
	private String categoria;
	private double precio;
	private int stock;
	private Date fechaAlta;
	private String estado;
	private String sku;
	private String creadoPor;
	private double iva;
	
}
