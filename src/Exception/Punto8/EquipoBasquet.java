package Punto8;

public class EquipoBasquet{ 	 
	
	//Metodo que agrega un jugador a un arreglo de jugadores 
	public static void agregarJugador(JugadorBasquet jugador,JugadorBasquet equipo[]) throws EquipoLlenoException,EdadInvalidaException, MedidaInvalidaException{
		int i = 0;
			
			if(jugador.getEdad()<=35){
				throw new EdadInvalidaException("La edad de "+jugador.getNombre()+" no le permite entrar al equipo");
			}
			if(jugador.getMedida()<=1.60){
				throw new MedidaInvalidaException("La estatura de "+jugador.getNombre()+" no le permite entrar al equipo");
				
			}
			
			try {
			
				while(equipo[i] != null){
					i++;
					
				}
			} catch (ArrayIndexOutOfBoundsException e) {
			
				throw new EquipoLlenoException(jugador.getNombre()+" no puede ingresar el equipo proque esta completo");
			}
			 equipo[i]=jugador;
		
	
	}
	 

	public static void mostrarEquipo(JugadorBasquet equipo[]){
		for (JugadorBasquet jugador : equipo) {
			if(jugador!=null)
			System.out.println(jugador.toString());
		}
		
	}
}




		
		
		
		
		
		
		

