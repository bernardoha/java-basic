package pe.edu.une.prueba;



import java.time.LocalDate;

import pe.edu.une.interfaces.EstudianteImpl;
import pe.edu.une.interfaces.PersonaInterface;
import pe.edu.une.model.Estudiante;

public class Prueba01 {

	public static void main(String[] args) {
		//Crear una instancia de la interfaz y la clase que lo implementa
		PersonaInterface pi = new EstudianteImpl();
		//Hacer uso de los métodos implementados
		pi.buscarPersona("89564568");
		pi.eliminarPersona("89564568");
		//Crear un objeto
		Estudiante e1 = new Estudiante("78945687","LAGUNA","MORALES","Adan","alaguna@une.edu.pe",
				LocalDate.of(1999, 6, 6),"20161457","Tecnología","Telecomunicaciones");
		//e1.setDni("78945687");
		//Estudiante e2 = new Estudiante();
		pi.guardar(e1);
	}

}
