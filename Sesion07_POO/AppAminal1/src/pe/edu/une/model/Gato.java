package pe.edu.une.model;

public class Gato extends Animal{
	private final String marcaArena;
	//Método constructor
	public Gato(String nombre, String raza, String color, String tamano,String marcaArena) {
		super(nombre, raza, color, tamano);
		this.marcaArena=marcaArena;
	}
	@Override
	public void imprimeInformacion() {
		System.out.println("Miau, soy un gato, mi marca de arena es: "+marcaArena);
	}
}
