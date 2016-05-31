package punto6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

/*
 * Utilice un objeto BufferedReader para leer un archivo de texto y 
 * guardarlo con el mismo nombre con el sufijo "mayus" en el mismo directorio, 
 * cuyo contenido sea el mismo pasado a mayúsculas. Implemente una especialización de 
 * algún tipo Filter
 */
public class test extends FilterReader {

	protected test(Reader in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int read() throws IOException {
		int c;
		if ((c = super.read()) != -1 ){
			c = Character.toUpperCase((char)c);
		}
		return c;
	}

	public static void main(String[] args) {
		Reader br = null;
		BufferedWriter bw = null;
		int c;
		//se agrega el sufijo mayus al nombre del archivo
		String extencion = args[0].substring(args[0].lastIndexOf('.'));
		String nuevoArchivo = args[0].substring(0, args[0].lastIndexOf('.')) + "mayus" + extencion;
		
		try {
			br = new test (new BufferedReader( new FileReader(args[0]) ));
			 try {
				bw = new BufferedWriter( new FileWriter(nuevoArchivo));
				while ( (c = br.read() ) != -1 ) {
					bw.write(c);
					bw.flush();
				}
			} catch (IOException e) {
				System.err.println("Error al crer archivo");
			} finally {
				try {
					bw.close();
				} catch (IOException e) {
					
				}
			}
		} catch (FileNotFoundException e) {

			System.err.println( "Error al abrir el archivo" );
			
		} finally {
			
			try {
				br.close();
			} catch (IOException e) {
				
			}
			
		}
	}

}
