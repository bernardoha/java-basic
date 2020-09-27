package pe.edu.une.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import pe.edu.une.conexion.Conexion;
import pe.edu.une.entity.Usuario;

public class UsuarioDao {
	private Connection cx;
	public UsuarioDao() {
		cx=Conexion.conectar();
	}
	private static final String sql="select * from administrativo where correo like ? and clave like ?"; 
	
	//Método que permite verificar si existe el usuario
	public boolean verificarUsuario(Usuario user) {
		try {
			PreparedStatement ps = cx.prepareStatement(sql);
			ps.setString(1, user.getCorreo());
			ps.setString(2, user.getClave());
			ResultSet rs = ps.executeQuery();
			//Evaluar si existe una fila encontrada en rs.
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {
			System.out.println("Error al buscar usuario: "+e.getMessage());
		}
		return false;
	}
}
