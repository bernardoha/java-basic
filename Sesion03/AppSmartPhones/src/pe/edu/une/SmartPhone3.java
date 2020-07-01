package pe.edu.une;

import java.util.Scanner;

public class SmartPhone3 {

	public static void main(String[] args) {
		Scanner Leer = new Scanner(System.in);
		//Variables
		double desc, impPago,acum=0;
		System.out.println("Ingrese el nro. de equipos: ");
		int nro = Leer.nextInt();
		for(int i=0;i<nro;i++) {
		//Datos
		System.out.println("Ingrese marca: ");
		String marca = Leer.next();
		System.out.println("Ingrese precio: ");
		double precio = Leer.nextDouble();
		System.out.println("Ingrese cantidad: ");
		int cant = Leer.nextInt();
		//Proceso
		//Calcular importe bruto
		double impBruto=precio*cant;
		//Evaluar descuento
		if(cant > 6) {
			desc=impBruto*0.4;
		}else {
			desc=impBruto*0.05;
		}
		//Calcular el importe pago
		impPago = impBruto - desc;
		//Reporte
		System.out.println("Marca: "+marca);
		System.out.println("Precio: "+precio);
		System.out.println("Cantidad: "+cant);
		System.out.println("Importe del descuento: "+desc);
		System.out.println("Importe de pago: "+impPago);
		System.out.println("*******************************");
		//Acumular los importes de pago
		acum += impPago; // acum=acum+impPago;
		}//Fin de for
		//Mostrar los importes de pago acumulados
		System.out.println("**********************************");
		System.out.println("El importe de todas la ventas es: "+acum);
	}
}




