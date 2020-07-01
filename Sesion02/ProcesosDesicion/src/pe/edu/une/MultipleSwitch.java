package pe.edu.une;

public class MultipleSwitch {
	public static void main(String[] args) {
		// Variables
		int num = 6;
		String lenguaje="";
		//Proceso condicional múltiple
		switch(num) {
		case 1:
			lenguaje="Java OpenJDK 11, versión LTS";
			break;
		case 2:
			lenguaje="Python 3.8.3, última versión";
			break;
		case 3:
			lenguaje="PHP 7.4, última versión";
			break;
		case 4:
			lenguaje="Go 1.14.1, lenguaje de programación de google";
			break;
		default:
			System.out.println("Error al ingresar datos...");
		}
		//Reporte o salida
		System.out.println(lenguaje);
	}
}
