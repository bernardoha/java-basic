package pe.edu.une.interfaces;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import pe.edu.une.model.Estudiante;

public class EstudianteImpl implements PersonaInterface{
	//Crear formato para mostrar fecha y hora
	DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("d/MM/yyyy");
	DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
	@Override
	public void buscarPersona(String dni) {
		System.out.println("Buscando persona con dni: "+dni);
	}

	@Override
	public void eliminarPersona(String dni) {
		System.out.println("Eliminando persona con dni: "+dni);
		System.out.println("Fecha: "+formatoFecha.format(LocalDate.now()));
		System.out.println("Hora: "+formatoHora.format(LocalTime.now()));
	}

	@Override
	public void guardar(Estudiante est) {
		System.out.println("Guardando datos del Estudiante...");
		System.out.println("Codigo: "+est.getCodigo());
		System.out.println("Estudiante: "+est.getaPaterno()+" "+est.getaMaterno()+" "+est.getNombres());
		System.out.println("Programa de estudio: "+est.getPrograma());
		System.out.println("Fecha de nacimiento: "+formatoFecha.format(est.getFecNac()));
	}
}
