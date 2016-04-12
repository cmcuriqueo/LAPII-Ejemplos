package misColecciones.Ejercicio2;
import java.util.Comparator;

public class AutomovilPorAntiguedad implements Comparator<Automovil> {
	
	public int compare(Automovil o1, Automovil o2) {
		return o1.getAnioFabricacion().compareTo(o2.getAnioFabricacion());
	}

	

}
