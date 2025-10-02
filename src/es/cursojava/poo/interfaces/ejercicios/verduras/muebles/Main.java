package es.cursojava.poo.interfaces.ejercicios.verduras.muebles;

public class Main {

	public static void main(String[] args) {
		
		Silla silla = new Silla("negro","plastico");
		Lechuga lechuga = new Lechuga("ES", "comestible");
		desinfectar(lechuga);
		Judias judias = new Judias("ES", false);
		desinfectar(judias);
	}
	
	public static void desinfectar(Desinfectable desinfectable) {
		desinfectable.limpiar();
		desinfectable.desinfectar();
	}
}
