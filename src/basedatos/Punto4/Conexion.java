package Punto4;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class Conexion {
	private static final Logger LOGGER = Logger.getLogger(Conexion.class);
	static {
		try{
			Class.forName( "org.postgresql.Driver" );
		} catch( ClassNotFoundException e ) {
			LOGGER.error( e, e );
		}
	}
	
	public static Connection getConexion( String database, String user, String password ) throws SQLException{
		try {
			return DriverManager.getConnection(
					"jdbc:postgresql://127.0.0.1:5432/"+ database, user, password );
		} catch ( SQLException e ) {
			LOGGER.error( e, e );
			throw e;
		}
	}
	
	public static void imprimirMetadataConexion( Connection con ) throws SQLException{
		try {
			DatabaseMetaData dbmd = con.getMetaData();
			Statement st = con.createStatement();
			String[] TABLE_TYPE = {"TABLE"};
			String TABLE_NAME = "TABLE_NAME";
			ResultSet rs = dbmd.getTables(null, null, null, TABLE_TYPE);
			ResultSet rs1;
			
			while (rs.next()) {
				System.out.println(rs.getString(3));
				rs1 = st.executeQuery("SELECT * FROM "+ rs.getString(TABLE_NAME));
				ResultSetMetaData rsmd = rs1.getMetaData();
				int numeroColumnas = rsmd.getColumnCount();
				for (int i = 1; i <= numeroColumnas; i++) {
					System.out.print(rsmd.getColumnName(i)+": ");
					System.out.println(rsmd.getColumnTypeName(i));
				}
				System.out.println("-------------------");
			}

		} catch (SQLException e) {
			throw e;
		}
	}
	
	public static void closeConexion( Connection con ){
		try {
			con.close();
		} catch (Exception e) {
			LOGGER.error( e, e );
		}
	}
}
