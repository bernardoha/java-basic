package pe.edu.une;

import java.util.Scanner;

public class MayorMenor {
	public static void main(String[] args) {
		Scanner Leer = new Scanner(System.in);
		System.out.println("Ingrese nro. para tama�o del arreglo");
		int nro = Leer.nextInt();
		int numeros[]=new int[nro];
		//Declarar variables
		int numMayor = 0, numMenor=0;
		//Ingresar n�meros al arreglo
		for (int i = 0; i < nro; i++) {
			System.out.println("Ingrese valor: "+(i+1));
			numeros[i]=Leer.nextInt();
		}//fin de for
		//Comparar n�meros para obtener el mayor y el menor
		int mayor = numeros[0], menor=numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]>mayor) {
				mayor = numeros[i];
			}
			if(numeros[i]<menor) {
				menor = numeros[i];
			}
		}
		//Evaluar el nro. de veces que se repite el nro. mayor y menor
		for (int i = 0; i < nro; i++) {
			if(numeros[i]==mayor){
				numMayor++;
			}
			if(numeros[i]==menor){
				numMenor++;
			}
		}
		System.out.println("N�mero mayor: "+mayor+" se repite "+numMayor+" veces");
		System.out.println("N�mero menor: "+menor+" se repite "+numMenor+" veces");
	}
}
