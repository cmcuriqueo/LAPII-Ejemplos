package pruebasExcepciones;

public class TestPunto9 {
	
	public static void main(String[] args) {
		
		
			try{
			Persona persona1 = new Persona ("1234","Juan","Herrera");
			System.out.println("Esta todo correcto. \nSe llama: " + persona1.getNombre() + " " + persona1.getApellido() +"\nDNI: " + persona1.getDni() );
			}
			catch(NumberFormatException e){
				System.err.println("Ingresaste un numero no valido");
				
			}
			catch(NombreErroneoException ex){
				System.err.println(ex.getMessage());
			}
			
	}
}