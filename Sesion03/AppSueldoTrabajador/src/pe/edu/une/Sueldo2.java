package pe.edu.une;

import java.util.Scanner;

public class Sueldo2 {

	public static void main(String[] args) {
		Scanner Leer=new Scanner(System.in);
		char resp = 'S';
		double acum = 0, sueldoBruto = 0, sueldoNeto=0;
		//Proceso de repetici�n do while
		do {
			//Datos
			System.out.println("Ingrese el nombre del trabajador: ");
			String nombre = Leer.next();
			System.out.println("Ingrese el sueldo del trabajador: ");
			double sueldo = Leer.nextDouble();	
			System.out.println("Ingrese la categoria del trabajador: ");
			char cat = Leer.next().charAt(0);	
			//Proceso
			//Evaluar categor�a del trabajador
			if(cat=='A') {
				sueldoBruto=sueldo*0.2+sueldo;
			}else if(cat=='B') {
				sueldoBruto=sueldo*0.15+sueldo;
			}else if(cat=='C') {
				sueldoBruto=sueldo*0.10+sueldo;
			}else if(cat=='D') {
				sueldoBruto=sueldo*0.05+sueldo;
			}
			//Calcular el descuento por seguro
			sueldoNeto = sueldoBruto-(sueldoBruto*0.05);
			//Reporte
			System.out.println("El sueldo neto de "+nombre+" es: "+sueldoNeto);
			System.out.println("�Desea continuar? S/N");
			resp=Leer.next().charAt(0);
		}while(resp=='S');
	}
}
