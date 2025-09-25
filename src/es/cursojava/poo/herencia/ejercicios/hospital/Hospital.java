package es.cursojava.poo.herencia.ejercicios.hospital;

import java.util.Arrays;

public class Hospital {

	private String nombre;
	private Habitacion[] habitaciones;
	private SalaDeEspera[] salasDeEspera;
	private EmpleadoHospital[] empleados;
	private Doctor[] doctores;
	private Enfermero[] enfermeros;

	public Hospital() {
		habitaciones = new Habitacion[2];
		salasDeEspera = new SalaDeEspera[3];
		empleados = inicializarEmpleados();
		doctores = inicializarDoctores();
		enfermeros = inicializarEnfermero();
	}
	
	/**
	 * Metodo para crear y almacenar todos los empleados del
	 * hospital
	 * @return EMpleadoHospital[]
	 */
	private EmpleadoHospital[] inicializarEmpleados(){
		return new EmpleadoHospital[] {
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
				new Doctor("Carlos", 61, "diurno", "oncologia")
				
		};
	}

	/**
	 * Metodo para almacenar los enfermeros que hay 
	 * en la lista de empleados
	 * @return Enfermero[]
	 */
	private Enfermero[] inicializarEnfermero() {
		int index = 0;
		for (EmpleadoHospital empleado : empleados) {
	        if (empleado instanceof Enfermero) {
	            index++;
	        }
	    }
		Enfermero[] enfermeros = new Enfermero[index];
		index = 0;

		for (EmpleadoHospital empleado : empleados) {
	        if (empleado instanceof Enfermero) {
	        	enfermeros[index] = (Enfermero) empleado;
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
		for (EmpleadoHospital empleado : empleados) {
	        if (empleado instanceof Doctor) {
	            index++;
	        }
	    }
		Doctor[] doctores = new Doctor[index];
		index = 0;

		for (EmpleadoHospital empleado : empleados) {
	        if (empleado instanceof Doctor) {
	        	doctores[index] = (Doctor) empleado;
	            index++;
	        }
	    }
		return doctores;
	}
	
	/**
	 * Metodo para fichar cada empleado del 
	 * hospital
	 */
	public void ficharEmpleados() {
		for (EmpleadoHospital empleado : empleados) {
			if(empleado!=null) {
				empleado.fichar();
			}
		}
	}
}
