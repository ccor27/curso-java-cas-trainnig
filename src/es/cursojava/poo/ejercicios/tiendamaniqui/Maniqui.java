package es.cursojava.poo.ejercicios.tiendamaniqui;

public class Maniqui {

	private String id;
	private Pantalon pantalon;
	private Camisa camisa;
	private Vestido vestido;

	public Maniqui() {
		this.id=String.valueOf((int)(Math.random()*10));
	}

	public Maniqui(Pantalon pantalon, Camisa camisa) {
		this.pantalon = pantalon;
		this.camisa = camisa;
		this.id=String.valueOf((int)(Math.random()*10));
	}

	public Maniqui(Vestido vestido) {
		this.vestido = vestido;
		this.id=String.valueOf((int)(Math.random()*10));
	}
	
	public void vestir() {
		//validar si esta desnudo
		if(estaDesnudo()) {
			//para elegir con que vestirlo
			if(Math.random() < 0.5) {
				//pantalo y camisa
				this.pantalon = new Pantalon("Negro", 17.50, "M", new Boton("Plateado", 5, "circular"));

				this.camisa = new Camisa("Azul", 12, "L", 
						new Boton[]{
								new Boton("Negro",3,"circular"),
								new Boton("Negro",3,"circular")
						});
				System.out.println("Maniqui con id "+id+" vestido con camisa y pantalon");
			}else {
				//vestido
				this.vestido = new Vestido("Morado", 30, "M");
				System.out.println("Maniqui con id "+id+" ha sido vestido con un vestido");
			}
		}else {
			System.out.println("Maniqui con id "+id+" ya esta vestido!");
		}
	}
	public void desvestir() {
		if(!estaDesnudo()) {
			this.pantalon=null;
			this.camisa=null;
			this.vestido=null;
			System.out.println("Maniqui con id "+id+" ha sido desvestido.");
		}else {
			System.out.println("Maniqui con id "+id+" ya esta desvestido!");
		}
	}
	
	private boolean estaDesnudo() {
		return pantalon == null && camisa == null && vestido == null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}

	public String mostrarInfo() {
		if(vestido!=null) {
			return "Info maniqui  \n"
					+"   id: "+this.id+
					"\n   vestido: "+this.vestido.mostrarInfo()+
					"PRECIO TOTAL DE LA ROPA: "+getPrecioTotal();
		}else if(pantalon !=null && camisa !=null) {
			return "Info maniqui  \n"
		+"   id: "+this.id+
		"\n   "+this.pantalon.mostrarInfo()+
		"\n   "+this.camisa.mostrarInfo()+
		"PRECIO TOTAL DE LA ROPA: "+getPrecioTotal();
		}else{
			return "El maniqui no tiene ropa";
		}
	}

	public double getPrecioTotal() {
		if(vestido!=null) {
			return vestido.getPrecio();
		}else {
			return this.camisa.getPrecio() + this.pantalon.getPrecio();
		}
	}
	
}
