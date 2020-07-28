package pe.edu.une.model;

public class Hamster extends Animal {
	private String tipoRueda;
	private String tipoJaula;
	public Hamster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hamster(String nombre, String raza, String color, String tamano,
			String tipoRueda,String tipoJaula) {
		super(nombre, raza, color, tamano);
		this.tipoRueda = tipoRueda;
		this.tipoJaula = tipoJaula;
	}
	//Método que muestra jaula y rueda
	public void verJaulaRueda() {
		System.out.println("Jaula: "+tipoJaula);
		System.out.println("Rueda: "+tipoRueda);
	}
	@Override
	public void imprimeInformacion() {
		System.out.println("Mi mascota: "+getNombre()+" "+getRaza()+" "+getColor());		
	}
}
