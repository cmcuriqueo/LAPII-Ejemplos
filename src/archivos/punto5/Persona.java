package punto5;

import java.io.InputStream;
import java.io.Serializable;

public class Persona implements Serializable{
	private static final long serialVersionUID = 1L;
	private String Nombre;
	private transient InputStream in;

	
	
	public Persona(String nombre){
		this.in = System.in;
		setNombre(nombre);
	}
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
}
