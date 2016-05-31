package punto1;
/*
 * Escriba   un   programa   en   java   que   reciba   la   ruta   de   
 * un   directorio   y   cree   cuatro   carpetas  carpeta1,   carpeta2,
 * carpeta3   y   carpeta4,   y   que   cada   cual   tenga   dentro   diez   archivos
 * archivoXX.txt cuyo contenido sea una línea con el número de orden asignado al archivo. 
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;

public class Test {
	
	public static void main(String[] args) {
		String nombreCarpeta;
		String nombreArchivo;
		
		for (int i = 1; i < 5; i++) {
			nombreCarpeta = "carpeta"+i;
			File nuevoArchivo = new File(args[0]+nombreCarpeta);
			nuevoArchivo.mkdir();
			for (int j = 1; j < 11; j++) {
				
				BufferedWriter bw = null;
				nombreArchivo = "archivo"+j+".txt";
				
				try {
					
					bw = new BufferedWriter(
							new FileWriter( nuevoArchivo.getAbsolutePath()
									+ File.separatorChar+ nombreArchivo));
					bw.write( String.format( "%d", j ) );
					
				} catch ( IOException e ) {
					
					e.printStackTrace();
					
				} finally {
					
					try {
						bw.close();
					} catch ( IOException e ) {
						e.printStackTrace();
					}
				}
			}
		}
		System.out.println("termino");
	}
	
}
