package Punto2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.LinkedList;

public class Test {
	public static void main(String[] args) {
		List<Cliente> lista = new LinkedList<>();
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection conn;
		
		try {
			conn = DriverManager.getConnection(
					"jdbc:postgresql://127.0.0.1:5432/ventas", "postgres", "");
			System.out.println(conn.getClass().getCanonicalName());
			Statement stmt = conn.createStatement();
			
			String sql = 
					"SELECT numero_documento, apellido, nombre, fecha_nacimiento, sexo, " +
							"domicilio" +
					" FROM cliente ";
			
			ResultSet rs1 = stmt.executeQuery(sql);
			
			while(rs1.next()){
				lista.add(new Cliente(rs1.getInt("numero_documento"), rs1.getString("apellido"), 
						rs1.getString("nombre"), rs1.getDate("fecha_nacimiento"), rs1.getString("sexo"), 
						rs1.getString("domicilio")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println();
		for (Cliente cliente : lista) {
			System.out.println(cliente);
		}
	}

}
