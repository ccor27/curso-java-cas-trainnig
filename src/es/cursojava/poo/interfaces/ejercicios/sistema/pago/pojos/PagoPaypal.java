package es.cursojava.poo.interfaces.ejercicios.sistema.pago.pojos;


public class PagoPaypal extends PagoGenerator {

	public PagoPaypal(String usuario, String fecha_pago, String detalle) {
		super(usuario, fecha_pago, detalle);
	}

	@Override
	public void procesarPago(double monto) {
		// TODO Auto-generated method stub
		System.out.println("Redirigiendo a PayPal para completar el pago...");
		System.out.println("Esperando confirmación de PayPal...");
		System.out.println("Se ha hecho el pago exitosamente por " + this.getClass().getSimpleName() +" de "+ this.getDetalle());
	}

}
