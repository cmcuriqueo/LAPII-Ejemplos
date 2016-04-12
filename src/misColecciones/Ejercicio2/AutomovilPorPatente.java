package misColecciones.Ejercicio2;
import java.util.Comparator;

public class AutomovilPorPatente implements Comparator<Automovil> {
	
	public int compare(Automovil o1, Automovil o2) {
		return o1.getPatente().compareTo(o2.getPatente());
	}
}
