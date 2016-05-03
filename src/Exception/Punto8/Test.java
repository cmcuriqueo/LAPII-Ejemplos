package Punto8;

public class Test extends EquipoBasquet {
	public static void main(String[] args) {
	
		//Creo 5 jugadores de basquet
		 JugadorBasquet jugador1 = new JugadorBasquet("Pablo", 5,(float) 1.68, 56);//puede entrar
		 JugadorBasquet jugador2 = new JugadorBasquet("Antonio", 17,(float) 1.72, 51);//puede entrar
		 JugadorBasquet jugador3 = new JugadorBasquet("Hernan", 89,(float) 1.49, 31);//NO puede entrar por la edad
		 JugadorBasquet jugador4 = new JugadorBasquet("Mauricio", 11,(float) 1.90, 54);//puede entrar
		 JugadorBasquet jugador5 = new JugadorBasquet("Jose", 3,(float) 1.74, 62);//puede entrar
		 JugadorBasquet jugador6 = new JugadorBasquet("Francisco", 12,(float) 1.72, 80);//puede entrar pero no va a poder por equipo lleno
		 JugadorBasquet jugador7 = new JugadorBasquet("Nahuel", 2,(float) 1.57, 62);//NO puede entrar por la estatura
		 
		 //Creo un arreglo de jugadores de basquet que va a ser el equipo
		 JugadorBasquet equipo[]=new JugadorBasquet[4];
		 
	 
		//Agrego jugador1
		 try {
			 agregarJugador(jugador1,equipo);
				
		 }catch (ValorInvalidoException e) {
			 System.out.println(e.getMessage());
		 }
		 
		 //agrego a jugador2
		 try {
			 agregarJugador(jugador2,equipo);
				
		 }catch (ValorInvalidoException e) {
			 System.out.println(e.getMessage());
		 }
		 
		//agrego a jugador3
		 try {
			 agregarJugador(jugador3,equipo);
				
		 }catch (ValorInvalidoException e) {
			 System.out.println(e.getMessage());
		 }
		
		//agrego a jugador4
		 try {
			 agregarJugador(jugador4,equipo);
				
		 }catch (ValorInvalidoException e) {
			 System.out.println(e.getMessage());
		 }
		 
		//agrego a jugador5
		 try {
			 agregarJugador(jugador5,equipo);
				
		 }catch (ValorInvalidoException e) {
			 System.out.println(e.getMessage());
		 }
		 
		//agrego a jugador6
		 try {
			 agregarJugador(jugador6,equipo);
				
		 }catch (ValorInvalidoException e) {
			 System.out.println(e.getMessage());
		 }
		 
		//agrego a jugador7
		 try {
			 agregarJugador(jugador7,equipo);
				
		 }catch (ValorInvalidoException e) {
			 System.out.println(e.getMessage());
		 }
	//muestro el equipo 
	
		System.out.println("EQUIPO");
		mostrarEquipo(equipo);
	
	}
}
