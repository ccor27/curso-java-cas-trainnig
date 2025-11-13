package es.cursojava.inicio.ficheros.ejercicios;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Producto {

	private int id;
	private String name;
	private String category;
	private double price;
	private String stock;
	private String status;
	private String sku;
	private String creator;
	private int iva;
	private Date createAt;
}
