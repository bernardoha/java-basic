package pe.edu.une;

import java.util.Scanner;

public class Persona {
	public static void main(String[] args) {
		Scanner Leer = new Scanner(System.in);
		System.out.println("Ingrese el nro. de personas: ");
		int nro = Leer.nextInt();
		// Arreglos
		int edad[] = new int[nro];
		String datos[][] = new String[nro][2];
		// Capturar datos y guardar en los arreglos
		for (int i = 0; i < nro; i++) {
			System.out.println("Ingrese nombre: ");
			datos[i][0] = Leer.next();
			System.out.println("Ingrese edad: ");
			edad[i] = Leer.nextInt();
			// Determinar la etapa
			if (edad[i] > 60) {
				datos[i][1] = "Adulto(a) Mayor";
			} else if (edad[i] < 60 && edad[i] >= 25) {
				datos[i][1] = "Adulto(a)";
			} else if (edad[i] < 25 && edad[i] >= 18) {
				datos[i][1] = "Joven";
			} else if (edad[i] < 18 && edad[i] >= 13) {
				datos[i][1] = "Adolescente";
			} else {
				datos[i][1] = "Niño(a)";
			}
		}
		//Mostrar
		System.out.println("Nombre \t\t Edad \t\t Etapa");
		//Recorrer el arreglo usando for para mostrar los datos
		for (int i = 0; i < datos.length; i++) {
			System.out.println(datos[i][0]+" \t\t "+edad[i]+" \t\t "+datos[i][1]);
		}
	}
}
