package pe.edu.une;

import java.util.Scanner;

public class Arreglo3 {
	public static void main(String[] args) {
		Scanner Leer = new Scanner(System.in);
		System.out.println("Ingrese el nro. de personas: ");
		int nro = Leer.nextInt();
		//Declarar un arreglo
		String datos[][]=new String[nro][2];
		//Asignar datos a un arreglo
		for (int i = 0; i < nro; i++) {
			System.out.println("Ingrese Nombre: ");
			datos[i][0] = Leer.next();
			System.out.println("Ingrese Estado Civil: ");
			datos[i][1] = Leer.next();
		}
		//Mostrar datos de un arreglo bidimensional}
		System.out.println("Nombre \t\t Estado Civil");
		System.out.println("****************************");
		for (int i = 0; i < nro; i++) {
			System.out.println(datos[i][0]+" \t\t "+datos[i][1]);
		}
		System.out.println("****************************");
	}
}
