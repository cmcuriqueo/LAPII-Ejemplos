package misColecciones.Ejercicio2;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestAutomovil {
 public static void main(String[] args) {
	List <Automovil> Automoviles = new LinkedList(Automovil.getAutomoviles());
	for(Automovil listado : Automoviles){
		System.out.println(listado);
	}
	Collections.sort(Automoviles,new AutomovilPorAntiguedad());
	System.out.println("-----Por Antiguedad-----");
		for(Automovil listado : Automoviles){
			System.out.println(listado);
		}
		Collections.sort(Automoviles,new AutomovilPorPrecio());
		System.out.println("-----Por Precio-----");
			for(Automovil listado : Automoviles){
				System.out.println(listado);
			}
		Collections.sort(Automoviles,new AutomovilPorPatente());
		System.out.println("-----Por Patente-----");
			for(Automovil listado : Automoviles){
				System.out.println(listado);
			}
 }
}
