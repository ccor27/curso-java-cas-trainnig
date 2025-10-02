package es.cursojava.poo.interfaces.ejercicios.sistema.pago.pojos;

import es.cursojava.poo.interfaces.ejercicios.sistema.pago.interfaces.Pago;

public abstract class PagoGenerator implements Pago{

	private String usuario;
	private String fecha_pago;
	private String detalle;
	public PagoGenerator(String usuario, String fecha_pago, String detalle) {
		super();
		this.usuario = usuario;
		this.fecha_pago = fecha_pago;
		this.detalle = detalle;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getFecha_pago() {
		return fecha_pago;
	}
	public void setFecha_pago(String fecha_pago) {
		this.fecha_pago = fecha_pago;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	
}
