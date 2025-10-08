package es.cursojava.poo.colecciones.listas.ejercicios.supermercado.interfaces;

public interface Perecedero extends Calculable{

    String obtenerFechaCaducidad();
    boolean estaCaducado();
}
