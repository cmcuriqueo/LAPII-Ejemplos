package misColecciones.Ejercicio6;

import java.util.Comparator;

public class CadenaComparator implements Comparator<String>{

	@Override
	public int compare(String arg0, String arg1) {
		if (arg0.equals(arg1))
			return 0;
		if (arg0.compareTo(arg1) != 0 ){
			return arg0.compareTo(arg1);
		} else {
			return arg0.compareTo(arg1);
		}
	}
}
