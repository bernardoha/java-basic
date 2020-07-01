package pe.edu.une;

public class Asignacion {
	public static void main(String[] args) {
		//Variables
		int v1, v2, v3, v4, v5, v6;
		//Asignar datos a variables
		v1 = 10;
		v2 = 5;
		v3 = 8;
		v4 = 4;
		v5 = 30;
		v6 = 40;
		//Proceso
		v2 += v1; //Es igual a v2=v2+v1;
		v3 -= v1; //Es igual a v3=v3-v1;
		v4 *= v1; //Es igual a v4=v4*v1;
		v5 /= v1; //Es igual a v5=v5/v1;
		v6 %= v1; //Es igual a v6=v6%v1;
		//Reporte o salida
		System.out.println("V1: "+v1);
		System.out.println("V2: "+v2);
		System.out.println("V3: "+v3);
		System.out.println("V4: "+v4);
		System.out.println("V5: "+v5);
		System.out.println("V6: "+v6);
	}

}
