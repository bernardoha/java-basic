package pe.edu.une;

public class Especiales {

	public static void main(String[] args) {
		// Datos
		int v1 = 5;
		int v2 = 10;
		String linea = "********************************";
		//Proceso y reporte
		//Post incremento
		System.out.println("Deber�a ser 5: "+ v1++);
		System.out.println("Deber�a ser 6: "+ v1);
		System.out.println(linea);
		//Pre incremento
		System.out.println("Deber�a ser 11: "+ ++v2);
		System.out.println("Deber�a ser 11: "+ v2);
		System.out.println(linea);
		//Post decremento
		System.out.println("Deber�a ser 6: "+ v1--);
		System.out.println("Deber�a ser 5: "+ v1);
		System.out.println(linea);
		//Pre decremento
		System.out.println("Deber�a ser 10: "+ --v2);
		System.out.println("Deber�a ser 10: "+ v2);
		System.out.println(linea);
	}

}
