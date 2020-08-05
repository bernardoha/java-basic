package pe.edu.une.model;

import java.time.LocalDate;

public class Persona {
 private String dni;
 private String aPaterno;
 private String aMaterno;
 private String nombres;
 private String email;
 private LocalDate fecNac;
 
 //Métodos constructores
 public Persona() {
	 
 }

public Persona(String dni, String aPaterno, String aMaterno, String nombres, String email, LocalDate fecNac) {
	super();
	this.dni = dni;
	this.aPaterno = aPaterno;
	this.aMaterno = aMaterno;
	this.nombres = nombres;
	this.email = email;
	this.fecNac = fecNac;
}
//Métodos get y set

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}

public String getaPaterno() {
	return aPaterno;
}

public void setaPaterno(String aPaterno) {
	this.aPaterno = aPaterno;
}

public String getaMaterno() {
	return aMaterno;
}

public void setaMaterno(String aMaterno) {
	this.aMaterno = aMaterno;
}

public String getNombres() {
	return nombres;
}

public void setNombres(String nombres) {
	this.nombres = nombres;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public LocalDate getFecNac() {
	return fecNac;
}

public void setFecNac(LocalDate fecNac) {
	this.fecNac = fecNac;
}
 
}
