package es.cursojava.examen.parteUno.app;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import es.cursojava.examen.parteUno.pojos.InstitucionEducativa;
import es.cursojava.examen.parteUno.pojos.Master;

public class Main {

	public static void main(String[] args) {
		InstitucionEducativa e = new InstitucionEducativa("Getafe");
		crearMasters(e);
		e.eliminarMasterPorSuCodigo("MF0230"); //debe eliminar exitosamente
		e.mostrarNombres();
	
	}
	
	private static void crearMasters(InstitucionEducativa e)
	{
		Master master1 = new Master("Programacion", "MF0226", 15, true);
		e.addMaster(master1);
		Master master2 = new Master("Administracion", "MF0219", 30, false);
		e.addMaster(master2);
		Master master3 = new Master("Sistemas operativos", "MF0230", 10, true);
		e.addMaster(master3);
		Master master4 = new Master("Sistemas operativos2", "MF0230", 10, true);//no sera agregado
		e.addMaster(master4);
		e.addMaster(null);//se agrega porque list lo permite
	}
	
}
