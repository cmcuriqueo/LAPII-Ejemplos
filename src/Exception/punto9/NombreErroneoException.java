package pruebasExcepciones;


public class NombreErroneoException extends Exception
{
	private static final long serialVersionUID = 1L;

	public NombreErroneoException(){}
	public NombreErroneoException(String mensaje)
		{
			super(mensaje);
			
		}
	
}