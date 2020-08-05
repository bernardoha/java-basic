package pe.edu.une.model;

import java.time.LocalDate;

public class Estudiante extends Persona {
	private String codigo;
	private String facultad;
	private String programa;
	//Métodos constructores
	public Estudiante() {
		
	}
	public Estudiante(String dni, String aPaterno, String aMaterno, String nombres, 
			String email, LocalDate fecNac,String codigo,String facultad,
			String programa) {
		super(dni, aPaterno, aMaterno, nombres, email, fecNac);
		this.codigo=codigo;
		this.facultad=facultad;
		this.programa=programa;
	}
	//Métodos get set
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	
	
}
