package Punto2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;


/*
 * Escriba un programa que obtenga los datos de los clientes y 
 * los guarde en una colección de objetos de tipo Cliente.
 */
public class Cliente {
	private int numero_documento ;
	private String apellido;
	private String nombre;
	private Date fecha_nacimiento;
	private String sexo;
	private String domicilio;
	private int localidad;
	
	public Cliente(int numero_documento, String apellido, String nombre,
		Date fecha_nacimiento, String sexo, String domicilio) {
	   	setNumero_documento(numero_documento);
	  	setApellido(apellido);
	  	setNombre(nombre);
		setFecha_nacimiento(fecha_nacimiento);
		setSexo(sexo);
		setDomicilio(domicilio);
	}
	  
	public int getNumero_documento() {
		return numero_documento;
	}
	
	public void setNumero_documento(int numero_documento) {
		this.numero_documento = numero_documento;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo2) {
		this.sexo = sexo2;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public int getLocalidad() {
		return localidad;
	}
	
	public void setLocalidad(int localidad) {
		this.localidad = localidad;
	}
	
	@Override
	public String toString(){
		return this.getNombre() + " " + this.getApellido();
	}
	
	public static Collection<Cliente> getClientes() throws SQLException {
		Collection<Cliente> clientes = new LinkedList<Cliente>();
		Connection conn = null;
		try {
			conn = Conexion.getConexion();
			String sql = 
					"SELECT numero_documento, apellido, nombre, fecha_nacimiento, sexo, " +
							"domicilio" +
					" FROM cliente ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs1 = pstmt.executeQuery();
			while(rs1.next()){
				clientes.add(new Cliente(rs1.getInt("numero_documento"), rs1.getString("apellido"), 
						rs1.getString("nombre"), rs1.getDate("fecha_nacimiento"), rs1.getString("sexo"), 
						rs1.getString("domicilio")));
			}
		} catch (SQLException e) {
			throw e;
		} finally {
			Conexion.closeConexion(conn);
		}
		return clientes;
	}
}
