package pe.edu.une.model;

public class Animal {
	protected String nombre;
	protected String raza;
	protected String color;
	protected String tamano;
	private final String tipo;

	// Método constructor
	public Animal(String nombre, String raza, String color, String tamano) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.tamano = tamano;
		this.tipo = "Terreste";
	}
	// Métodos get y set

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
	
	//Métodos simples o personalizados
	public void muestraDatos() {
		System.out.println("El nombre es: "+nombre);
		System.out.println("La raza es: "+raza);
		System.out.println("El color es: "+color);
		System.out.println("El tamaño es: "+tamano);
		System.out.println("Es de tipo: "+tipo);
	}
	public void imprimeInformacion() {
		System.out.println("DATOS DEL ANIMAL");
		System.out.println("Soy un animal aún no identificado");
	}
	
}
