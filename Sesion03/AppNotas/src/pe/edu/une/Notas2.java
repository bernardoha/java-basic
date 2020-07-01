package pe.edu.une;

import java.util.Scanner;

public class Notas2 {

	public static void main(String[] args) {
		Scanner Leer = new Scanner(System.in);
		//Variable acumulador
		double acum=0;
		System.out.println("Ingrese el nro. de alumnos: ");
		int nro = Leer.nextInt();
		//Estructura de repetición
		for(int i=0;i<nro;i++) {
			//Datos
			System.out.println("Ingrese nota de Ex. parcial 1: ");
			double ep1 = Leer.nextDouble();
			System.out.println("Ingrese nota de Ex. parcial 2: ");
			double ep2 = Leer.nextDouble();
			System.out.println("Ingrese el promedio de prácticas: ");
			double pp = Leer.nextDouble();	
			System.out.println("Ingrese nota de Ex. final: ");
			double ef = Leer.nextDouble();	
			//Proceso
			double prom = (ep1+ep2+pp+ef)/4;
			//Reporte
			System.out.println("Promedio: "+prom);
			System.out.println("===================================");
			//Acumular los promedios
			//acum=acum+prom;
			acum+=prom;
		}//fin de for
		//Calcular el promedio de aula
		double promAula=acum/nro;
		System.out.println("****************************");
		System.out.println("Nro. de alumnos: "+nro);
		System.out.println("Promedio de aula: "+promAula);
		System.out.println("****************************");
	}
}
