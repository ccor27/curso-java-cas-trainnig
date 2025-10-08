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
				new Cerdo("Lomo de cerdo", 15, 2.50, "España", 2)));
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
		clientes = Arrays.asList(new ClienteSupermercado("juan", 30), new ClienteSupermercado("Pedro", 25));
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
		switch (categoriaSeleccionada) {
		case "Verdura": {
			
			break;
		}
		case "Lacteo": {

			break;
		}
		case "Carne": {

			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + categoriaSeleccionada);
		}

	}
	

	private void compraClienteSeleccionProducto(ClienteSupermercado cliente, String title) {
		
	}
	private List<Carne> obtenerCarnes() {
		List<Carne> carnes = new ArrayList<Carne>();
		for (Set<Alimento> grupo : alimentos) {
			for (Alimento alimento : grupo) {
				if (alimento instanceof Carne) {
					carnes.add((Carne) alimento);
				}
			}
		}
		return carnes;
	}

	private List<Lacteo> obtenerLacteos() {
		List<Lacteo> lacteos = new ArrayList<Lacteo>();
		for (Set<Alimento> grupo : alimentos) {
			for (Alimento alimento : grupo) {
				if (alimento instanceof Lacteo) {
					lacteos.add((Lacteo) alimento);
				}
			}
		}
		return lacteos;
	}

	private List<Verdura> obtenerVerduras() {
		List<Verdura> verduras = new ArrayList<Verdura>();
		for (Set<Alimento> grupo : alimentos) {
			for (Alimento alimento : grupo) {
				if (alimento instanceof Verdura) {
					verduras.add((Verdura) alimento);
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
