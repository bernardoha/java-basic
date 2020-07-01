package pe.edu.une;

import java.util.Scanner;

public class Notas {
	public static void main(String[] args) {
		Scanner Leer = new Scanner(System.in);
		System.out.println("Ingrese el nro. de estudiantes: ");
		int nro = Leer.nextInt();
		int prom[] = new int[nro];
		int countD = 0;
		//Capturar las notas
		for (int i = 0; i < nro; i++) {
			System.out.println("Ingrese nota: ");
			prom[i] = Leer.nextInt();
			//Contar el nro. de desaprobados
			if(prom[i] < 11) {
				countD++;
			}
		}
		//Ordenamiento de promedios
		for (int i = 0; i < prom.length-1; i++) {
			for (int j = 0; j < prom.length-1; j++) {
				if(prom[j]<prom[j+1]) {
					int aux = prom[j+1];
					prom[j+1] = prom[j];
					prom[j] = aux;
				}
			}
		}//Fin de for
		//Mostrar datos ordenados
		for (int i = 0; i < nro; i++) {
			System.out.println("Nota: "+prom[i]);
		
	}
		//Notas alta, baja aprobados y desaprobados
		System.out.println("*************************************");
		System.out.println("Nota más alta: "+prom[0]);
		System.out.println("Nota más baja: "+prom[nro-1]);
		System.out.println("Aprobados: "+ (nro-countD));
		System.out.println("Desaprobados: "+ countD);
		System.out.println("*************************************");
	}
}

