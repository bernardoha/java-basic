package pe.edu.une;

import java.util.Scanner;

public class Sueldo4 {

	public static void main(String[] args) {
		Scanner Leer=new Scanner(System.in);
		char resp = 'S';
		double acum = 0, sueldoBruto = 0, sueldoNeto=0;
		//Proceso de repetición do while
		do {
			//Datos
			System.out.println("Ingrese el nombre del trabajador: ");
			String nombre = Leer.next();
			System.out.println("Ingrese el sueldo del trabajador: ");
			double sueldo = Leer.nextDouble();	
			System.out.println("Ingrese la categoria del trabajador: ");
			char cat = Leer.next().charAt(0);	
			//Proceso
			//Evaluar categoría del trabajador
			if(cat=='A'||cat=='a') {
				sueldoBruto=sueldo*0.2+sueldo;
			}else if(cat=='B'||cat=='b') {
				sueldoBruto=sueldo*0.15+sueldo;
			}else if(cat=='C'||cat=='c') {
				sueldoBruto=sueldo*0.10+sueldo;
			}else if(cat=='D'||cat=='d') {
				sueldoBruto=sueldo*0.05+sueldo;
			}
			//Calcular el descuento por seguro
			sueldoNeto = sueldoBruto-(sueldoBruto*0.05);
			//Reporte
			System.out.println("El sueldo neto de "+nombre+" es: "+sueldoNeto);
			//Acumular los sueldos netos
			acum+=sueldoNeto; //acum=acum+sueldoNeto;
			System.out.println("******************************************");
			System.out.println("¿Desea continuar? S/N");
			resp=Leer.next().charAt(0);
		}while(resp=='S'||resp=='s');
		System.out.println("******************************************");
		System.out.println("Monto general pagado por la empresa: "+acum);
	}
}
