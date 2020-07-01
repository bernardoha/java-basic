package pe.edu.une;

public class Logicos {
	public static void main(String[] args) {
		// Datos
		int v1 = 10;
		int v2 = 10;
		int v3 = 3;
		String linea = "================================================";
		//Proceso y Reporte
		System.out.println(linea);
		System.out.println("¿v1 es igual a v2 Y v2 mayor a v3?: "+((v1 == v2) && (v2 > v3)));
		System.out.println("¿v1 es igual a v2 O v2 igual a v3?: "+((v1 == v2) || (v2 == v3)));
		System.out.println("v1 es menor igual que v2, pero es negado entonces es: "+ !(v1 <= v2));
		System.out.println(linea);
	}

}
