package pe.edu.une.test;

import java.util.List;

import pe.edu.une.dao.EstudianteImpl;
import pe.edu.une.dao.PersonaInterface;
import pe.edu.une.entity.Estudiante;

public class Prueba02_Listar_Todos {

	public static void main(String[] args) {
		//Intanciar DAO
		PersonaInterface dao = new EstudianteImpl();
		//Instanciar lista
		List<Estudiante>lista = dao.buscarTodos();
		//Mostrar los datos obtenidos de la lista
		for (Estudiante est: lista) {
			System.out.println(est.getDni()+" "+est.getApellidos()+" "+est.getFechaNac());
		}
	}

}
