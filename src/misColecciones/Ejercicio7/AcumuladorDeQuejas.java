package misColecciones.Ejercicio7;

import java.util.HashMap;
import java.util.LinkedList;



/*
 * Escriba una clase AcumuladorDeQuejas que implemente un m�todo 
 * registrarQueja (Empresa empresa, String queja). 
 * Escriba un m�todo que, dada una empresa, imprima todas las quejas 
 * realizadas sobre la misma.
 */

public class AcumuladorDeQuejas {
	private HashMap<Empresa, LinkedList<String>> relacion;


	
	public AcumuladorDeQuejas() {
		this.relacion = new HashMap<Empresa, LinkedList<String>>();

	}
	
	public void registrarQueja ( Empresa empresa, String queja ){

		if(this.relacion.get(empresa) != null) {
			LinkedList<String> aux;
			aux = this.relacion.get(empresa);
			aux.add(queja);
			this.relacion.put(empresa, aux);
		} else {
			LinkedList<String> nuevo = new LinkedList<String>();
			nuevo.add(queja);
			this.relacion.put(empresa, nuevo);
		}
	}
	
	
	public void imprimirQueja() {
		for ( Empresa empresa : this.relacion.keySet() ) {
			LinkedList< String > quejas = relacion.get(empresa);
			System.out.println(empresa);
			for (String queja : quejas) {
				System.out.println(" - " + queja);
			}
			System.out.println("-----------------------------------------");
		}
	}
	
}
