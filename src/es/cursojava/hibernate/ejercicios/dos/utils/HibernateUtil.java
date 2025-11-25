package es.cursojava.hibernate.ejercicios.dos.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import es.cursojava.hibernate.ejercicios.dos.pojo.Codigo;
import es.cursojava.hibernate.ejercicios.dos.pojo.Curso;

public class HibernateUtil {

	private static Session session;

	private static Session getSession() {
		SessionFactory sessionFactory = new Configuration().configure() // Carga hibernate.cfg.xml
				.buildSessionFactory();
		Session session = sessionFactory.openSession();

		return session;
	}

	public static Session getSessionFactory() {
		if (session == null || !session.isOpen()) {
			session = getSession();
		}
		return session;
	}

	public static List<Curso> leerArchivo(String nombre) throws IOException {
		List<Curso> cursos = new ArrayList<Curso>();
		Path path = Paths.get(nombre);
		List<String> data = Files.readAllLines(path);
		for (String line : data) {
			if (line.trim().isEmpty())
				continue;
			String[] tokens = line.split("\\|");
			String codigoStr = tokens.length > 0 ? tokens[0] : "JAVA_BASICO";
			String titulo = tokens.length > 1 ? tokens[1] : "Sin título";
			String descripcion = tokens.length > 2 ? tokens[2] : "";
			int duracionHoras = tokens.length > 3 ? parseInt(tokens[3], 0) : 0;
			boolean disponible = tokens.length > 4 ? parseBoolean(tokens[4], true) : true;
			String nivel = tokens.length > 5 ? tokens[5] : "Básico";
			String categoria = tokens.length > 6 ? tokens[6] : "General";
			double precio = tokens.length > 7 ? parseDouble(tokens[7], 0.0) : 0.0;
			LocalDate fechaInicio = tokens.length > 8 ? parseDate(tokens[8], LocalDate.now()) : LocalDate.now();
			LocalDate fechaFin = tokens.length > 9 ? parseDate(tokens[9], LocalDate.now().plusDays(30))
					: LocalDate.now().plusDays(30);

		}
		return cursos;
	}

	// Métodos auxiliares para parseo seguro
	private static int parseInt(String str, int defaultValue) {
		try {
			return Integer.parseInt(str.trim());
		} catch (NumberFormatException e) {
			return defaultValue;
		}
	}

	private static double parseDouble(String str, double defaultValue) {
		try {
			return Double.parseDouble(str.trim());
		} catch (NumberFormatException e) {
			return defaultValue;
		}
	}

	private static boolean parseBoolean(String str, boolean defaultValue) {
		if (str == null)
			return defaultValue;
		str = str.trim().toLowerCase();
		if (str.equals("true") || str.equals("yes"))
			return true;
		if (str.equals("false") || str.equals("no"))
			return false;
		return defaultValue;
	}

	private static LocalDate parseDate(String str, LocalDate defaultValue) {
		try {
			return LocalDate.parse(str.trim());
		} catch (DateTimeParseException e) {
			return defaultValue;
		}
	}

	private static Codigo parseCodigo(String str) {
		try {
			return Codigo.valueOf(str.trim());
		} catch (IllegalArgumentException | NullPointerException e) {
			return Codigo.SIN_DEFINIR; // valor por defecto
		}
	}
}
