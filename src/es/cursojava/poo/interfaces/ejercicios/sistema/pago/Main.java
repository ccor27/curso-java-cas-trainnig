package es.cursojava.poo.interfaces.ejercicios.sistema.pago;

import es.cursojava.poo.interfaces.ejercicios.sistema.pago.pojos.PagoCriptomoneda;
import es.cursojava.poo.interfaces.ejercicios.sistema.pago.pojos.PagoPaypal;
import es.cursojava.poo.interfaces.ejercicios.sistema.pago.pojos.PagoTarjetaCredito;
import es.cursojava.poo.interfaces.ejercicios.sistema.pago.pojos.ProcesadorPagos;

public class Main {

	public static void main(String[] args) {
		PagoTarjetaCredito tarjetaDeCredito = new PagoTarjetaCredito("juan", "2-10-25", "xbox360");
		PagoPaypal paypal = new PagoPaypal("Andrea", "2-10-25", "perfume");
		PagoCriptomoneda cript = new PagoCriptomoneda("Pedro", "2-10-25", "ordenador");	
		
		ProcesadorPagos .realizarPago(tarjetaDeCredito, 150);
		System.out.println();
		ProcesadorPagos .realizarPago(paypal, 200);
		System.out.println();
		ProcesadorPagos .realizarPago(cript, 250);
	}

}
