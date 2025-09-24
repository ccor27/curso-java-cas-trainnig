package es.cursojava.poo.herencia.ejercicios.hospital;

public class Main {

	public static void main(String[] args) {
		Paciente pacienteRaro = new Paciente("Juan - raro ", 32, new String[] {"dolor dientes", "perdida equilibrio", "comezon manos"});
		Paciente pacienteGripe = new Paciente("Andres - gripe ", 32, new String[] {"fiebre", "tos", "dolor de garganta", "fatiga"});
		Doctor doctor = new Doctor("doc", 43, "diurno", "de todo");
		doctor.diagnosticarPaciente(pacienteRaro);
		doctor.diagnosticarPaciente(pacienteGripe);

	}

}
