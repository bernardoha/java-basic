package pe.edu.une;

import java.util.Scanner;

public class Ejer01 {
	public static void main(String[] args) {
		// Ingreso de datos por teclado
		Scanner Leer = new Scanner(System.in);
		System.out.println("Ingrese un nombre: ");
		String nombre = Leer.next();
		System.out.println("El nombre ingresado es: "+nombre);
	}
}
