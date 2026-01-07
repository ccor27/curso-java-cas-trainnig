package es.cursojava.hibernate.ejercicios.tres.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.hibernate.ejercicios.tres.pojos.Codigo;
import es.cursojava.hibernate.ejercicios.tres.pojos.Curso;
import es.cursojava.hibernate.ejercicios.tres.service.CursoDAOImpl;

public class HibernateUtils {

	private static final Logger logger = LoggerFactory.getLogger(HibernateUtils.class);
	public static final String SEPARADOR_PIPE = "\\|";

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
			String[] tokens = line.split(SEPARADOR_PIPE);
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
			cursos.add(new Curso(null, parseCodigo(codigoStr), titulo, descripcion, duracionHoras, disponible, nivel,
					categoria, precio, fechaInicio, fechaFin));

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

	public static void pintaMenu(String[] options) {
		pintaMenu(options, "Introduce una opcion:");
	}

	public static void pintaMenu(String[] options, String message) {
		System.out.println("   =========== Menu ===========");
		for (int i = 1; i <= options.length; i++) {
			System.out.println(i + ". " + options[i - 1]);
		}
		System.out.println("   ============================");
		System.out.println(message);
	}

	public static int pideDatoNumerico(String texto) {
		if (!texto.isEmpty() && !texto.isBlank()) {
			System.out.print(texto);
		}
		Scanner scan;
		int dato = 0;
		boolean flag = true;
		while (flag) {
			try {
				scan = new Scanner(System.in);
				dato = scan.nextInt();
				flag = false;
			} catch (Exception e) {
				System.out.println("Ingrese solo digitos!.\n");
			}
		}
		return dato;
	}

	public static String pideDatoCadena(String texto) {
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		String dato = scan.nextLine();
		return dato;
	}

	public static void menuHibernateCursos(String[] opciones, CursoDAOImpl daoImpl) {
		boolean flag = true;
		System.out.println("==============================================");
		System.out.println("            EJERCICIO CON HIBERNATE           ");
		System.out.println("==============================================");
		while (flag) {
			pintaMenu(opciones);
			int opcion = pideDatoNumerico("");
			switch (opcion) {
			case 1: {
				// Información de un Curso por su Código
				verInformacionCursoPorSuCodigo(daoImpl);
				break;
			}
			case 2: {
				// Información de cursos por categoría y fecha inicio > 1/02/2025
				verInformacionCursoPorCategoriaYFecha(daoImpl);
				break;
			}
			case 3: {
				// Información de todos los cursos por nivel, por horas > y fecha inicio
				verInformacionCursosPorNivelHorasFechaInicio(daoImpl);
				break;
			}
			case 4: {
				// salir
				flag = false;
				System.out.println("Gracias por usar nuesta aplicacion!.");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		}
	}

	//TODO: fix this method, I get an error setting a date
	private static void verInformacionCursosPorNivelHorasFechaInicio(CursoDAOImpl daoImpl) {
		boolean flag = true;
		String fechaDeInicioTmp = null;
		LocalDate fechaInicio = null;
		int horas = 0;
		String nivel = null;
		String fechaInicioStr = pideDatoCadena("Ingresa la fecha de inicio (AAAA-MM-DD) o deja vacio para omitir");
		if (!fechaInicioStr.isBlank() || isDateFormatCorrect(fechaInicioStr)) {
			fechaDeInicioTmp = fechaInicioStr;
		}

		int horasTmp = pideDatoNumerico("Ingrese el numero de horas o ingresa 0 para omitir");
		if (horasTmp > 0) {
			horas = horasTmp;
		}
		String nivelStr = pideDatoCadena("Ingrese el nivel del curso o deja vacio para omitir");
		if (!nivelStr.isBlank()) {
			nivel = nivelStr;
		}
		if(fechaDeInicioTmp != null) {
			fechaInicio = LocalDate.parse(fechaDeInicioTmp);
		}
		List<Curso> cursos = daoImpl.obtenerCursosPorNivelYHorasYFechaInicio(nivel, horas,fechaInicio);
		for (Curso curso : cursos) {
			System.out.println(curso);
		}
	}

	private static boolean isDateFormatCorrect(String fecha) {
		return fecha.matches("^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$");
	}

	private static void verInformacionCursoPorCategoriaYFecha(CursoDAOImpl daoImpl) {
		boolean flag = true;
		String categoria = "";
		do {
			categoria = pideDatoCadena("Ingresa la categoria a buscar.");
			if (categoria.isEmpty() || categoria.isBlank()) {
				System.out.println("Ingrese una categoria valida");
			} else {
				flag = false;
			}
		} while (flag);
		List<Curso> cursos = daoImpl.obtenerCursosPorCategoria(categoria);
		if (cursos.isEmpty()) {
			System.out.println("No hay cursos con esa categoria.");
		} else {
			for (Curso curso : cursos) {
				System.out.println(curso);
			}
		}
	}

	private static void verInformacionCursoPorSuCodigo(CursoDAOImpl daoImpl) {
		boolean flag = true;
		String codigoStr = "";
		Codigo codigo = null;
		do {
			codigoStr = pideDatoCadena("Ingresa el codigo:");
			codigo = parseCodigo(codigoStr);
			if (codigo != Codigo.SIN_DEFINIR) {
				flag = false;
			} else {
				System.out.println("Ese codigo no existe, por favor ingresa uno valido!");
			}
		} while (flag);
		Curso curso = daoImpl.obtenerCursoPorId(codigo);
		daoImpl.commitTransaction();
		System.out.println(curso);
	}
}
