package pojos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Carrera{

	private String nombre;
	private double distanciaObjetivo;
	private List<Caballo> participantes;
	private Caballo ganador;
	private List<Apuesta> apuestas;

	public Carrera(String nombre, double distanciaObjetivo, List<Caballo> participantes, List<Apuesta> apuestas) {
		super();
		this.nombre = nombre;
		this.distanciaObjetivo = distanciaObjetivo;
		this.participantes = participantes;
		this.apuestas = apuestas;
	}
	
	public void iniciar() {
		System.out.println("================ Inicio Carrera "+ nombre+ " ================");
		mostrarDatosInicialesCarrera();
		mostrarApuestasRegistradas();
		System.out.println("Carrera en curso...");
		//reset all horses metrosRecorridos to 0
		for (Caballo caballo : participantes) {
			if(caballo!=null) {
				caballo.resetear();
			}
		}
		//start the race
		List<Caballo> raceRanking = new ArrayList<Caballo>();
		int i = 0;
		boolean areRunning = true;
		//loop until all the horses reach the finish
		while(areRunning) {
			for (Caballo caballo : participantes) {
				if(caballo!=null) {
					double distance = caballo.calcularAvanceTurno();
					caballo.aplicarAvance(distance);
					registra((i+1), caballo.getNombre(), distance, caballo.getMetrosRecorridos());
					if(caballo.getMetrosRecorridos() >= distanciaObjetivo) {
						raceRanking.add(caballo);
						participantes.remove(caballo);
					}
					if(raceRanking.size() < 1) {
						areRunning = false;
					}
				}
			}
			i++;
		}
		System.out.println("Carrera terminada...");
		mostrarResumenCarrera(raceRanking);
		premiarGanador();
		System.out.println("=============================================================");
	}
	
	/**
	 * Metodo para mostrar lo que sucede en cada turno, cuanto avanza cada caballo y la distancia recorrida
	 * @param turn
	 * @param horseName
	 * @param distance
	 * @param totalDistance
	 */
	private void registra(int turn, String horseName, double distance, double totalDistance) {
		System.out.println("Turno "+turn+" -> "+horseName+" "+distance+"m (total "+totalDistance+"m)");
	}
	
	/**
	 * Metodo para mostrar los datos de la carrera antes de 
	 * empezarla
	 */
	private void mostrarDatosInicialesCarrera() {
		System.out.println("  distancia: "+distanciaObjetivo);
		for (Caballo caballo : participantes) {
			if(caballo!=null) {
				caballo.imprimeDatos();
			}
		}
	}
	
	/**
	 * Metodo para mostrar las apuestas registradas en la carrera
	 */
	private void mostrarApuestasRegistradas() {
		System.out.println("======== Apuestas registradas ========");
		for (Apuesta apuesta : apuestas) {
			if(apuesta!=null) {
				apuesta.toString();
			}
		}
		System.out.println("======================================");
	}
	
	/**
	 * Metodo para mostrar el resumen de la carrera
	 * @param ranking
	 */
	private void mostrarResumenCarrera(List<Caballo> ranking) {
		System.out.println("======== Resumen ========");
		System.out.println("El Participante ganador fue:");
		ranking.get(0).imprimeDatos();
		ganador = ranking.get(0);
		System.out.println("Y el ranking de la carrera fue:");
		for (Caballo caballo : ranking) {
			if(caballo!=null) {
				caballo.imprimeDatos();
			}
		}
		System.out.println("==========================");
	}
	
	/**
	 * Metodo para dar el premio al ganador
	 */
	private void premiarGanador() {
		for (Apuesta apuesta : apuestas) {
			if(apuesta!=null && apuesta.getCaballo().equals(ganador)) {
				apuesta.getApostante().actualizarSaldo(apuesta.getImporte(), true);
				ganador.sumarExperiencia(1);
				break;
			}
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDistanciaObjetivo() {
		return distanciaObjetivo;
	}

	public void setDistanciaObjetivo(double distanciaObjetivo) {
		this.distanciaObjetivo = distanciaObjetivo;
	}

	public List<Caballo> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<Caballo> participantes) {
		this.participantes = participantes;
	}

	public List<Apuesta> getApuestas() {
		return apuestas;
	}

	public void setApuestas(List<Apuesta> apuestas) {
		this.apuestas = apuestas;
	}

	public Caballo getGanador() {
		return ganador;
	}
	

}
