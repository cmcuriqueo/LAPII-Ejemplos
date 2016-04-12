package misColecciones.Ejercicio2;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;


public class Automovil implements Comparator<Automovil>{
	private String Modelo;
	private Integer AnioFabricacion;
	private Float Precio;
	private String Patente;
	
	public <T> Automovil (String modelo,Integer anio,Float valor,String patente){
		this.Modelo=modelo;
		this.AnioFabricacion=anio;
		this.Precio=valor;
		this.Patente=patente;
		}

	public static Collection <Automovil> getAutomoviles () {
		Collection <Automovil> automoviles = new LinkedList<>();
		automoviles.add(new Automovil("Ford Fiesta",2015,(float)40000,"ABC 123"));
		automoviles.add(new Automovil("VW Gol",1995,(float)20000,"DVD 808"));
		automoviles.add(new Automovil("Fiat Uno",2004,(float)30000,"FAT 656"));
		automoviles.add(new Automovil("Chevrolet Vectra",2016,(float)70000,"DEV 666"));
		automoviles.add(new Automovil("Fiat 128",1989,(float)18000,"FAT 231"));
		automoviles.add(new Automovil("VW Sudan",2008,(float)60000,"JOD 456"));
		return automoviles;
	}
	
	public int compare (Automovil o1,Automovil o2){
		return o1.getPatente().compareTo(o2.getPatente());
	}
	public String getModelo() {
		return Modelo;
	}

	public Integer getAnioFabricacion() {
		return AnioFabricacion;
	}

	public Float getPrecio() {
		return Precio;
	}

	public String getPatente() {
		return Patente;
	}
	@Override
	public String toString() {
		return "" + Modelo + ", "
				+ AnioFabricacion + "," + Precio + ","
				+ Patente + "";
	}
}
