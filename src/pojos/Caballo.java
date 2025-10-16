package pojos;

import interfaces.Avanzable;
import interfaces.Imprimible;
import interfaces.Participable;

public class Caballo implements Avanzable, Imprimible, Participable {

	private String nombre;
	private double peso;
	private double velocidad;
	private int experiencia;
	private Jinete jinete;
	private double metrosRecorridos;

	public Caballo(String nombre, double peso, double velocidad, int experiencia, Jinete jinete) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.velocidad = velocidad;
		this.experiencia = experiencia;
		this.jinete = jinete;
		this.metrosRecorridos = 0;
	}


	/**
	 * Function to reset the horse's data after a race
	 */
	public void resetear() {
		this.metrosRecorridos = 0;
	}

	/**
	 * Method to calculate the distance advanced
	 */
	@Override
	public double calcularAvanceTurno() {
		double avance = (Math.random()*10) + velocidad + experiencia - peso;
		return avance > 0 ? avance : 0;
	}

	/**
	 * Function to add advanced distance to total distance (metrosRecorridos)
	 * 
	 * @param distance
	 */
	@Override
	public void aplicarAvance(double metros) {
		this.metrosRecorridos += metros;
	}

	@Override
	public String getIdentificador() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Function to add experience points to the horse
	 * 
	 * @param puntos
	 */
	public void sumarExperiencia(int puntos) {
		this.experiencia += puntos;
	}
	
	/**
	 * Method to print all horse data
	 * @return String
	 */
	@Override
	public String imprimeDatos() {
		return "Caballo \n"
				+"   nombre: "+nombre
				+"   peso: "+peso
				+"   velocidad: "+velocidad
				+"   experiencia: "+experiencia
				+"   metros recorridos: "+metrosRecorridos
				+"\n"+jinete.toString();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public Jinete getJinete() {
		return jinete;
	}

	public void setJinete(Jinete jinete) {
		this.jinete = jinete;
	}

	public double getMetrosRecorridos() {
		return metrosRecorridos;
	}

	public void setMetrosRecorridos(double metrosRecorridos) {
		this.metrosRecorridos = metrosRecorridos;
	}

}
