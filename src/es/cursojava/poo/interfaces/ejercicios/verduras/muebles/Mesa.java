package es.cursojava.poo.interfaces.ejercicios.verduras.muebles;

public class Mesa extends Mueble {

	private String forma;

	public Mesa(String color, String forma) {
		super(color);
		this.forma = forma;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	@Override
	public void limpiar() {
		System.out.println("Limpiando mesa");		
	}

}
