package Punto3;

import java.io.Reader;
import java.sql.Connection;

import java.sql.Date;

import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Test {
	public static void imprimirVentas(String fecha, String codigo) throws SQLException{

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
			PreparedStatement pstmt = conn.prepareStatement("SELECT id, fecha, cliente, producto, total, vendedor ,tarjeta IS NULL AS tarjeta"+
					" FROM venta" +
					" WHERE vendedor = ? AND fecha = ? ");
			pstmt.setString(1, codigo);
			pstmt.setDate(2, java.sql.Date.valueOf(fecha));

			
			
			ResultSet rs1 = pstmt.executeQuery();
			
			System.out.println("id   |  fecha     |  cliente | producto | total  | vendedor |  E/T    |");
			while(rs1.next()){
				int id = rs1.getInt("id");
				Date fecha1 = rs1.getDate("fecha");
				int cliente = rs1.getInt("cliente");
				String producto = rs1.getString("producto");
				double total = rs1.getDouble("total");
				String vendedor = rs1.getString("vendedor");
				boolean ET = rs1.getBoolean("tarjeta");
				
				System.out.print(id +" | " + fecha1 + " | " + cliente + " | " + producto + "    | " + total + " | " + vendedor);
				if (ET == true){
					System.out.println("      | efectivo |");
				} else {
					System.out.println("      | tarjeta |");
				}
				DatabaseMetaData MetaDatos = conn.getMetaData();
				ResultSet rs = MetaDatos.getTables(null, null, "%", null);
				while (rs.next()) {
					   String catalogo = rs.getString(1);
					   String tabla = rs.getString(3);
					   System.out.println("TABLA=" + catalogo + "." + tabla);
					}
				
						//y ResultSetMetaDat
					
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws SQLException {
		imprimirVentas("2011-06-11","GOM");
		
	}

}
