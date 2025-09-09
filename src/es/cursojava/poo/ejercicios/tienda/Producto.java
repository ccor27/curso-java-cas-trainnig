package es.cursojava.poo.ejercicios.tienda;

public class Producto {

	private String name;
	private double price;
	private int amount;
	public Producto(String name, double price, int amount) {
		super();
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	
	public void showInfo() {
		System.out.println(name+":\n"+" - precio: "+price+"\n - cantidad: "+amount+"\n");
	}
	public double calculateTotalValue()
	{
		return price * amount;
	}
}
