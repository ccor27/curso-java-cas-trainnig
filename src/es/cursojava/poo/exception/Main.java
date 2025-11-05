package es.cursojava.poo.exception;

public class Main {

	public static void main(String[] args) {
		
		Ejercicio1 e = new Ejercicio1();
		int [] arreglo = e.generarArreglo();
		e.rellenarArreglo(arreglo);
		e.mostrarValorPosicion(arreglo);
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i]+" ");
		}
	}
}
