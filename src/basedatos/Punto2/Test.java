package Punto2;

import java.sql.SQLException;
import java.util.Collection;


public class Test {
	public static void main(String[] args) {
		Collection<Cliente> lista;
		
		try {
			lista = Cliente.getClientes();
			System.out.println("---------Lista---------");
			for (Cliente cliente : lista) {
				System.out.println(cliente);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());;
		} finally {
			
		}
		

	}

}
