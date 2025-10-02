package es.cursojava.poo.interfaces.ejercicios.sistema.pago.pojos;


public class PagoCriptomoneda extends PagoGenerator {

	public PagoCriptomoneda(String usuario, String fecha_pago, String detalle) {
		super(usuario, fecha_pago, detalle);
	}

	@Override
	public void procesarPago(double monto) {
		// TODO Auto-generated method stub
		System.out.println("Procesando el pago... Por favor, espere");
		System.out.println("Esperando confirmación de la red blockchain...");
		System.out.println("Se ha hecho el pago exitosamente por " + this.getClass().getSimpleName() +" de "+ this.getDetalle());
	}

}
