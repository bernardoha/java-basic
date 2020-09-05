package pe.edu.une.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import pe.edu.une.dao.EstudianteImpl;
import pe.edu.une.dao.PersonaInterface;
import pe.edu.une.entity.Estudiante;

public class Prueba05_Editar {

	public static void main(String[] args) {
		PersonaInterface pi = new EstudianteImpl();
		String fechaNac = "1990-08-06";
		//Formato para capturar fecha
		DateTimeFormatter formaFecha = DateTimeFormatter.ofPattern("yyyy-MM-d");
		// convert String to LocalDate
		LocalDate fecha = LocalDate.parse(fechaNac, formaFecha);
		//Crear el objeto a editar
		Estudiante e1=new Estudiante("78954562","CARMONA SOLIS","Ana Fabiana",fecha,
				"anafabi@une.edu.pe","955555555","Av. Iquitos 963",1);
		//Enviar el objeto al método editar
		pi.editar(e1);
		System.out.println("Proceso terminado");
	}

}
