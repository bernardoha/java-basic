package pe.edu.une.model;

public class Perro extends Animal {
	//Atributo propio de la clase perro
	private final String marcaCroquetas;

	
	public Perro(String nombre, String raza, String color, String tamano,String marcaCroquetas) {
		super(nombre, raza, color, tamano);
		this.marcaCroquetas = marcaCroquetas;
	}


	@Override
	public void imprimeInformacion() {
		System.out.println("Hola, soy un perro, me gusta croquetas de la marca: "+marcaCroquetas);
	}

}
