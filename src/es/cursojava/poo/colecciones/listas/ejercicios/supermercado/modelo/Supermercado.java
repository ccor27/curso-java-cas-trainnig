package es.cursojava.poo.colecciones.listas.ejercicios.supermercado.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import es.cursojava.poo.colecciones.listas.ejercicios.supermercado.modelo.alimentos.Alimento;
import es.cursojava.poo.colecciones.listas.ejercicios.supermercado.modelo.alimentos.Carne;
import es.cursojava.poo.colecciones.listas.ejercicios.supermercado.modelo.alimentos.Cerdo;
import es.cursojava.poo.colecciones.listas.ejercicios.supermercado.modelo.alimentos.Esparrago;
import es.cursojava.poo.colecciones.listas.ejercicios.supermercado.modelo.alimentos.Lacteo;
import es.cursojava.poo.colecciones.listas.ejercicios.supermercado.modelo.alimentos.Leche;
import es.cursojava.poo.colecciones.listas.ejercicios.supermercado.modelo.alimentos.Pollo;
import es.cursojava.poo.colecciones.listas.ejercicios.supermercado.modelo.alimentos.Tomate;
import es.cursojava.poo.colecciones.listas.ejercicios.supermercado.modelo.alimentos.Verdura;
import es.cursojava.poo.colecciones.listas.ejercicios.supermercado.modelo.alimentos.Yogurt;
import es.cursojava.poo.colecciones.listas.ejercicios.supermercado.utilidades.Utilidades;
import es.cursojava.poo.interfaces.ejercicios.verduras.muebles.Lechuga;

public class Supermercado {

	private Set<Set<Alimento>> alimentos;
	private List<ClienteSupermercado> clientes;
	private String nombre;

	public Supermercado(String nombre) {
		this.nombre = nombre;
		iniciarAlimentos();
		iniciarClientes();
		permitirComprarUsuarios();
	}

	private void iniciarAlimentos() {
		Set<Alimento> carnes = new HashSet<Alimento>(Set.of(new Pollo("Pollo", 30, 0.95, "Alemania", "Pechuga", 0.5),
				new Cerdo("Cerdo lomo", 15, 2.50, "España", 2)));
		Set<Alimento> lacteos = new HashSet<Alimento>(
				Set.of(new Leche("leche de cabra", 150, 0.75, LocalDate.of(2025, 01, 15), LocalDate.of(2026, 1, 15)),
						new Yogurt("Yogurt casero", 50, 1.50, LocalDate.of(2025, 01, 15), LocalDate.of(2026, 1, 15))));
		Set<Alimento> verduras = new HashSet<Alimento>(Set.of(new Tomate("Tomate", 80, 0.50, "cherry", "rojo"),
				new Esparrago("Esparrago", 40, 0.67, "verde", "verde")));
		alimentos = new HashSet<>();
		alimentos.add(carnes);
		alimentos.add(verduras);
		alimentos.add(lacteos);
	}

	private void iniciarClientes() {
		//new ClienteSupermercado("Pedro", 25)
		clientes = Arrays.asList(new ClienteSupermercado("juan", 30));
	}

	private void permitirComprarUsuarios() {

		for (ClienteSupermercado cliente : clientes) {
			compraClienteSeleccionCategoria(cliente);
		}
	}

	private void compraClienteSeleccionCategoria(ClienteSupermercado cliente) {
		List<String> tipoAlimentos = obtenerTipoAlimentos();
		String categoriaSeleccionada = Utilidades.menuSeleccionCategoriaCliente(
				tipoAlimentos.toArray(new String[tipoAlimentos.size()]), cliente.getNombre(), nombre);
		List<String> productos = new ArrayList<String>();
		switch (categoriaSeleccionada) {
		case "Verdura": {
			productos = obtenerVerduras();
			ejecutarCompraProducto(cliente, Utilidades.menuSeleccionProducto(productos.toArray(new String[productos.size()]), cliente.getNombre(), nombre));
			break;
		}
		case "Lacteo": {
			productos = obtenerLacteos();
			ejecutarCompraProducto(cliente, Utilidades.menuSeleccionProducto(productos.toArray(new String[productos.size()]), cliente.getNombre(), nombre));
			break;
		}
		case "Carne": {
			productos = obtenerCarnes();
			ejecutarCompraProducto(cliente, Utilidades.menuSeleccionProducto(productos.toArray(new String[productos.size()]), cliente.getNombre(), nombre));
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + categoriaSeleccionada);
		}

	}
	

	private void ejecutarCompraProducto(ClienteSupermercado cliente, String productoSeleccionado) {
		String nombreProducto = productoSeleccionado.substring(0, productoSeleccionado.indexOf("-"));
		Alimento alimento = null;
		for (Set<Alimento> Listaalimentos : alimentos) {
			for (Alimento a : Listaalimentos) {
				System.out.println("alimento -> "+a.getNombre()+" alimento seleccionado ->"+nombreProducto);
				if(a.getNombre().equalsIgnoreCase(nombreProducto)) {
					alimento = a;
					break;
				}
			}
		}
		if(alimento==null) {
			System.out.println("ERROR: el alimento seleccionado no esta en stock.");
			return;
		}
		int	cantidadAComprar = Utilidades.pideDatoNumerico("Ingrese la cantidad que desea comprar: ");
		if(alimento.comprar(cantidadAComprar)) {
			cliente.añadirAlimento(alimento.clonarConCantidad(cantidadAComprar));
			System.out.println("Compra con exito!");
		}else {
			System.out.println("Cantidad no disponible");
		}
		
	}
	
	private List<String> obtenerCarnes() {
		List<String> carnes = new ArrayList<String>();
		for (Set<Alimento> grupo : alimentos) {
			for (Alimento alimento : grupo) {
				if (alimento instanceof Carne) {
					Carne c = (Carne) alimento;
					carnes.add(c.getNombre()+" -- cantidad: "+c.getCantidad()+" -- precio por kilo: "+c.getPrecioPorKg());
				}
			}
		}
		return carnes;
	}

	private List<String> obtenerLacteos() {
		List<String> lacteos = new ArrayList<String>();
		for (Set<Alimento> grupo : alimentos) {
			for (Alimento alimento : grupo) {
				if (alimento instanceof Lacteo) {
					Lacteo l = (Lacteo) alimento;
					lacteos.add(l.getNombre() +" -- cantidad: "+l.getCantidad()+" -- precio por minilitro: "+l.getPrecioPorMl());
				}
			}
		}
		return lacteos;
	}

	private List<String> obtenerVerduras() {
		List<String> verduras = new ArrayList<String>();
		for (Set<Alimento> grupo : alimentos) {
			for (Alimento alimento : grupo) {
				if (alimento instanceof Verdura) {
					Verdura v = (Verdura) alimento;
					verduras.add(v.getNombre() +" -- "+ "cantidad: "+v.getCantidad() + " -- "+"precio por unidad: "+v.getPrecioPorUnidad());
				}
			}
		}
		return verduras;
	}

	private List<String> obtenerTipoAlimentos() {
		Set<String> tiposSet = new HashSet<>();
		for (Set<Alimento> grupo : alimentos) {
			for (Alimento alimento : grupo) {
				tiposSet.add(alimento.getClass().getSuperclass().getSimpleName());
			}
		}
		return new ArrayList<>(tiposSet);
	}

}
