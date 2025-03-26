package vehiculos;

public class Moto extends Vehiculo{
	private boolean motorArrancado; 
	private String matricula;
	
	public void hacerCaballito() {
		System.out.println("Haciedo el caballito");
		
	}
	
	
	public Moto(int velocidadMaxima, int numRuedas, double peso, String matricula) {
		super(velocidadMaxima, numRuedas, peso);
		this.matricula = matricula;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Moto [" + super.toString() + "[motorArrancado=" + motorArrancado + matricula != null ? ", matricula=" + matricula: "]";
	}
	

}
