package punto3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;

/*
 * 
 *  Cree un método que reciba una cadena que especifica la ruta de un archivo de texto 
 *  y que devuelva una colección de cadenas, donde cada cadena es una línea no vacía 
 *  de ese archivo de texto.
 */
public class test {
 public static Collection<String> cadenas (String ruta){
	 LinkedList<String> cadenas = new LinkedList<String>();
	 String linea=null;
	 BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(ruta));
			
			try {
				while((linea =  br.readLine()) != null ){
					if (!linea.equals("")){
						cadenas.add(linea);
					}
						
				}
			} catch (IOException e) {
				System.err.println("No se pudo leer el archivo");
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("No se pudo abrir el archivo");
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				
			}
		}
	return cadenas;
	 
 }
 public static void main(String[] args) {
	 String ruta = args[0];
	 Collection<String> cadena = cadenas(ruta);
	 for (String string : cadena) {
		System.out.println(string);
	}
}



}
