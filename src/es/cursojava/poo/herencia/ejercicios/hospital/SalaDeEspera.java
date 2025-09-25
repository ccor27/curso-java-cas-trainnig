package es.cursojava.poo.herencia.ejercicios.hospital;

import java.util.LinkedList;
import java.util.Queue;

public class SalaDeEspera {
	
	private Queue<Paciente> pacientes;
	private final int CAPACIDAD_MAXIMA = 10;

	public SalaDeEspera() {
		this.pacientes = new LinkedList<Paciente>();
	}
	
	public boolean hayEspacio() {
        return pacientes.size() < CAPACIDAD_MAXIMA;
    }
    
    public boolean agregarPaciente(Paciente paciente) {
        if (hayEspacio()) {
            return pacientes.offer(paciente);
        }
        return false;
    }
    
    public Paciente sacarPaciente() {
        return pacientes.poll(); 
    }
//	private Paciente[] pacientes;
//	
//	public SalaDeEspera() {
//		this.pacientes = new Paciente[10];
//	}
//	
//	/**
//	 * Metodo para saber si hay espacio para 
//	 * mas pacientes
//	 * @return boolean
//	 */
//	public boolean hayEspacio() {
//		for(int i = 0; i<pacientes.length; i++) {
//			if(pacientes[i] == null) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	/**
//	 * Metodo para agregar pacientes
//	 * @param paciente
//	 * @return boolean
//	 */
//	public boolean agregarPaciente(Paciente paciente) {
//		boolean wasAssignedFlag = false;
//		for(int i = 0; i<pacientes.length; i++) {
//			if(pacientes[i] == null) {
//				pacientes[i]=paciente;
//				wasAssignedFlag = true;
//				break;
//			}
//		}
//		return wasAssignedFlag;
//	}
	
	
}
