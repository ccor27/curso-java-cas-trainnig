package es.cursojava.poo.exception;

import es.cursojava.utils.Utilidades;

public class TestException {

	public static void main(String[] args) {
		
//		int[] numeros = {1,2,3,4,5,6,7,8,9,10};
//		System.out.println(numeros[10]);//this will throw an ArrayIndexOutOfBoundsException
		int num = Utilidades.pideDatoNumerico("Ingrese un numero");
		System.out.println("el numero es: "+num);
	}
}

