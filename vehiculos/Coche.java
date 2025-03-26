package vehiculos;

public class Coche extends Vehiculo{
	
	private boolean puertasAbiertas;
	private boolean motorArrancado;
	private String matricula;
	
	public Coche(int velocidadMaxima, int numRuedas, double peso, String matricula) {
		super(velocidadMaxima, numRuedas, peso);
		this.puertasAbiertas = false;
		this.motorArrancado = false;
		this.matricula = matricula;
	}
	
	public void abrirPuerta() {
		puertasAbiertas = true;
		System.out.println("Puertas Abiertas");
	}
	public void cerrarPuerta() {
		puertasAbiertas = false;
		System.out.println("Puertas Cerrada");
	}


	@Override
	public String toString() {
		return "Coche [" + super.toString() + "[puertasAbiertas=" + puertasAbiertas + ", motorArrancado=" + motorArrancado +  matricula != null ? ", matricula=" + matricula: "]";
	}	
	
}
