package vehiculos;

public abstract class Vehiculo {
	private int velocidadMaxima;
	private int numRuedas;
	private double peso;
	//private String matricula;
	private int velocidad;
	
	public boolean acelerar() {		
		if(velocidad + 10 > velocidadMaxima) {
			velocidad = velocidadMaxima;
			return false;			
		} else {
		velocidad += 10;
		return true;		
		}
				
	}
	public boolean frenar() {
		if(velocidad - 10 < 0) {
			velocidad = 0;
			return false;			
		} else {
		velocidad -= 10;
		return true;		
		}		
		
	}
	
	public Vehiculo(int velocidadMaxima, int numRuedas, double peso) {
		this.velocidadMaxima = velocidadMaxima;
		this.numRuedas = numRuedas;
		this.peso = peso;
	
	}
	
	@Override
	public String toString() {
		return "velocidadMaxima=" + velocidadMaxima + ", numRuedas=" + numRuedas + ", peso=" + peso;
	}
	
	
	
}
