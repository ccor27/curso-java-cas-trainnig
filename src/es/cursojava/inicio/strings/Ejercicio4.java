package es.cursojava.inicio.strings;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String phrase = "hola mundo	este es el ejercicio 4 njlkjnjnlkj ";
		// String phrase = "hola mundo cristian a";
		int inicioAux = 0;
		int finAux;
		int inicio = 0;
		int fin = 0;
		for (int i = 0; i < phrase.length(); i++) {
			if (Character.isWhitespace(phrase.charAt(i))) {
				finAux = i - 1;
				if ((finAux - inicioAux) > (fin - inicio)) {
					inicio = inicioAux;
					fin = finAux;
					finAux = 0;
				}
				inicioAux = i + 1;
			}
		}
		// check if the case of the last word
		if ((phrase.length() - inicioAux) > (fin - inicio)) {
			inicio = inicioAux;
			fin = phrase.length() - 1;
		}
		System.out.println("La palabra mas grande es: " + phrase.substring(inicio, fin + 1));
//		String[] words;
//		words = phrase.split(" ");
//		for(int i = 0; i < words.length ; i++) {
//			if(words[i].length() > biggerPhrase.length())
//				biggerPhrase = words[i];
//		}
//		System.out.println("La palabra mas grande es: "+biggerPhrase);
	}

}
