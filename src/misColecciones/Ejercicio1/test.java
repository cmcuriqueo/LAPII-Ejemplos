package misColecciones.Ejercicio1;

import java.util.LinkedList;
import java.util.List;


public class test {

	public static void main(String[] args) {
		List<String> lista = new LinkedList<>();
		lista.add("a");
		lista.add("b");
		lista.add("c");
		lista.add("d");
		lista.add("e");
		
		Collections.shuffler(lista);
		System.out.println("Shuffler");
		
		for (String string : lista) {
			System.out.println(string);
		}
	}

}
