package pe.edu.une;

import java.util.Scanner;

public class Notas {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Leer = new Scanner(System.in);
		System.out.println("Ingrese el nro. de estudiantes: ");
		int nro = Leer.nextInt();
		//Crear arreglo con base al número ingresado
		String nomSit[][]=new String[nro][2];
		double notas[][]=new double[nro][5];
		int countD=0;
		//Capturar datos
		for (int i = 0; i < nro; i++) {
			System.out.println("Ingrese nombre: ");
			nomSit[i][0] = Leer.next();
			System.out.println("Ingrese nota de examen parcial: ");
			notas[i][0]=Leer.nextDouble();
			System.out.println("Ingrese nota de Proyecto de Inv.: ");
			notas[i][1]=Leer.nextDouble();
			System.out.println("Ingrese nota de Informes de Lectura: ");
			notas[i][2]=Leer.nextDouble();
			System.out.println("Ingrese nota de examen final: ");
			notas[i][3]=Leer.nextDouble();
			//Calcular la nota final
			notas[i][4]=notas[i][0]*0.20+notas[i][1]*0.30+notas[i][2]*0.30+notas[i][3]*0.20;
			//Mostrar la nota final
			System.out.println("Nota final: "+notas[i][4]);
			//Determinar la situación académica
			if(notas[i][4]>=10.5) {
				nomSit[i][1]="Aprobado";
			}else {
				nomSit[i][1]="Desaprobado";
				//Contar desaprobados
				countD++;
			}
		}//fin de for
		//Ordenamiento de notas, nombres y situación académica
		for (int i = 0; i < notas.length-1; i++) {
			for (int j = 0; j < notas.length-1; j++) {
				//Ordenar con base a la columna nota final
				if(notas[j][4]<notas[j+1][4]) {
					//Ordenar columna 0 del arreglo nomSit
					String aux0 = nomSit[j+1][0];
					nomSit[j+1][0]=nomSit[j][0];
					nomSit[j][0]=aux0;
					//Ordenar columna 0 del arreglo notas
					double aux1 = notas[j+1][0];
					notas[j+1][0]=notas[j][0];
					notas[j][0]=aux1;
					//Ordenar columna 1 del arreglo notas
					double aux2 = notas[j+1][1];
					notas[j+1][1]=notas[j][1];
					notas[j][1]=aux2;
					//Ordenar columna 2 del arreglo notas
					double aux3 = notas[j+1][2];
					notas[j+1][2]=notas[j][2];
					notas[j][2]=aux3;
					//Ordenar columna 3 del arreglo notas
					double aux4 = notas[j+1][3];
					notas[j+1][3]=notas[j][3];
					notas[j][3]=aux4;
					//Ordenar columna 4 del arreglo notas
					double aux5 = notas[j+1][4];
					notas[j+1][4]=notas[j][4];
					notas[j][4]=aux5;
					//Ordenar columna 1 del arreglo nomSit
					String aux6 = nomSit[j+1][1];
					nomSit[j+1][1]=nomSit[j][1];
					nomSit[j][1]=aux6;
				}
			}
		}//Fin de for
		//Mostrar datos ordenados
		System.out.println("Nombre \tEP \tNP \tIL \tEF \tNF \tSituación");
		for (int i = 0; i < nro; i++) {
			System.out.println(nomSit[i][0]+"\t"+notas[i][0]+"\t"+notas[i][1]+
					"\t"+notas[i][2]+"\t"+notas[i][3]+"\t"+notas[i][4]+
					"\t"+nomSit[i][1]);
		}
		//Mostrar la nota más alta y la nota más baja
		System.out.println("=======================================================");
		System.out.println(nomSit[0][0]+" tiene "+notas[0][4]+" como nota final más alta");
		System.out.println(nomSit[nro-1][0]+" tiene "+notas[nro-1][4]+" como nota final más baja");
		System.out.println("Número de aprobados: "+(nro-countD));
		System.out.println("Número de desaprobados: "+countD);
	}

}
