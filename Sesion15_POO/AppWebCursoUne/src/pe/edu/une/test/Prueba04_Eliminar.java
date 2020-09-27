package pe.edu.une.test;

import java.util.Scanner;

import pe.edu.une.dao.EstudianteImpl;
import pe.edu.une.dao.PersonaInterface;

public class Prueba04_Eliminar {

	public static void main(String[] args) {
		Scanner Leer = new Scanner(System.in);
		System.out.println("Ingrese dni: ");
		String dni = Leer.next();
		System.out.println("¿Desea eliminar? S/N: ");
		char resp = Leer.next().charAt(0);
		if (resp == 'S') {
			PersonaInterface pi = new EstudianteImpl();
			pi.eliminar(dni);
			System.out.println("Registro eliminado...");
		} else {
			System.out.println("No se eliminó el registro...");
		}
	}
}
