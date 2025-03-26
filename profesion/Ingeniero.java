package profesion;

public class Ingeniero extends Profesion{
	    
	    public Ingeniero(String nombre, short anioNacimiento, String especialidad) {
	        super(nombre, anioNacimiento, especialidad);
	    }

	   
	    @Override
	    public void trabajar() {
	        System.out.println("El ingeniero " + getNombre() + " está diseñando un proyecto en el área de " + getEspecialidad());
	    }

	    
	    public void calcularCostoProyecto(double horas, double tarifaPorHora) {
	        double costo = horas * tarifaPorHora;
	        System.out.println("El ingeniero " + getNombre() + " ha calculado un costo de proyecto de: " + costo + "€");
	    }

	    @Override
	    public String toString() {
	        return super.toString();
	    }
	}
	

	    


