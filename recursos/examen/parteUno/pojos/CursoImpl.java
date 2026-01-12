package es.cursojava.examen.parteUno.pojos;

import es.cursojava.examen.parteUno.interfaces.Curso;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"nombre","cupo"})//para evitar tener masters con el mismo codigo
public class CursoImpl implements Curso {
	

	private String nombre;
	private String codigo;
	private int cupo;

	@Override
	public String obtenerNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public String obtenerCodigo() {
		// TODO Auto-generated method stub
		return codigo;
	}

	@Override
	public int obtenerCupoDisponible() {
		// TODO Auto-generated method stub
		return cupo;
	}

}
