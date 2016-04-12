package misColecciones.Ejercicio3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


/*
 * 
 * Escriba en java un programa que mantenga un conjunto con los países del ALCA, 
 * un conjunto con los paises del MERCOSUR y un conjunto con los países del bloque 
 * BRICS. Muestre usando los métodos de la clase Set el listado de los países que 
 * pertenecen a los tres bloques y el listado de aquellos que pertenecen al MERCOSUR 
 * pero no al ALCA.
 *
 */
public class Conjunto {
	public static void main(String[] args) {
		Set <String> mercosur = new TreeSet<String>();
		mercosur.add("Brasil");
		mercosur.add("Bolivia");
		mercosur.add("Paraguay");
		mercosur.add("Uruguay");
		mercosur.add("Venezuela");
		mercosur.add("Argentina");
		
		Set <String> brics = new TreeSet<String>();
		brics.add("Brasil");
		brics.add("Rusia");
		brics.add("India");
		brics.add("China");
		brics.add("Sudafrica");
		
		Set <String> alca = new TreeSet<String>();
		alca.add("Antigua y Barbuda");
		//alca.add("Argentina");
		alca.add("Bahamas");
		alca.add("Barbados");
		alca.add("Belice");
		alca.add("Bolivia");
		alca.add("Brasil");
		alca.add("Canada");
		alca.add("Chile");
		alca.add("Colombia");
		alca.add("Costa Rica");
		alca.add("Dominica");
		alca.add("Ecuador");
		alca.add("El Salvador");
		alca.add("Estados Unidos");
		alca.add("Granada");
		alca.add("Guatemala");
		alca.add("Guyana");
		alca.add("Haiti");
		alca.add("Honduras");
		alca.add("Jamaica");
		alca.add("Mexico");
		alca.add("Nicaragua");
		alca.add("Panama");
		alca.add("Paraguay");
		alca.add("Peru");
		alca.add("Republica Dominicana");
		alca.add("San Cristobal y Nieves");
		alca.add("San Vicente y las Granadinas");
		alca.add("Santa Lucia");
		alca.add("Surinam");
		alca.add("Trinidad y Tobago");
		alca.add("Uruguay");
		alca.add("Venezuela");

		Set <String> union = new TreeSet<>();
		union.addAll(alca);
		union.addAll(mercosur);
		union.addAll(brics);

		System.out.println("Union");
		for (Iterator<String> it = union.iterator(); it.hasNext(); ) {
			String pais = (String) it.next();
			System.out.println(pais);
		}
		
		union.removeAll(alca);
		union.removeAll(brics);
		
		System.out.println();
		System.out.println("Diferencia");

		for (String pais : union) {
			System.out.println(pais);
		}
		
		//s1.retainAll( s2 ) --Convierte s1 en la interseccion de s1 y s2
		
	}	
}
