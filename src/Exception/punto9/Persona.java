package pruebasExcepciones;



public class Persona  {
	private int dni;
	private String nombre;
	private String apellido;
	
	public Persona(String dni, String nombre, String apellido) throws NumberFormatException, NombreErroneoException {
		
		setDni(dni);
		setNombre(nombre);
		this.apellido = apellido;
	}


	public int getDni() {
		return dni;
	}
	
	
	public void setDni(String dni) throws NumberFormatException {
		
		     this.dni= Integer.parseInt(dni);		
	}
	
	
	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) throws NombreErroneoException, StringIndexOutOfBoundsException
	{
		
		
		String numeros = "0123456789";
		
		for ( int i=0 ; i< nombre.length();i++)
			{
			
				for ( int j=0 ; j < numeros.length(); j++)
				   {
					if(nombre.charAt(i)==numeros.charAt(j))
					{	
						 throw new NombreErroneoException("El nombre no puede tener numeros");
					}
					
				   }
			}	
		
		if(nombre.length()<3)
		{
			 throw new NombreErroneoException("El nombre no puede tener menos de 3 digitos");
		}else{
			this.nombre=nombre;
		}
		
	}
	
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		
		this.apellido = apellido;
	}
	
	
	
	

}
