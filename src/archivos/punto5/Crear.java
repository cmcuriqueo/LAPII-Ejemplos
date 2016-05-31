package punto5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class Crear {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		Empleado persona = new Empleado("Juan Jose");
		File archivo = new File("persona.data");
		FileOutputStream os = new FileOutputStream(archivo);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		oos.writeObject(persona);
		
		oos.close();
	}
	

}