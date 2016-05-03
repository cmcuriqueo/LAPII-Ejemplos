/*
 Escriba un programa que demuestre que un método con su propio bloque try no tiene que atrapar cada posible
  error generado en el bloque try. Algunas excepciones podrían escabullirse y manejarse en otros alcances.

 */
package Punto_7;

public class Persona {
	private String Nombre;
	private String Apellido;
	private int Documento;
	
	public Persona(String nombre, String apellido, int documento) throws NombreInValidoException,NumeroInvalidoException{
		
		if (nombre == null || nombre.trim().isEmpty()){
			throw new NombreInValidoException ("Debe ingresar un nombre no vacío");
			
		}
		this.Nombre = nombre;
		if (apellido == null || apellido.trim().isEmpty()){
			throw new NombreInValidoException ("Debe ingresar un apellido no vacío");
		}
		this.Apellido = apellido;
		if (documento < 1000000 || documento > 99999999){
			throw new NumeroInvalidoException("La edad " + documento + " es inválido");
		}
		this.Documento = Documento;	
		}
	
		public String getNombre() {
		return Nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public int getDocumento() {
		return Documento;
	}

	public String toString() {
		return "Persona [Nombre=" + Nombre + ", Apellido=" + Apellido + ", Edad=" + Documento + "]";
	}
}