package pe.edu.une;

import java.util.Scanner;

public class Triangulo {
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
		}//fin de while
	}

}
