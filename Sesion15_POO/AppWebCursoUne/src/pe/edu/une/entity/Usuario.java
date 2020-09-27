package pe.edu.une.entity;

public class Usuario {
	private String dniAdmin;
	private String correo;
	private String clave;
	
	public Usuario() {
		
	}

	public Usuario(String correo, String clave) {
		super();
		this.correo = correo;
		this.clave = clave;
	}

	public String getDniAdmin() {
		return dniAdmin;
	}

	public void setDniAdmin(String dniAdmin) {
		this.dniAdmin = dniAdmin;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
}
