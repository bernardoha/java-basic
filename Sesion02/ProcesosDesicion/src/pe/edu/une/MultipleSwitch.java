package pe.edu.une;

public class MultipleSwitch {
	public static void main(String[] args) {
		// Variables
		int num = 6;
		String lenguaje="";
		//Proceso condicional m�ltiple
		switch(num) {
		case 1:
			lenguaje="Java OpenJDK 11, versi�n LTS";
			break;
		case 2:
			lenguaje="Python 3.8.3, �ltima versi�n";
			break;
		case 3:
			lenguaje="PHP 7.4, �ltima versi�n";
			break;
		case 4:
			lenguaje="Go 1.14.1, lenguaje de programaci�n de google";
			break;
		default:
			System.out.println("Error al ingresar datos...");
		}
		//Reporte o salida
		System.out.println(lenguaje);
	}
}
