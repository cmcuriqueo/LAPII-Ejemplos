package Punto2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
	
	public static Connection getConexion() throws SQLException{
		try {
			return DriverManager.getConnection(
					"jdbc:postgresql://127.0.0.1:5432/ventas", "postgres", "carrasco" );
		} catch ( SQLException e ) {
			LOGGER.error( e, e );
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
