package pe.edu.une;

public class Edades {

	public static void main(String[] args) {
		//Declarar arreglo y asignar datos
		int edades[]= {40,21,4,9,10,35};
		//Ordenar usando el método burbuja
		for (int i = 0; i < edades.length-1; i++) {
			for (int j = 0; j < edades.length-1; j++) {
				//Evaluar los datos de acuerdo a las posiciones
				if(edades[j] < edades[j+1]) {
					int tmp = edades[j+1];
					edades[j+1]=edades[j];
					edades[j] = tmp;
				}
			}//Fin de for
		}//Fin de for
		//Mostrar datos del arreglo ordenado
		for (int i = 0; i < edades.length; i++) {
			System.out.println("Edad: "+edades[i]);
		}
	}
}
