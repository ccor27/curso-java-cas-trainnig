package es.cursojava.poo.interfaces.ejercicios.verduras.muebles;

public abstract class Verdura{

	private String procedencia;

	public Verdura(String procedencia) {
		super();
		this.procedencia = procedencia;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	
	
}
