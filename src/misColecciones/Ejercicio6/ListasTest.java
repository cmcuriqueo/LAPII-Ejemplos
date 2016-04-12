package misColecciones.Ejercicio6;

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

/*
 * Escriba un programa que imprima en orden ascendente las cadenas provistas como argumentos 
 * desde la línea de comandos. 
 * Escriba una variante que las muestre en orden descendente.
 * 
 */

public class ListasTest {

	public static void main(String args[]) {
		List<String> cadenas = new LinkedList<>();
		for (String string : args) {
			cadenas.add(string);
		}
		Collections.sort(cadenas, new CadenaComparator());
		for (String string : cadenas) {
			System.out.println(string);
		}
	}

}
