package punto2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Escriba un programa que cuente las líneas de un archivo de texto cuyo 
 * nombre se recibe como argumento de la línea de comandos.
 */
public class test {
	
	public static void main(String[] args) {
		int lineas = 0;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(args[0]));
			
			try {
				while( br.readLine() != null ){
					lineas++;
				}
				System.out.println( "Lineas: " + lineas);
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

	}
}
