package es.cursojava.poo.interfaces;

public class Judias extends Verdura implements Desinfectable{

	private boolean tieneVaina;

	public Judias(String procedencia, boolean tieneVaina) {
		super(procedencia);
		this.tieneVaina = tieneVaina;
	}

	public boolean isTieneVaina() {
		return tieneVaina;
	}

	public void setTieneVaina(boolean tieneVaina) {
		this.tieneVaina = tieneVaina;
	}

	@Override
	public void limpiar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desinfectar() {
		System.out.println("Desinfectando judia");
		
	}

}
