package pe.edu.une.entity;

import java.time.LocalDate;

public class Persona {
	private String dni;
	private String apellidos;
	private String nombres;
	private LocalDate fechaNac;
	private String correo;
	private String telefono;
	private int estado;
	
	public Persona() {
		
	}

	public Persona(String dni, String apellidos, String nombres, LocalDate fechaNac, String correo, String telefono,
			int estado) {
		super();
		this.dni = dni;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.fechaNac = fechaNac;
		this.correo = correo;
		this.telefono = telefono;
		this.estado = estado;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	
}
