package pe.edu.une.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import pe.edu.une.conexion.Conexion;
import pe.edu.une.entity.Estudiante;

public class EstudianteImpl implements PersonaInterface {
	private Connection cx;
	DateTimeFormatter formFecha = DateTimeFormatter.ofPattern("yyyy-MM-d");
	DateTimeFormatter formHora = DateTimeFormatter.ofPattern("HH:mm:ss");
	//El constructor se ejecuta por cada nueva instancia de la clase
	public EstudianteImpl() {
		cx=Conexion.conectar();
	}
	@Override
	public List<Estudiante> buscarTodos() {
		//Crear un instancia ArrayList para guardar datos de muchos estudiantes
		List<Estudiante> estudiantes=new ArrayList<>();
		try {
			//Sentencia sql
			String sql="select * from estudiante where estado = 1";
			Statement st = cx.createStatement();
			//Permite obtener los resultados de una consulta
			ResultSet rs = st.executeQuery(sql);
			//Recorrer los resultados de la consulta
			while(rs.next()) {
				//El método next mueve el cursor una fila dentro del resultado
				Estudiante est = new Estudiante();
				est.setDni(rs.getString("dniestudiante"));
				//System.out.println(rs.getString("dniestudiante"));
				est.setApellidos(rs.getString("apellidos"));
				est.setNombres(rs.getString("nombres"));
				est.setFechaNac((rs.getDate("fechanac").toLocalDate()));
				est.setCorreo(rs.getString("correo"));
				est.setTelefono(rs.getString("telefono"));
				est.setDireccion(rs.getString("direccion"));
				est.setEstado(rs.getInt("estado"));
				//Pasar el objeto formado al ArrayList
				estudiantes.add(est);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return estudiantes;
	}

	@Override
	public void guardar(Estudiante est) {
		try {
			String sql = "Insert into estudiante(dniestudiante,apellidos,nombres,fechanac,"
					+ "direccion,correo,telefono,estado) values (?,?,?,?,?,?,?,?)";
				PreparedStatement ps = cx.prepareStatement(sql);
				ps.setString(1, est.getDni());
				ps.setString(2, est.getApellidos());
				ps.setString(3, est.getNombres());
				//Dar formato a la fecha que llegar para pasar a Date
				String fNac = formFecha.format(est.getFechaNac());
				ps.setString(4, fNac);
				ps.setString(5, est.getDireccion());
				ps.setString(6, est.getCorreo());
				ps.setString(7, est.getTelefono());
				ps.setInt(8, 1);
				ps.executeUpdate();
				ps.close();
		} catch (Exception e) {
			System.out.println("Error al guardar datos"+e.getMessage());
		}
		
	}

	@Override
	public void eliminar(String dni) {
		try {
			//String sql = "delete from estudiante where dniestudiante = ?";
			String sql = "update estudiante set estado = ? where dniestudiante = ?";
			PreparedStatement ps = cx.prepareStatement(sql);
			ps.setInt(1,0);
			ps.setString(2,dni);
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			System.out.println("Error al eliminar datos: "+e.getMessage());
		}		
	}

	@Override
	public void editar(Estudiante est) {
		try {
			String sql = "update estudiante set apellidos=?,nombres=?,fechanac=?,"
					+ "direccion=?,correo=?,telefono=?,estado=? where dniestudiante=?";
				PreparedStatement ps = cx.prepareStatement(sql);
				ps.setString(1, est.getApellidos());
				ps.setString(2, est.getNombres());
				//Dar formato a la fecha que llegar para pasar a Date
				String fNac = formFecha.format(est.getFechaNac());
				ps.setString(3, fNac);
				ps.setString(4, est.getDireccion());
				ps.setString(5, est.getCorreo());
				ps.setString(6, est.getTelefono());
				ps.setInt(7, est.getEstado());
				ps.setString(8, est.getDni());
				
				ps.executeUpdate();
				ps.close();
		} catch (Exception e) {
			System.out.println("Error al editar datos: "+e.getMessage());
		}
		
	}

	@Override
	public Estudiante buscarPersona(String dni) {
		// Crear una instancia de la clase Estudiantes
		Estudiante est = new Estudiante();
		try {
			//Crear la sentencia sql
			String sql = "Select * from estudiante where dniestudiante = ?";
			//Procesar la sentencia sql
			PreparedStatement ps = cx.prepareStatement(sql);
			ps.setString(1,dni);
			//Ejecutar la sentencia sql
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				//El método next mueve el cursor una fila dentro del resultado
				est.setDni(rs.getString("dniestudiante"));
				//System.out.println(rs.getString("dniestudiante"));
				est.setApellidos(rs.getString("apellidos"));
				est.setNombres(rs.getString("nombres"));
				est.setFechaNac((rs.getDate("fechanac").toLocalDate()));
				est.setCorreo(rs.getString("correo"));
				est.setTelefono(rs.getString("telefono"));
				est.setDireccion(rs.getString("direccion"));
				est.setEstado(rs.getInt("estado"));
			}
		} catch (Exception e) {
			System.out.println("Error al buscar datos: "+e.getMessage());
		}
		return est;
	}
}
