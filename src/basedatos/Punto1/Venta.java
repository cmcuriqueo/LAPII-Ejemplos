package Punto1;

import java.nio.charset.CodingErrorAction;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;


/**Escriba un programa que se conecte a la base de datos Ventas y realice las siguientes tareas:
a) Imprima un listado de los vendedores con los importes promedio de ventas y la cantidad total de ventas 
	  realizadas.
b) Informe el ranking de los diez mejores clientes.
c) Informe el total de ventas por localidad.
*/

public class Venta {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection conn;
		
		try {
			conn = DriverManager.getConnection(
					"jdbc:postgresql://127.0.0.1:5432/ventas", "postgres", "carrasco");
			System.out.println(conn.getClass().getCanonicalName());
			Statement stmt = conn.createStatement();
			System.out.println();
			String sql = 
					"SELECT vendedor, AVG(total) AS promedio, COUNT(total) AS cantidad" +
						    " FROM venta " +
						    "GROUP BY vendedor";
			
			System.out.println(sql);
			ResultSet rs1 = stmt.executeQuery(sql);
			
			System.out.println("vend   | promedio | cantidad_ventas");
			System.out.println("-----------------------------------");
			while(rs1.next()){
				String codVendedor = rs1.getString("vendedor");
				double total = rs1.getDouble("promedio");
				int contador = rs1.getInt("cantidad");
				
				System.out.println(codVendedor + "    | " +  df.format(total) + "    | " + contador);
			}
			
			sql =
					"SELECT cliente , COUNT(total) AS Cantidad " + 
							"FROM venta " +
							"GROUP BY cliente "+
							"ORDER BY Cantidad DESC " +
							"LIMIT 10 ";
			System.out.println();
			System.out.println(sql);
			rs1 = stmt.executeQuery(sql);

			System.out.println("| cliente | cantidad_compras");
			System.out.println("----------------------------");
			while(rs1.next()){
				String codCliente = rs1.getString("cliente");
				int contador = rs1.getInt("Cantidad");
				
				System.out.println("|"+codCliente + " | " +  contador);
			}
			System.out.println();
			sql = 
					"SELECT rpad(l.nombre, 27, ' ') AS nombre, COUNT(v.cliente) AS cantidad " +
					"FROM venta v " +
						"INNER JOIN cliente c " +
						"ON v.cliente = c.numero_documento " +
						"INNER JOIN localidad l " +
						"ON c.localidad = l.codigo " +
						"GROUP BY l.nombre " +
						"ORDER BY l.nombre DESC";
			
			System.out.println(sql);
			rs1 = stmt.executeQuery(sql);
			System.out.println("| Localidad                     | cantidad_ventas");
			System.out.println("-----------------------------------------------");
			while(rs1.next()){
				String NomLoca = rs1.getString("nombre");
				int contador = rs1.getInt("cantidad");
				
				System.out.println("|"+NomLoca + "    | " +  contador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		

		
		
		
	}
}
