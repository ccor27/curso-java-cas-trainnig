package es.cursojava.poo.herencia.ejercicios.hospital;


import java.util.Arrays;
import java.util.List;

public class Hospital {

	private String nombre;
	private Habitacion[] habitaciones;
	private SalaDeEspera[] salasDeEspera;
	private boolean hospitalAbierto;
	private List<Persona> personas;
	private Doctor[] doctores;
	private Enfermero[] enfermeros;
	
	/**
	 * - each time we pass a patience to a room, add that Enfermo to person list
	 * 		and remore the patience of the person list  
	 */

	public Hospital() {
		habitaciones = new Habitacion[2];
		salasDeEspera = new SalaDeEspera[1];
		this.hospitalAbierto = false;
	}
	
	/**
	 * Metodo para crear y almacenar los objetos que 
	 * tendra el hospital
	 */
	public void abrirHospital() {
		personas = inicializarPersonas();
		doctores = inicializarDoctores();
		enfermeros = inicializarEnfermero();
		habitaciones = inicializarHabitaciones();
		salasDeEspera = inicializarSalasDeEspera();
		alojarPacientes();
		hospitalAbierto = true;
	}
	
	/**
	 * Metodo para fichar cada empleado del 
	 * hospital
	 */
	public void ficharEmpleados() {
		for (Persona persona : personas) {
			if(persona!=null && (persona instanceof EmpleadoHospital)) {
				 ((EmpleadoHospital) persona).fichar();
			}
		}
	}
	
	/**
	 * Metodo para hacer comer a todas las personas del hospital
	 */
	public void comer() {
		for (Persona persona : personas) {
			if(persona!=null) {
				persona.comer();
			}
		}
	}
	
	public void pasarConsulta() {
		
	}
	
	/**
	 * Metodod para alojar 3 pacientes al inicio del programa
	 */
	private void alojarPacientes() {
		for (Persona persona : personas) {
			if(persona!=null && (persona instanceof Paciente)) {
				 permitirEntradaSalaDeEspera(((Paciente) persona));
			}
		}
	}
	
	/**
	 * Metodo que permite agregar o entrar en la sala de espera a un paciente
	 * en la primer sala que tenga disponibilidad
	 * @param paciente
	 */
	private void permitirEntradaSalaDeEspera(Paciente paciente) {
		boolean exito = false;
		for (SalaDeEspera sala : salasDeEspera) {
			if(sala!=null && sala.hayEspacio()) {
				sala.agregarPaciente(paciente);
				exito = true;
				break;
			}
		}
		if(exito) {
			System.out.println("Paciente agregado a sala!");
		}else {
			System.out.println("No es posible, no hay salas de espera con disponibilidad");
		}
	}
	
	private SalaDeEspera[] inicializarSalasDeEspera() {
		return new SalaDeEspera[] {
				new SalaDeEspera()
		};
	}
	
	/**
	 * Metodo para crear y almacenar las habitaciones
	 * @return Habitacion[]
	 */
	private Habitacion[] inicializarHabitaciones() {
		return new Habitacion[] {
			new Habitacion(1, null),
			new Habitacion(2, null)
		};
	}
	/**
	 * Metodo para crear y almacenar todos los empleados del
	 * hospital
	 * @return EMpleadoHospital[]
	 */
	private List<Persona> inicializarPersonas(){
		return  Arrays.asList(
				new Enfermero("Camilo", 25, "diurno", "01"),
				new Enfermero("Daniela", 28, "nocturno", "01"), 
				new Enfermero("Alejandro", 32, "diurno", "02"),
				new Enfermero("Sofía", 26, "diurno", "02"),
				new Enfermero("Mateo", 30, "nocturno", "03"),
				new Enfermero("Valentina", 29, "diurno", "03"),
				new Enfermero("Sebastián", 35, "nocturno", "04"),
				new Enfermero("Isabella", 24, "diurno", "04"),
				new Enfermero("Javier", 31, "nocturno", "05"),
				new Enfermero("Lucía", 27, "diurno", "05"),
				new Doctor("Juan", 35, "diurno", "cardiologia"),
				new Doctor("Maria", 42, "nocturno", "dermatologia"), 
				new Doctor("Pedro", 50, "diurno", "pediatria"),
				new Doctor("Laura", 28, "nocturno", "neurologia"), 
				new Doctor("Carlos", 61, "diurno", "oncologia"),
				new Paciente("Jorge", 34, new String[] {"tos","fiebre","malestar general"}),
				new Paciente("Lucía", 28, new String[] {"dolor de cabeza", "náuseas"}),
				new Paciente("Carlos", 45, new String[] {"fiebre", "dolor muscular", "cansancio"})
		);
	}

	/**
	 * Metodo para almacenar los enfermeros que hay 
	 * en la lista de empleados
	 * @return Enfermero[]
	 */
	private Enfermero[] inicializarEnfermero() {
		int index = 0;
		for (Persona persona : personas) {
	        if (persona instanceof Enfermero) {
	            index++;
	        }
	    }
		Enfermero[] enfermeros = new Enfermero[index];
		index = 0;

		for (Persona persona : personas) {
	        if (persona instanceof Enfermero) {
	        	enfermeros[index] = (Enfermero) persona;
	            index++;
	        }
	    }
		return enfermeros;
	}

	/**
	 * Metodo para almacenar los doctores que hay
	 * en la lista de empleados
	 * @return
	 */
	private Doctor[] inicializarDoctores() {
		int index = 0;
		for (Persona persona : personas) {
	        if (persona instanceof Doctor) {
	            index++;
	        }
	    }
		Doctor[] doctores = new Doctor[index];
		index = 0;

		for (Persona persona : personas) {
	        if (persona instanceof Doctor) {
	        	doctores[index] = (Doctor) persona;
	            index++;
	        }
	    }
		return doctores;
	}
	
}
