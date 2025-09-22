package es.cursojava.poo.herencia.ejercicios.hospital;

public class EmpleadoHospital extends Persona{
//Heredad de la clase persona(extends)
	
	private String turnos[];
	
	public EmpleadoHospital(String turno[], String nombre, int edad) {
		super(nombre, edad);
		this.turnos = turno;
	}

	public String[] getTurnos() {
		return turnos;
	}

	public void setTurnos(String[] turnos) {
		this.turnos = turnos;
	}
	
public void fichar () {
	System.out.println("El empleado " + this.getNombre()+" está fichando.");
}

@Override
public void comer() {
	// TODO Auto-generated method stub
	System.out.println("El empleado"+ this.getNombre()+ " comiendo en el comedor.");
}
	
	
}
