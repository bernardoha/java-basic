package pe.edu.une.entity;

import java.time.LocalDate;

public class Estudiante extends Persona {
	private String direccion;
	public Estudiante() {
		
	}
	public Estudiante(String dni, String apellidos, String nombres, LocalDate fechaNac, String correo, String telefono,
			String direccion,int estado) {
		super(dni, apellidos, nombres, fechaNac, correo, telefono, estado);
		this.direccion=direccion;
		
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
