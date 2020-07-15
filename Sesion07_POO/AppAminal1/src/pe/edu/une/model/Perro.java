package pe.edu.une.model;

public class Perro extends Animal{
	private final String marcaCroquetas;

	public Perro(String nombre, String raza, String color, String tamano,String marcaCroquetas) {
		super(nombre, raza, color, tamano);
		this.marcaCroquetas=marcaCroquetas;
	}
	@Override
	public void imprimeInformacion() {
		System.out.println("Guau, soy un perro, me gusta croquetas de la marca: "+marcaCroquetas);
	}
}
