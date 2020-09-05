package pe.edu.une.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import pe.edu.une.dao.EstudianteImpl;
import pe.edu.une.dao.PersonaInterface;
import pe.edu.une.entity.Estudiante;

public class Prueba03_Guardar {
	public static void main(String[] args) {
		Scanner Leer=new Scanner(System.in);
		PersonaInterface pi = new EstudianteImpl();
		System.out.println("Dni: ");
		String dni = Leer.next();
		System.out.println("Apellidos: ");
		String apellidos = Leer.next();
		System.out.println("Nombres: ");
		String nombres=Leer.next();
		System.out.println("Fecha de nacimiento: ");
		String fechaNac = Leer.next();
		//Formato para capturar fecha
		DateTimeFormatter formaFecha = DateTimeFormatter.ofPattern("yyyy-MM-d");
		// convert String to LocalDate
		LocalDate fecha = LocalDate.parse(fechaNac, formaFecha);
		System.out.println("Correo: ");
		String correo = Leer.next();
		System.out.println("Teléfono: ");
		String telefono=Leer.next();
		System.out.println("Dirección: ");
		String direccion = Leer.next();
		//Crear un objeto con los datos capturados
		Estudiante e1 = new Estudiante(dni,apellidos,nombres,fecha, correo, 
				telefono, direccion,1);
		//Envía el objeto e1 al método guardar que se encuentra en EstudianteImpl
		pi.guardar(e1);
		
	}

}
