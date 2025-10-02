package es.cursojava.poo.interfaces.ejercicios.verduras.muebles;

public class Lechuga extends Verdura implements Desinfectable{

	private String tipo;

	public Lechuga(String procedencia, String tipo) {
		super(procedencia);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void limpiar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desinfectar() {
		System.out.println("Desinfectando Legucha");
	}

}
