package pe.edu.une.test;

import java.sql.Connection;

import pe.edu.une.conexion.Conexion;

public class PruebaDB01 {

	public static void main(String[] args) {
		try {
			Connection cx = Conexion.conectar();
			//Evaluar si realiza la conexion
			if(cx != null) {
				System.out.println("Conexion OK");
			}
			//Cerrar conexion
			cx.close();
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
		
	}

}
