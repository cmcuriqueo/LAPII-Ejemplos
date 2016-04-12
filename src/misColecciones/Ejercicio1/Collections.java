package misColecciones.Ejercicio1;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class Collections {

	public static <T> void swap( List <T> lista, int pIndice, int sIndice ){
		if( sIndice < lista.size() && pIndice >= 0) {
			T aux = null;
			aux = lista.get(pIndice);
			lista.set(pIndice,lista.get(sIndice));
			lista.set(sIndice, aux);
		}
	}
	
	public static <T> void shuffler( List <T> lista ){
		Random Ran = new Random();
		for ( int i = 0; i <= lista.size()/2; i++ ) {
			Collections.swap( lista, Ran.nextInt( lista.size() ), Ran.nextInt( lista.size() ) );
		}
	}
	public static <T> void reverse( List <T> lista ){
		List <T> lAux = new LinkedList<>();
		lAux.addAll( lista );
		lista.clear();
		for (int i = 0; i < lAux.size(); i++) {
			lista.add( lAux.get(i) );
		}
	}
}
