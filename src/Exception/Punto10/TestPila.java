package Punto10;

public class TestPila {
	
	public static void main(String[] args) {
		Pila<String> pila = new Pila<>();
		try{
			pila.pop();
		} catch (PilaVacíaException e) {
			System.err.println(e.getMessage());
		}
		
		pila.push("Mesa");
		pila.push("Termo");
		pila.push("Tapa");
		System.out.println("");
		System.out.println(pila.pop());
		System.out.println(pila.pop());
		System.out.println(pila.pop());
	}
	
}
