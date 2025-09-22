package es.cursojava.poo.herencia.ejercicios.bandamusica;

public class BandaMusica {

	public static void main(String[] args) {

		BandaMusica miBanda = new BandaMusica();
		miBanda.empezarConcierto();
	}

	public void empezarConcierto() {

		Guitarra guitarra = new Guitarra("Guitarra clasica", "cuerda pulsada", 5);
		GuitarraElectrica guitarraElectrica = new GuitarraElectrica("Guitarra electrica fender", "cuerda pulsada", 4);
		Piano piano = new Piano("Piano", "cuerda percutida", 7, "vertical o de pared");
		Tambor tambor = new Tambor("Tambor", "percusion", "madera y piel animal");

		Instrumento[] instrumentos = { guitarra, guitarraElectrica, piano, tambor };
		afinarInstrumentos(instrumentos);
		tocarInstrumentos(instrumentos);
	}

	private void afinarInstrumentos(Instrumento[] instrumentos) {
		for (Instrumento instrumento : instrumentos) {
			if (instrumento != null) {
				instrumento.afinar();
			}
		}
		System.out.println();
	}

	private void tocarInstrumentos(Instrumento[] instrumentos) {
		boolean todosAfinados = true;
		for (Instrumento instrumento : instrumentos) {
			if (instrumento != null) {
				if (instrumento instanceof Tambor) {
					((Tambor) instrumento).aporrear();
				} else {
					instrumento.tocar();
				}
				if (!instrumento.isAfinado()) {
					todosAfinados = false;
				}
			}
		}
		if (!todosAfinados) {
			System.out.println("La banda suena mal!");
		}
	}
}
