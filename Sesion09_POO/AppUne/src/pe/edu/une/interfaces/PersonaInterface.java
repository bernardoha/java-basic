package pe.edu.une.interfaces;

import pe.edu.une.model.Estudiante;

public interface PersonaInterface {
	public void buscarPersona(String dni);
	public void eliminarPersona(String dni);
	public void guardar(Estudiante est);
}
