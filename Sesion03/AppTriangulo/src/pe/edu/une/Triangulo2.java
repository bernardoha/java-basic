package pe.edu.une;

import java.util.Scanner;

public class Triangulo2 {
	public static void main(String[] args) {
		Scanner Leer = new Scanner(System.in);
		System.out.println("Ingrese el nro. de triángulos: ");
		int nro = Leer.nextInt();
		double acum=0, count = 0;
		//Proceso repetitivo while
		while(count < nro) {
			//Datos
			System.out.println("Ingrese la base del triángulo: ");
			double base = Leer.nextDouble();
			System.out.println("Ingrese la altura del triángulo: ");
			double altura = Leer.nextDouble();
			//Proceso
			double area = (base * altura)/2;
			//Reporte
			System.out.println("El área es: "+area);
			//Contador
			count++;
			//Acumular los valores de las áreas
			//acum+=area;
			acum=acum+area;
			System.out.println("**************************************");
		}//fin de while
		//Calcular el promedio
		double promAreas = acum/count;
		System.out.println("Promedio de las áreas: "+promAreas);
	}
}
