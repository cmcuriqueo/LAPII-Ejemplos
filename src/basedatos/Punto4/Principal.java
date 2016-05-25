package Punto4;

import java.sql.Connection;
import java.sql.SQLException;

public class Principal {

	public static void main(String[] args) throws SQLException{
		try {
			Connection con= Conexion.getConexion("ventas", "postgres", "postgres");
			Conexion.imprimirMetadataConexion(con);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
