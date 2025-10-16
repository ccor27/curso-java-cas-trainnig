package pojos;

import java.util.List;

public class GranPremio {

	private String nombre;
	private List<Carrera> carreras;
	private List<Apostante> apostantes;

	public GranPremio(String nombre, List<Carrera> carreras, List<Apostante> apostantes) {
		super();
		this.nombre = nombre;
		this.carreras = carreras;
		this.apostantes = apostantes;
	}

	
	public void empezarGranPremio() {
		System.out.println("================================ Inicio del Gran Premio "+ nombre+ " ================================");
		for (Carrera carrera : carreras) {
			if(carrera!=null) {
				carrera.iniciar();
			}
		}
		mostrarSaldoFinalApostantes();
		mostrarResumen();
		System.out.println("=====================================================================================================");
	}
	
	private void mostrarResumen() {
		System.out.println("==================== Resumen ====================");
		for (Carrera carrera : carreras) {
			if(carrera!=null) {
				System.out.println("En la carrera "+carrera.getNombre()+" el ganador fue\n"+carrera.getGanador().imprimeDatos());
			}
		}
		System.out.println("=================================================");
	}
	/**
	 * Metodo para mostrar los datos de los apostantes
	 * despues de la carrera
	 */
	private void mostrarSaldoFinalApostantes() {
		System.out.println("======== Datos de los apostadores ========");
		for (Apostante apostante : apostantes) {
			if(apostante!=null) {
				apostante.imprimeDatos();
			}
		}
		System.out.println("==========================================");
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Carrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(List<Carrera> carreras) {
		this.carreras = carreras;
	}

	public List<Apostante> getApostantes() {
		return apostantes;
	}

	public void setApostantes(List<Apostante> apostantes) {
		this.apostantes = apostantes;
	}

}
