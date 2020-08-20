package pe.edu.une.test;

import java.util.Scanner;

import pe.edu.une.dao.EstudianteImpl;
import pe.edu.une.dao.PersonaInterface;
import pe.edu.une.entity.Estudiante;

public class Prueba06_BuscarAlumno {

	public static void main(String[] args) {
		Scanner Leer = new Scanner(System.in);
		PersonaInterface pi = new EstudianteImpl();
		try {
			System.out.println("Ingrese dni: ");
			String dni=Leer.next();
			Estudiante e1 = pi.buscarPersona(dni);
			//Mostrar datos del estudiante
			System.out.println(e1.getDni()+" "+e1.getApellidos()+", "+e1.getNombres()+
					" "+e1.getCorreo()+" "+e1.getFechaNac());
		} catch (Exception e) {
			System.out.println("Error en la busqueda");
		}finally {
			System.out.println("Proceso terminado");
		}
	}
}
