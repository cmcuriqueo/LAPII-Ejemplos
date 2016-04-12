package misColecciones.Ejercicio7;


public class TestMaps {
	public static void main(String[] args) {
		Empresa movistar = new Empresa( "Movistar" );
		Empresa juanAires = new Empresa( "Juan Aires Acondicionados" );
		Empresa camuzzi =  new Empresa( "Camuzzi" );
		Empresa cooperativa =  new Empresa( "Cooperativa" );
		
		AcumuladorDeQuejas quejas =  new AcumuladorDeQuejas();
		
		quejas.registrarQueja(movistar, "Mala conexion a la Internet" );
		quejas.registrarQueja(movistar, "Perdida de saldo" );
		quejas.registrarQueja(movistar, "Me parece que me pincharon el telefono" );
		quejas.registrarQueja(camuzzi, "Perdida de gas" );
		quejas.registrarQueja(cooperativa, "Aumento mucho el agua" );
		quejas.registrarQueja(cooperativa, "El vecino se colgo de la conexion de luz" );
		quejas.registrarQueja(cooperativa, "No me hacen la reconexion desde hace un mes" );
		quejas.registrarQueja( juanAires, "Hace una semana que te llamo para que me arregles el aire lpm!!!!..." );
		
		quejas.imprimirQueja();
	}
}
