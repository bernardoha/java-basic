package pe.edu.une;

import java.util.Scanner;

public class Ejer02 {
	public static void main(String[] args) {
		//Scanner permite capturar datos ingresados por teclado
		Scanner Leer = new Scanner(System.in);
		System.out.println("Ingrese número 1: ");
		int num1 = Leer.nextInt();
		System.out.println("Ingrese número 2: ");
		int num2 = Leer.nextInt();
		//Proceso
		int suma = num1 + num2;
		//Reporte o salida
		System.out.println("La suma de los números es: "+suma);
	}
}
