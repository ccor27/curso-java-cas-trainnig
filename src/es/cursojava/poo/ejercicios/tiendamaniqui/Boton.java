package es.cursojava.poo.ejercicios.tiendamaniqui;

public class Boton {

	private String color;
	private int tamano;
	private String forma;

	public Boton(String color, int tamano, String forma) {
		super();
		this.color = color;
		this.tamano = tamano;
		this.forma = forma;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String mostrarInfo() {
		return "Info boton\n" +
	"     color: " + this.color + 
	"\n     tamaño: " + this.tamano +
	"\n     forma: " + this.forma;
	}
}
