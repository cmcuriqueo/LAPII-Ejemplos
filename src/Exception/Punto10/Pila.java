package Punto10;

import java.util.LinkedList;

/*
 * Escriba una clase Pila que tenga los métodos boolean isEmpty(), 
 * Object pop() y void push(Object). Escriba un tipo de excepción 
 * PilaVacíaException y declare que sea lanzada en los métodos que corresponda.
 */
public class Pila<E>{
	private LinkedList<E> pila;
	
	public Pila() {
		this.pila = new LinkedList<E>();
	}
	
	public boolean isEmpty() {
		return pila.isEmpty();
	}
	
	public E pop() throws PilaVacíaException{
		if(pila.isEmpty())
			throw new PilaVacíaException("La pila esta vacia");
		else
			return pila.removeLast();
	}
	
	public void push(E e){
		pila.add(e);
	}
}
