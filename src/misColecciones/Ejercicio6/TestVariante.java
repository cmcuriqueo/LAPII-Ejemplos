package misColecciones.Ejercicio6;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestVariante {
	public static void main(String[] args) {
		List<String> cadenas = new LinkedList<>();
		for (String string : args) {
			cadenas.add(string);
		}
		
		Collections.sort(cadenas, new CadenaComparator());
		Collections.reverse(cadenas);
		
		for (String string : cadenas) {
			System.out.println(string);
		}
	}
}
