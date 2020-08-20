package pe.edu.une.dao;

import java.util.List;

import pe.edu.une.entity.Estudiante;

public interface PersonaInterface {
	 public List<Estudiante> buscarTodos();
	 public void guardar(Estudiante est);
	 public void eliminar(String dni);
	 public void editar(Estudiante est);
	 public Estudiante buscarPersona(String dni);
}
