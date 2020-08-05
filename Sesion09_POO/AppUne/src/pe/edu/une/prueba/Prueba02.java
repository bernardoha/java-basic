package pe.edu.une.prueba;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import pe.edu.une.interfaces.EstudianteImpl;
import pe.edu.une.interfaces.PersonaInterface;
import pe.edu.une.model.Estudiante;

public class Prueba02 {

	public static void main(String[] args) {
		Scanner Leer = new Scanner(System.in);
		//Crear instancia de la interfaz y la clase que lo implementa
		PersonaInterface pi = new EstudianteImpl();	
		//Capturar datos
		System.out.println("Ingrese dni para buscar: ");
		String dni = Leer.next();
		pi.buscarPersona(dni);
		System.out.println("Ingrese dni para eliminar");
		String dni2 = Leer.next();
		pi.eliminarPersona(dni2);
		System.out.println("DATOS DE ESTUDIANTE");
		System.out.println("Ingrese dni del estudiante: ");
		String dni3=Leer.next();
		System.out.println("Ingrese apellido paterno: ");
		String aPaterno=Leer.next();
		System.out.println("Ingrese apellido materno: ");
		String aMaterno=Leer.next();
		System.out.println("Ingrese nombre: ");
		String nombre=Leer.next();
		System.out.println("Ingrese correo electrónico: ");
		String correo=Leer.next();
		System.out.println("Ingrese fecha de nacimiento: ");
		String fecNac = Leer.next();
		//Crear formato para ingresar fecha
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/MM/yyyy");
		//Convertir de String a LocalDate
		LocalDate fecha = LocalDate.parse(fecNac,formato);
		System.out.println("Ingrese código del estudiante");
		String codigo=Leer.next();
		System.out.println("Ingrese facultad");
		String facultad=Leer.next();
		System.out.println("Ingrese el programa de estudio");
		String programa=Leer.next();
		Estudiante e1 = new Estudiante(dni3,aPaterno,aMaterno,nombre,correo,
				fecha,codigo,facultad,programa);
		//Llamar al método guardar
		pi.guardar(e1);

	}

}
