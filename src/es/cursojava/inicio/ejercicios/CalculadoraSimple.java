package es.cursojava.inicio.ejercicios;

import java.util.Arrays;
import java.util.Collections;

public class CalculadoraSimple {

	// validar que haya al menos 3 parametros
	// el primer parametro es un signo el resto numeros
	// hacer las validaciones necesarias
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length > 2) {
			if (args[0].equalsIgnoreCase("-") || args[0].equalsIgnoreCase("+") || args[0].equalsIgnoreCase("*")
					|| args[0].equalsIgnoreCase("/") || args[0].equalsIgnoreCase("%")) {

				String signo = args[0];
				Integer[] numeros = new Integer[args.length - 1];
				int k = 0;
				for (int i = 1; i < args.length; i++) {
					numeros[k++] = Integer.parseInt(args[i]);
				}
				Arrays.sort(numeros, Collections.reverseOrder());
				int result = numeros[0];
				for (int j = 1; j < numeros.length; j++) {
					switch (signo) {
					case "-": {
						result -= numeros[j];
						break;
					}
					case "+":
						result += numeros[j];
						break;
					case "*":
						result *= numeros[j];
						break;
					case "/":
						result /= numeros[j];
						break;
					case "%":
						result %= numeros[j];
						break;

					}
				}
				System.out.println("El valor de la operacion es: " + result);
			} else {
				System.out.println(args[0]);
				System.err.println("Ha ingresado un operador no valido!");
			}

		} else {
			System.out.println("Error!\n Debe haber al menos 3 parametros");
		}
	}

}
