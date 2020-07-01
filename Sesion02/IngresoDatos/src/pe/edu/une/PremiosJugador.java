package pe.edu.une;

import java.util.Scanner;

public class PremiosJugador {
	public static void main(String[] args) {
		Scanner Leer = new Scanner(System.in);
		double premio=0;
		System.out.println("Ingrese los puntos conseguidos: ");
		int puntos = Leer.nextInt();
		System.out.println("Ingrese sueldo del jugador: ");
		double sueldo = Leer.nextDouble();
		//Evaluar el punjate adquirido
		if(puntos == 6) {
			premio=sueldo*0.5;	
		}else if(puntos < 5 && puntos >= 3) {
			premio=sueldo*0.2;	
		}else {
			premio=sueldo*0.05;	
		}
		//Calcular el monto a cobrar
		double montoCobrar = sueldo + premio;
		//Mostrar resultados
		System.out.println("El jugador cobra: "+montoCobrar);
	}
}
