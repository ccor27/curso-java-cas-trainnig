package es.cursojava.examen.parteUno.pojos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Master extends CursoImpl {

	private boolean oficial;

	public Master(String nombre, String codigo, int cupo, boolean oficial) {
		super(nombre, codigo, cupo);
		this.oficial = oficial;
	}

		
	
}
