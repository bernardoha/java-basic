package pe.edu.une.interfaces;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import pe.edu.une.conexion.Conexion;
import pe.edu.une.model.Estudiante;

public class EstudianteImpl implements PersonaInterface{
	private Connection cx;
	public EstudianteImpl() {
		cx=Conexion.conectar();
	}
	//Crear formato para mostrar fecha y hora
	DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-d");
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
		try {
			String sql = "Insert into estudiante(dni,apaterno,amaterno,nombres,"
					+ "email,fecnac,codigo,facultad,programa) values (?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = cx.prepareStatement(sql);
			ps.setString(1, est.getDni());
			ps.setString(2, est.getaPaterno());
			ps.setString(3, est.getaMaterno());
			ps.setString(4, est.getNombres());
			ps.setString(5, est.getEmail());
			String fNac=formatoFecha.format(est.getFecNac());
			//System.out.println(fNac);
			ps.setString(6, fNac);
			ps.setString(7, est.getCodigo());
			ps.setString(8, est.getFacultad());
			ps.setString(9, est.getPrograma());
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			System.out.println("Error al guardar datos");
		}
	}
}
