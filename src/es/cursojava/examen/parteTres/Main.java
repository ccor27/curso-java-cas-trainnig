package es.cursojava.examen.parteTres;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {

	private static final String CONSULTA_PRODUCTOS = "SELECT " + "id,nombre,tipo,precio,stock "
			+ "FROM TB_Productos";

	public static void main(String[] args) {

		List<Producto> productos = consultaProductos();
		hacerCalculos(productos);
		//no funciona, parece que conecta con mi base de datos pero no me retorna nada
		//no se que sera :(

	}

	//Este metodo pudo ser mejor, pero estaba cansado
	public static void hacerCalculos(List<Producto> productos) {

		int cantidadPorAlimento = 0;
		int cantidadPorElectronica = 0;
		int cantidadPorRopa = 0;

		double totalValorPorAlimento = 0;
		double totalValorPorElectronica = 0;
		double totalValorPorRopa = 0;
		for (Producto producto : productos) {
			if (producto != null) {
				
				switch (producto.getTipo()) {
				case "Alimento": {
					cantidadPorAlimento += producto.getStock();
					totalValorPorAlimento += producto.getPrecio();
					break;
				}
				case "Ropa": {
					cantidadPorRopa += producto.getStock();
					totalValorPorRopa += producto.getPrecio();
					break;
				}
				case "Electronica": {
					cantidadPorElectronica += producto.getStock();
					totalValorPorElectronica += producto.getPrecio();
					break;
				}
				}
			}
		}
		System.out.println("Tipo -> ALIMENTO\n        precio medio: "+(cantidadPorAlimento/totalValorPorAlimento)+"\n        cantidad: "+cantidadPorAlimento);
		System.out.println("Tipo -> ROPA\n        precio medio: "+(cantidadPorRopa/totalValorPorRopa)+"\n        cantidad: "+cantidadPorRopa);
		System.out.println("Tipo -> ELECTRONICA\n        precio medio: "+(cantidadPorElectronica/totalValorPorElectronica)+"\n        cantidad: "+cantidadPorElectronica);
	}

	public static List<Producto> consultaProductos() {

		Connection conexion = UtilidadesBD.crearConexion();
		Statement st = null;
		ResultSet rs = null;
		List<Producto> productos = new ArrayList<>();
		try {
			st = conexion.createStatement();
			rs = st.executeQuery(CONSULTA_PRODUCTOS);

			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String tipo = rs.getString("tipo");
				double precio = rs.getDouble("precio");
				int stock = rs.getInt("stock");

				Producto p = new Producto(id, nombre, tipo, precio, stock);
			
				productos.add(p);
				System.out.println(id);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			UtilidadesBD.cierraConexion(conexion);
			try {
				st.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (Producto producto : productos) {
			System.out.println(producto);
		}
		return productos;
	}
}
