package es.cursojava.poo.ejercicios.tiendamaniqui;

public class Tienda {

	private String nombre;
	private Maniqui[] maniquies;
	private int contadorManiquie;

	public Tienda(String nombre, int numeroManiquies) {
		super();
		this.nombre = nombre;
		this.maniquies = new Maniqui[numeroManiquies];
		this.contadorManiquie = 0;
	}

	public void abrirTienda() {
		
		Boton[] botenes = new Boton[] { new Boton("Negro", 3, "circular"), new Boton("Negro", 3, "circular") };
		Camisa camisa = new Camisa("Blanco", 8, "L", botenes);
		Pantalon pantalon = new Pantalon("Verde", 12.50, "M", new Boton("Negro", 5, "circular"));
		Maniqui maniqui1 = new Maniqui(pantalon, camisa);
		maniquies[0] = maniqui1;
		
		
		Vestido vestido = new Vestido("Rosa", 15, "S");
		Maniqui maniqui2 = new Maniqui(vestido);
		maniquies[1] = maniqui2;
		
		
		Maniqui maniqui3 = new Maniqui();
		maniquies[2] = maniqui3;
	}

	public void mostrarEscaparate() {
		for (Maniqui maniqui : maniquies) {
			if (maniqui != null) {
				System.out.println("====================================================================");
				System.out.println(maniqui.mostrarInfo());
				System.out.println("====================================================================");
			}
		}
	}

	private void vestirManiquies() {
		for (Maniqui maniqui : maniquies) {
			if (maniqui != null) {
				maniqui.vestir();
			}
		}
	}

	public void cerrarTienda() {
		System.out.println("La tienda va a cerrar!");
		for (Maniqui maniqui : maniquies) {
			if (maniqui != null) {
				maniqui.desvestir();
			}
		}
		System.out.println("Los maniquis han sido desvestidos!");
	}

	public static void main(String[] args) {
		Tienda tienda = new Tienda("Mercadito", 3);
		tienda.abrirTienda();
		tienda.vestirManiquies();
		tienda.mostrarEscaparate();
		tienda.cerrarTienda();
	}

}
