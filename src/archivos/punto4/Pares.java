package punto4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Escriba una clase que copie todas las líneas impares de un archivo de texto 
 * en un segundo archivo de texto. Los nombres de los archivos de texto son recibidos 
 * como argumentos desde la línea de comandos.

 */
public class Pares {
	public static void main(String[] args) {
		BufferedReader br = null;
		String linea = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader(args[0]));
			
			try {
				bw = new BufferedWriter(new  FileWriter(args[1]));
				while( (linea = br.readLine()) != null ){
					if( linea.length() % 2 != 0 && !linea.equals("")){
						bw.write(linea);
						bw.newLine();
					}
				}
				bw.close();
			} catch (IOException e) {
				System.err.println(e.getMessage());
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
