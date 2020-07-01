package pe.edu.une;

import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {
		Scanner Leer=new Scanner(System.in);
		char resp = 'S';
		double acum = 0, sueldoBruto = 0, sueldoNeto=0;
		//Proceso de repetición do while
		do {
			System.out.println("Hola");
			System.out.println("¿Desea continuar? S/N");
			resp=Leer.next().charAt(0);
		}while(resp=='S');
	}
}
