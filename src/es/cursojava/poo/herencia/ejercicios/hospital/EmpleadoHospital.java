package es.cursojava.poo.herencia.ejercicios.hospital;

public class EmpleadoHospital extends Persona {
//Heredad de la clase persona(extends)

	private String turno;

	public EmpleadoHospital(String nombre, int edad, String turno) {
		super(nombre, edad);
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public void fichar() {
		System.out.println("El empleado " + this.getNombre() + " está fichando.");
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("El empleado" + this.getNombre() + " comiendo en el comedor.");
	}

}
