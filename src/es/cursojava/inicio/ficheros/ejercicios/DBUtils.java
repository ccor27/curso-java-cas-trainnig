package es.cursojava.inicio.ficheros.ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	//TODO: change
	private static final String URL_DB_ORACLE = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	private static final String USER_DB_ORACLE = "HR";
	private static final String PASSWORD_DB_ORACLE = "hr";
	private static Connection conn = null;

	public static Connection createConnextion() {
		conn = createConnextion(URL_DB_ORACLE, USER_DB_ORACLE, PASSWORD_DB_ORACLE);

		return conn;
	}

	public static Connection createConnextion(String url, String user, String password) {

		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.err.println("Error crear la sesión" + e.getMessage());
		}

		return conn;
	}

	public static void closeConnection(Connection connection) {

		try {
			connection.close();
		} catch (SQLException e) {
			System.err.println("Error al cerrar la sesión " + e.getMessage());
		}

	}
}
