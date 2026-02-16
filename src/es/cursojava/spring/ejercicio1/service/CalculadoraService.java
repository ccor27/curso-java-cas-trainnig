package es.cursojava.spring.ejercicio1.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import es.cursojava.spring.ejercicio1.annotations.OnlyAdmin;
import es.cursojava.spring.ejercicio1.interfaces.Operacion;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
 public class CalculadoraService {
	
	private List<Operacion> operaciones;
	
	@OnlyAdmin
	public void ejecutarOperaciones(int a, int b, String simbolo) {
		
		for (Operacion operacion : operaciones) {
			if(operacion.obtenerSigno().equals(simbolo)) {
				System.out.println("Resultado de la operacion ["+simbolo+"]: "+operacion.calcular(a, b));
			}
		}
	}
}
