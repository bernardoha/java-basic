package pe.edu.une;

public class Multiple {
	public static void main(String[] args) {
		// Variables
		String etapa = "";
		int edad = 80;
		//Proceso condicional m�ltiple
		if(edad>=60) {
			etapa="Adulto(a) mayor";
		}else if(edad < 60 && edad >= 25) {
			etapa="Adulto(a)";
		}else if(edad < 25 && edad >= 18) {
			etapa = "Joven";
		}else if(edad < 18 && edad >= 13) {
			etapa = "Adolescente";
		}else {
			etapa = "Ni�o";
		}
		//Mostrar resultado
		System.out.println("Pertenece a la etapa: "+etapa);
	}
}
