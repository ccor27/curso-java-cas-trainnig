package es.cursojava.poo.interfaces.ejercicios.sistema.pago.pojos;


public class PagoTarjetaCredito extends PagoGenerator{

	public PagoTarjetaCredito(String usuario, String fecha_pago, String detalle) {
		super(usuario, fecha_pago, detalle);
	}

	@Override
	public void procesarPago(double monto) {
		// TODO Auto-generated method stub
		System.out.println("Procesando el pago... Por favor, espere");
		System.out.println("Verificando los datos de la tarjeta...");
		System.out.println("Se ha hecho el pago exitosamente por " + this.getClass().getSimpleName() +" de "+ this.getDetalle());
	}

}
