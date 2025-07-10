package es.cursojava.inicio.strings;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "No hay nadie que ame el dolor mismo, que lo busque, lo encuentre y lo quiera, simplemente porque es el dolor";
		//String frase = "an eiou AEOIU";
		int numeroVocales = 0;
		
		for(int i = 0; i < frase.length() ; i++)
			if(esVocal(frase.charAt(i)))
				numeroVocales++;
	System.out.println("El numero de vocales es: "+numeroVocales);
	}
	
	public static boolean esVocal(char c) {
		return(c == 'a' || c =='A' || c == 'e' || c == 'E' || c == 'i' || c ==  'I'
				|| c == 'o' || c == 'O' || c == 'u' || c == 'U');
	}

}
