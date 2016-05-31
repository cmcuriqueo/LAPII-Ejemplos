package punto5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import punto5.Persona;

public class Leer {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		InputStream is = new FileInputStream("persona.data");
		ObjectInputStream ois = new ObjectInputStream (is);
		Empleado persona = (Empleado) ois.readObject();
		
		System.out.println("El nombre del Empleado es : " + persona.getNombre());
	}
}