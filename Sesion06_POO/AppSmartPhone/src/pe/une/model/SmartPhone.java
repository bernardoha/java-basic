package pe.une.model;

public class SmartPhone {
	// Atributos de la clase
	private String marca;
	private String modelo;
	private String color;

	// Método constructor vacio - Crea una instancia sin datos
	public SmartPhone() {

	}

	// Método constructor con parámetros
	public SmartPhone(String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	// Crear métodos simples
	public void llamar() {
		System.out.println("Blin blin.... RRsssssssss");
	}

	public void llamar2(String nombre) {
		System.out.println("llamando a "+nombre+" tiririnnnnnnnnnnnnnnnn, ring ring");
	}
	//Método finalizar llamada
	public void cortarLlamada() {
		System.out.println("Llamada finalizada");
	}
	//Método con retorno 
	public String mostrarMensaje(String nombre) {
		String mensaje = "Hola "+nombre+" mensaje enviado...";
		return mensaje;
	}
	
	//Métodos get y set
	//Método get permite consultar datos
	//Método set permite modificar o asignar datos
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
}
