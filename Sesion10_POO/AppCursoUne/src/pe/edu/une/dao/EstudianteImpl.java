package pe.edu.une.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pe.edu.une.conexion.Conexion;
import pe.edu.une.entity.Estudiante;

public class EstudianteImpl implements PersonaInterface {
	private Connection cx;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(String dni) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(Estudiante est) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Estudiante buscarPersona(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

}
