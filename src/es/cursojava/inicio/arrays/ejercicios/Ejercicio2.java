package es.cursojava.inicio.arrays.ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {

		// mostrar la diagonal
		// invertir la diagonal
		// mostrar la diagonal (que fue invertida)
		int[][] matriz = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i == j)
					System.out.print(matriz[i][j]);
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		for (int i = 0; i < matriz.length / 2; i++) {
			// intercambiamos los elementos en la diagonal
			int temp = matriz[i][i];
			matriz[i][i] = matriz[matriz.length - 1 - i][matriz.length - 1 - i];
			matriz[matriz.length - 1 - i][matriz.length - 1 - i] = temp;
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i == j)
					System.out.print(matriz[i][j]);
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
