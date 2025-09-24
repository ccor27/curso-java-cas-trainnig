package es.cursojava.poo.herencia.ejercicios.hospital;

import java.util.HashMap;
import java.util.Map;

public class Doctor extends EmpleadoHospital {

	private String especialidad;
	private Map<String, String[]> enfermedadesConocidas;

	public Doctor(String nombre, int edad, String turno, String especialidad) {
		super(nombre, edad, turno);
		this.especialidad = especialidad;
		asignarEnfermedadesConocidas();
	}

	/**
	 * Metodo para asignar las enfermedades que el doctor conoce
	 */
	private void asignarEnfermedadesConocidas() {
		enfermedadesConocidas = new HashMap<>();
		enfermedadesConocidas.put("Gripe", new String[] { "fiebre", "tos", "dolor de garganta", "fatiga" });
		enfermedadesConocidas.put("Migraña", new String[] { "dolor de cabeza", "mareo", "nauseas" });
		enfermedadesConocidas.put("Problema cardíaco",
				new String[] { "dolor en el pecho", "dificultad para respirar", "mareo" });
		enfermedadesConocidas.put("Resfriado común",
				new String[] { "estornudos", "congestión nasal", "dolor de garganta", "tos" });
		enfermedadesConocidas.put("Neumonía",
				new String[] { "fiebre alta", "tos con flema", "dolor en el pecho", "dificultad para respirar" });
		enfermedadesConocidas.put("Apendicitis",
				new String[] { "dolor abdominal", "náuseas", "fiebre", "pérdida de apetito" });
		enfermedadesConocidas.put("Diabetes",
				new String[] { "sed excesiva", "micción frecuente", "fatiga", "visión borrosa" });
		enfermedadesConocidas.put("Anemia", new String[] { "fatiga", "mareo", "palidez", "dolor de cabeza" });
		enfermedadesConocidas.put("Asma",
				new String[] { "dificultad para respirar", "sibilancias", "tos", "opresión en el pecho" });
		enfermedadesConocidas.put("Gastritis",
				new String[] { "dolor abdominal", "náuseas", "vómitos", "ardor estomacal" });
		enfermedadesConocidas.put("Hipertensión",
				new String[] { "dolor de cabeza", "mareo", "fatiga", "zumbido en los oídos" });
		enfermedadesConocidas.put("Bronquitis",
				new String[] { "tos persistente", "fatiga", "fiebre baja", "dificultad para respirar" });
		enfermedadesConocidas.put("COVID-19", new String[] { "fiebre", "tos seca", "fatiga", "pérdida del olfato" });
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	/**
	 * Metodo para diagnosticar a un paciente por sus sintomas
	 * @param paciente
	 * @return
	 */
	public Enfermo diagnosticarPaciente(Paciente paciente) {
		if (paciente != null) {
			if(paciente.getSintomas() != null && paciente.getSintomas().length > 0) {				
				String enfermedad = encontrarEnfermedad(paciente.getSintomas());
				System.out.println("paciente " + paciente.getNombre() + " tiene " + enfermedad);
				return new Enfermo(paciente.getNombre(), paciente.getEdad(), enfermedad);
			}else{
				System.out.println("paciente " + paciente.getNombre() + " not tiene enfermedad ");
				return null;
			}
		} else {
			System.out.println("No es posible diagnosticar un paciente que no existe.");
			return null;
		}
	}

	/**
	 * Metodo para encontrar la enfermedad del paciente por sus sintomas
	 * 
	 * @param sintomas
	 * @return String
	 */
	private String encontrarEnfermedad(String[] sintomas) {
		Map<String, Integer> probabilidadEnfermedad;

		// know the probability of disease
		probabilidadEnfermedad = encontrarProbabilidadEnfermedad(sintomas);
		return decidirEnfermedad(probabilidadEnfermedad);

	}

	/**
	 * Metodo para saber la probabilidad que un paciente tiene una enfermeda
	 * basado en sus sintomas y las enfermedades que el doctor conoce
	 * @param sintomas
	 * @return Map<String, Integer>
	 */
	private Map<String, Integer> encontrarProbabilidadEnfermedad(String[] sintomas) {

		int numeroSintomas;
		Map<String, Integer> probabilidadEnfermedades = new HashMap<String, Integer>();

		for (Map.Entry<String, String[]> entry : enfermedadesConocidas.entrySet()) {
			numeroSintomas = 0;
			String[] sintomasEnfermedad = entry.getValue();

			for (String sintoma : sintomas) {
				if (estaSintomaEnEnfermedad(sintomasEnfermedad, sintoma)) {
					numeroSintomas++;
				}
			}
			probabilidadEnfermedades.put(entry.getKey(), numeroSintomas);

		}
		return probabilidadEnfermedades;
	}

	/**
	 * Metodo para decidir la enfermedad del paciente basado en las probabilidades
	 * que se calcularon en  encontrarProbabilidadEnfermedad(String[] sintomas)
	 * @param probabilidadEnfermedades
	 * @return String
	 */
	private String decidirEnfermedad(Map<String, Integer> probabilidadEnfermedades) {

		if (probabilidadEnfermedades == null || probabilidadEnfermedades.isEmpty()) {
			return "enfermedad rara";
		}
		String enfermedad = "";
		int maxValue = Integer.MIN_VALUE;
		for (Map.Entry<String, Integer> entry : probabilidadEnfermedades.entrySet()) {
			int valor = entry.getValue();
			if (valor > maxValue) {
				maxValue = valor;
				enfermedad = entry.getKey();
			}
		}
		if (maxValue <= 0) {
			return "enfermedad desconocida";
		}
		return enfermedad;

	}

	/**
	 * Metodo auxiliar para saber si un sintoma esta en una enfermedad
	 * @param sintomas
	 * @param sintomaAEncontrar
	 * @return boolean
	 */
	private boolean estaSintomaEnEnfermedad(String[] sintomas, String sintomaAEncontrar) {
		for (String sintoma : sintomas) {
			if (sintoma.equalsIgnoreCase(sintomaAEncontrar)) {
				return true;
			}
		}
		return false;
	}
}
