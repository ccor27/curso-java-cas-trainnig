package es.cursojava.inicio.ficheros.ejercicios;

import java.sql.Statement;
import java.time.LocalDate;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GuardarEnArchivo {

	private static final Logger logger = LoggerFactory.getLogger(GuardarEnArchivo.class);
	private static final String CONSULTA_PRODUCTO = "SELECT "
			+ "ID,NOMBRE,CATEGORIA,PRECIO,STOCK,FECHA_ALTA,ESTADO,CODIGO_SKU,CREADO_POR,IVA "
			+ "FROM TB_PRODUCTOS_PROFE"; 
	private static final String DEFAULT_SEPARATOR = "|"; 
	
	public static void main(String[] args) {
		List<Producto> products = fetchProducts();
//		if(!products.isEmpty())
//			System.out.println("Nice");
	}

	public static List<Producto> fetchProducts() {

		Connection connection = DBUtils.createConnextion();
		Statement st = null;
		ResultSet rs = null;
		List<Producto> products = new ArrayList<Producto>();

		try {
			st = connection.createStatement();
			rs = st.executeQuery(CONSULTA_PRODUCTO);

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("NOMBRE");
				String category = rs.getString("CATEGORIA");
				double price = rs.getDouble("PRECIO");
				String stock = rs.getString("STOCK");
				String status = rs.getString("ESTADO");
				String sku = rs.getString("CODIGO_SKU");
				String creator = rs.getString("CREADO_POR");
				int iva = rs.getInt("IVA");
				Date createAt = rs.getDate("FECHA_ALTA");

				Producto product = new Producto(id, name, category, price, stock, status, sku, creator, iva, createAt);
				products.add(product);
			}
			logger.info("Data fetched successfully");
		} catch (SQLException e) {
			logger.error("Error {"+e.getClass().getName()+"] fetching the data from DB");
			e.printStackTrace();
		} finally {
			DBUtils.closeConnection(connection);
			try {
				st.close();
				rs.close();
				logger.info("DB connection closed successfully");
			} catch (SQLException e) {
				logger.error("Error {"+e.getClass().getName()+"] closing the connection");
				e.printStackTrace();
			}
		}
		return products;
	}
	
	public static void writeInFile(List<Producto> products, String filenName, String separator) {
		String finalSeparator = separator == null ? DEFAULT_SEPARATOR: separator ;
		
	}
}
