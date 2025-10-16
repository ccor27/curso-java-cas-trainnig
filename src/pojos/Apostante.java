package pojos;

import interfaces.Imprimible;

public class Apostante extends Persona implements Imprimible{

	private double saldo;

	public Apostante(String nombre, int edad, double saldo) {
		super(nombre, edad);
		this.saldo = saldo;
	}

	/**
	 * Function to update the amount of money after a race
	 * @param valorApostado
	 * @param wasWinner
	 */
	public void actualizarSaldo(double valorApostado, boolean wasWinner) {
		if(wasWinner) {
			this.saldo = valorApostado * 5;
		}else {
			this.saldo -= valorApostado;
		}
	}
	public double getSaldo() {
		return saldo;
	}

	@Override
	public String imprimeDatos() {
		return "Apostante \n"
				+"  nombre: "+this.getNombre()
				+"  edad: "+this.getEdad()
				+"  saldo: "+saldo;
	}
}
