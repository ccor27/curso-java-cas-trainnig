package es.cursojava.poo.interfaces;

public abstract class Mueble {

	private String color;

	
	public Mueble(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
