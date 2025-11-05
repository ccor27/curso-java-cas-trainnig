package es.cursojava.poo.exception;


import es.cursojava.utils.Utilidades;

public class Ejercicio1 {

	public int[] generarArreglo() {
		int tamanio = Utilidades.pideDatoNumerico("Ingresa el tamaño del arreglo");
		int[] arreglo = new int[tamanio];
		return arreglo;
	}

	public void rellenarArreglo(int[] arreglo) {
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = Utilidades.pideDatoNumerico("Ingresa un numero para la posicion " + (i + 1));
		}
	}

	public void mostrarValorPosicion(int[] arreglo) {
		boolean flag = true;
		while (flag) {
			try {
				int num = Utilidades
						.pideDatoNumerico("Ingresa la posicion a mostrar (0 - " + (arreglo.length - 1) + ")");
				System.out.println("El numero en la posicion " + arreglo[num]);
				flag = false;
			} catch (Exception e) {
				System.out.println("La posicion no existe, ingrese una valida (0 - " + (arreglo.length - 1) + ")");
			}
		}

	}
}
