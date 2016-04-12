package misColecciones.Ejercicio7;

public class Empresa {
	private String nombre;
	
	public Empresa( String nombre ) {
		setNombre( nombre );
	}
	public void setNombre( String nombre ){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String toString() {
		return this.nombre;
	}
}
