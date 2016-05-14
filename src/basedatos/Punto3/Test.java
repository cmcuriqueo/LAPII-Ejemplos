package Punto3;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
	public static void imprimirVentas(String fecha, String codigo) throws SQLException{

		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(
					"jdbc:postgresql://127.0.0.1:5432/ventas", "postgres", "carrasco");
			PreparedStatement pstmt = conn.prepareStatement("SELECT lpad(id::text, 4, ' ' ) as id, fecha," +
					" rpad(cliente::text, 8, ' ') as cliente, producto," +
					" rpad(total::text,6, ' ') as total, vendedor ,tarjeta IS NULL AS tarjeta"+
					" FROM venta" +
					" WHERE vendedor = ? AND fecha = ? ");
			pstmt.setString(1, codigo);
			pstmt.setDate(2, java.sql.Date.valueOf(fecha));

			ResultSet rs1 = pstmt.executeQuery();
			
			System.out.println("  id |   fecha    |  cliente | producto | total  | vendedor |   E/T   |");
			System.out.println("-----------------------------------------------------------------------");
			while(rs1.next()){
				String id = rs1.getString("id");
				Date fecha1 = rs1.getDate("fecha");
				String cliente = rs1.getString("cliente");
				String producto = rs1.getString("producto");
				String total = rs1.getString("total");
				String vendedor = rs1.getString("vendedor");
				boolean ET = rs1.getBoolean("tarjeta");
				
				System.out.print(id +" | " + fecha1 + " | " + cliente + " | " + producto + "    | " + total + " | " + vendedor);
				
				if (ET) System.out.println("      | efectivo |");
				else System.out.println("      | tarjeta  |");			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
	}
	
	public static void main(String[] args) throws SQLException {
		
		imprimirVentas("2011-06-11","GOM");
		
	}

}
