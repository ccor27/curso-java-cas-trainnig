package es.cursojava.poo.interfaces;

public class Main {

	public static void main(String[] args) {
		
		Silla silla = new Silla("negro","plastico");
		Lechuga lechuga = new Lechuga("ES", "comestible");
		Judias judias = new Judias("ES", false);
	}
	
	public static void desinfectar(Desinfectable desinfectable) {
		desinfectable.desinfectar();
	}
}
