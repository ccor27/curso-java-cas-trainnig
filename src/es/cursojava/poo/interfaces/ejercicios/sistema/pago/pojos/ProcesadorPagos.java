package es.cursojava.poo.interfaces.ejercicios.sistema.pago.pojos;

import es.cursojava.poo.interfaces.ejercicios.sistema.pago.interfaces.Pago;

public class ProcesadorPagos {

	public static void realizarPago(Pago metodoPago, double monto) {
		metodoPago.procesarPago(monto);
	}
}
