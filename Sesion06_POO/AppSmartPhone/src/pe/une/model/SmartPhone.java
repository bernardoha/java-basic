package pe.une.model;

public class SmartPhone {
	// Atributos de la clase
	private String marca;
	private String modelo;
	private String color;

	// M�todo constructor vacio - Crea una instancia sin datos
	public SmartPhone() {

	}

	// M�todo constructor con par�metros
	public SmartPhone(String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	// Crear m�todos simples
	public void llamar() {
		System.out.println("Blin blin.... RRsssssssss");
	}

	public void llamar2(String nombre) {
		System.out.println("llamando a "+nombre+" tiririnnnnnnnnnnnnnnnn, ring ring");
	}
	//M�todo finalizar llamada
	public void cortarLlamada() {
		System.out.println("Llamada finalizada");
	}
	//M�todo con retorno 
	public String mostrarMensaje(String nombre) {
		String mensaje = "Hola "+nombre+" mensaje enviado...";
		return mensaje;
	}
	
	//M�todos get y set
	//M�todo get permite consultar datos
	//M�todo set permite modificar o asignar datos
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
