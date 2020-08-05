package pe.edu.une.prueba;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import pe.edu.une.conexion.Conexion;

public class PruebaDB02 {
	public static void main(String[] args) {
		Connection cx=null;
		try {
			//conectarse a la bd
			cx=Conexion.conectar();
			String sql = "select * from estudiante";
			Statement stm = cx.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				String fila="";
				fila+=rs.getString("apaterno")+" ";
				fila+=rs.getString("amaterno")+" ";
				fila+=rs.getString("nombres")+" ";
				System.out.println(fila);
			}
			rs.close();
			stm.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
