package misColecciones.Ejercicio2;
import java.util.Comparator;


public class AutomovilPorPrecio implements Comparator<Automovil> {
	
	public int compare(Automovil o1, Automovil o2) {
		return o1.getPrecio().compareTo(o2.getPrecio());
	}
}
