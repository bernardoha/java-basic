package pe.edu.une.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	protected static Connection cx;
	//Crear el método conectar
	public static Connection conectar() {
		//Evaluar si la conexion ya há sido creada
		if(cx != null) {
			return cx;
		}
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/dbcurso2020?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String user="root";
			String pass="abcd1234";
			//Verificar en las librerias, las estructura de los paquetes
			Class.forName(driver);
			cx=DriverManager.getConnection(url,user,pass);
		} catch (Exception e) {
			System.err.println("Error al conectar BD: "+e.getMessage());
		}
		return cx;
	}
	//Método que permite desconectar
	public static void desconectar() {
		//Evaluar si existe conexion
		if(cx==null) {
			return;
		}
		//Si existe la conexion
		try {
			cx.close();
		} catch (Exception e) {
			System.err.println("Error al cerrar BD: "+e.getMessage());
		}
	}
}
