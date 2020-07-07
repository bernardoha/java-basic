package pe.bcha;

import java.util.Scanner;

public class Gaseosas {
	public static void main(String[] args) {
		Scanner Leer = new Scanner(System.in);
		System.out.println("Ingrese el nro. de ventas: ");
		int nro = Leer.nextInt();
		double acum=0;
		char tipo[] = new char[nro];
		double ventas[][] = new double[nro][4];
		//Estructura de repetición
		for (int i = 0; i < nro; i++) {
			//Entrada de datos
			System.out.println("Seleccione el tipo de producto: A / B / C: ");
			tipo[i] = Leer.next().charAt(0);
			System.out.println("Ingrese la cantidad de productos: ");
			ventas[i][0] = Leer.nextDouble();
			System.out.println("Ingrese el precio del producto: ");
			ventas[i][1] = Leer.nextDouble();
			//Proceso
			//Evaluar la cantidad de productos comprados
			if(ventas[i][0] >= 6) {
				if(tipo[i]=='A') {
					ventas[i][2]=(ventas[i][0]*ventas[i][1])*0.12;
				}else if(tipo[i]=='B') {
					ventas[i][2]=(ventas[i][0]*ventas[i][1])*0.08;
				}else {
					ventas[i][2]=(ventas[i][0]*ventas[i][1])*0.045;
				}
			}else {
				ventas[i][2] = 0;
			}
			//Calcular el monto de pago
			ventas[i][3]=(ventas[i][0]*ventas[i][1])-ventas[i][2];
			//Reporte o salida
			System.out.println("***********************************");
			System.out.println("Tipo de producto: "+tipo[i]);
			System.out.println("Cantidad comprada: "+ventas[i][0]);
			System.out.println("Monto del descuento: "+ventas[i][2]);
			System.out.println("Monto de pago: "+ventas[i][3]);
			//Acumular todas las ventas
			acum += ventas[i][3];
		}
		//Ordenamiento de datos de los arreglos
		for (int i = 0; i < nro-1; i++) {
			for (int j = 0; j < ventas.length-1; j++) {
				//Ordenar con base a la columna 3 del arreglo mpago
				if(ventas[j][3] < ventas[j+1][3]) {
					//Ordena la columna mpago
					double aux0 = ventas[j+1][3];
					ventas[j+1][3] = ventas[j][3];
					ventas[j][3] = aux0;
					//Ordena el vector Tipo
					char aux1 = tipo[j+1];
					tipo[j+1] = tipo[j];
					tipo[j] = aux1;
					//Ordena la columna cantidad
					double aux2 = ventas[j+1][0];
					ventas[j+1][0] = ventas[j][0];
					ventas[j][0] = aux2;
					//Ordena la columna precio
					double aux3 = ventas[j+1][1];
					ventas[j+1][1] = ventas[j][1];
					ventas[j][1] = aux3;
					//Ordena la columna descuento
					double aux4 = ventas[j+1][2];
					ventas[j+1][2] = ventas[j][2];
					ventas[j][2] = aux4;
				}
			}
		}
		//Mostrar datos de los arreglos
		System.out.println("********************************************");
		System.out.println("Tipo \t Cant \t Prec \t Desc \t M.Pago");
		for (int i = 0; i < nro; i++) {
			System.out.println(tipo[i]+" \t "+ventas[i][0]+" \t "+ventas[i][1]+
					" \t "+ventas[i][2]+" \t "+ventas[i][3]);
		}
		//Mostrar monto acumulado por todas la ventas
		System.out.println("********************************************");
		System.out.println("Monto acumulado por las ventas: "+acum);
	}

}
