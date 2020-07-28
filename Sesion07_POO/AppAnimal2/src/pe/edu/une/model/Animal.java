package pe.edu.une.model;

public abstract class Animal {
	private String nombre;
	private String raza;
	private String color;
	private String tamano;
	//Métodos constructores
	public Animal() {
		
	}
	public Animal(String nombre, String raza, String color, String tamano) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.tamano = tamano;
	}
	//Métodos get y set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	
	//Método que muestra datos
	public void muestraDatos() {
		System.out.println("El nombre es: "+nombre);
		System.out.println("La raza es: "+raza);
		System.out.println("El color es: "+color);
		System.out.println("El tamaño es: "+tamano);
	}
	//Declarar método abstracto
	public abstract void imprimeInformacion();
}
