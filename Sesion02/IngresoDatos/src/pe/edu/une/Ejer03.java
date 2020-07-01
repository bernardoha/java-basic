package pe.edu.une;

import java.util.Scanner;

public class Ejer03 {
	public static void main(String[] args) {
		//Scanner para capturar datos
		Scanner Leer = new Scanner(System.in);
		System.out.println("Ingrese nombre del trabajador: ");
		String nombre = Leer.next();
		System.out.println("Ingrese sueldo del trabajador: ");
		double sueldo = Leer.nextDouble();
		//Proceso
		double bonif = sueldo * 0.2;
		double montoAcum = sueldo + bonif;
		//Descontar 5%
		double seguro = montoAcum * 0.05;
		//Monto a cobrar
		double montoCobrar = montoAcum - seguro;
		//Mostrar resultados
		System.out.println("**************************************");
		System.out.println("Trabajador(a): "+nombre);
		System.out.println("Sueldo: "+sueldo);
		System.out.println("Bonificación: "+bonif);
		System.out.println("Descuento: "+seguro);
		System.out.println("Monto a cobrar: "+montoCobrar);
	}
}
