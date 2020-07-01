package pe.edu.une;

import java.util.Scanner;

public class Arreglo2b {
	public static void main(String[] args) {
		Scanner Leer = new Scanner(System.in);
		//Acumulador
		int acum=0;
		System.out.println("Ingrese el nro. de personas: ");
		int nro = Leer.nextInt();
		//Declarar un arreglo
		int edad[]=new int[nro];
		//Asignar datos a un arreglo
		for (int i = 0; i < nro; i++) {
			System.out.println("Ingrese edad: "+(i+1));
			edad[i] = Leer.nextInt();
			acum=acum+edad[i];
		}
		//Calcular promedio
		int prom = acum / nro;
		//Mostrar datos del arreglo
		for (int i = 0; i < nro; i++) {
			System.out.println("Edad "+(i+1)+" "+edad[i]);
		}
		System.out.println("Promedio de edad: "+prom);
	}
}
