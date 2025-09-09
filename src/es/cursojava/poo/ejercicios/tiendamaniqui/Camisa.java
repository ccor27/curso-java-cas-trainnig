package es.cursojava.poo.ejercicios.tiendamaniqui;

public class Camisa {

	private String color;
	private double precio;
	private String talla;
	private Boton[] boton;

	public Camisa(String color, double precio, String talla, Boton[] boton) {
		super();
		this.color = color;
		this.precio = precio;
		this.talla = talla;
		this.boton = boton;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public Boton[] getBoton() {
		return boton;
	}

	public void setBoton(Boton[] boton) {
		this.boton = boton;
	}
	public String mostrarInfo() {
		return "Info camisan\n"
	+ "     color: "+this.color+
	"\n     precio: "+this.precio+
	"\n     talla: "+this.talla+
	"\n     botones: \n"+ infoBotones();
	}

	private String infoBotones() {
		String info="";
		for (Boton boton : boton) {
			if(boton!=null) {
				info += "   "+boton.mostrarInfo();
				info +="\n   -----------------------\n";
			}
		}
		return info;
	}

}
