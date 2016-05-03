package Punto8;

public class JugadorBasquet {

		//Atributos de la clase
		private String nombre;
		private int numeroCamiseta;
		private float medida;
		private int edad;
		
		//Constructor
		public JugadorBasquet(String nombre,int numeroCamiseta,
		float medida,int edad){
			this.nombre=nombre;
			this.numeroCamiseta=numeroCamiseta;
			this.medida=medida;
			this.edad=edad;
		}
		
		//Metodos getters
		public String getNombre() {
			return nombre;
		}

		public int getNumeroCamiseta() {
			return numeroCamiseta;
		}

		public float getMedida() {
			return medida;
		}

		public int getEdad() {
			return edad;
		}
		//Fin metodos getters
		
		
		//Metodo toString
		@Override
		public String toString() {
			
			return "|NOMBRE: "+this.nombre+"|CAMISETA: "+this.numeroCamiseta+" |MEDIDA: "+
					this.medida+" |EDAD: "+this.edad+" |";
		}
		
		
		//Fin metodo toString
		
		
}
