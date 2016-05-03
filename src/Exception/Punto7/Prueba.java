package Punto_7;

public class Prueba {
	public static void main(String[] args) {
		Persona a = new Persona("Juan", "Lopez", 40123090);
		try {
			System.out.println("La persona Es:" + a.toString());
		}catch(RuntimeException e) {
			RuntimeException ee = new RuntimeException("ERROR");
		}
	}
}
