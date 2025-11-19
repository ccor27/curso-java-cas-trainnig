package es.cursojava.examen.parteUno.pojos;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;


@Data
public class InstitucionEducativa {

	private String nombre;
	private List<Master> masters;
	
	public InstitucionEducativa(String nombre) {
	this.nombre = nombre;
	this.masters = new ArrayList<Master>();
	}
	

	public void addMaster(Master master) {
		boolean puedeAgregar = true;
		for (Master m : masters) {
			try {
				if(m.equals(master)) {//para evitar masters con el mismo codigo
					puedeAgregar = false;
					break;
				}
			}catch (NullPointerException npe) {
				System.out.println("No puede hacer acciones con valores nulos!");
			}
		}
		if(puedeAgregar) {
			this.masters.add(master);
		}
	}
	
	public void eliminarMasterPorSuCodigo(String codigo) {
		Master master = null;
		for (Master m : masters) {
			try {
				if(m.obtenerNombre().equals(codigo)) {//para evitar masters con el mismo codigo
					master = m;
					break;
				}
			}catch (NullPointerException npe) {
				System.out.println("No puede hacer acciones con valores nulos!"+npe.getLocalizedMessage());
			}
		}
		//No manejo try-catch porque como uso list la cual permite nulos, simplemente no eliminara nada.
		masters.remove(master);
	}
	
	public void mostrarNombres() {
		for (Master master : masters) {
			try {				
				if(master.isOficial()) {					
					System.out.println(master.obtenerNombre());
				}
			}catch(NullPointerException npe) {
				System.out.println("No es posible hacer acciones con valores nulos, "+npe.getLocalizedMessage());
			}
		}
	}
}
