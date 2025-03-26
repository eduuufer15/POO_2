package profesion;

public class Doctor extends Profesion {

	    public Doctor(String nombre, short anioNacimiento, String especialidad) {
	        super(nombre, anioNacimiento, especialidad);
	    }
	    
	    public void trabajar() {
	        System.out.println("El doctor " + getNombre() + " está atendiendo pacientes en el área de " + getEspecialidad());
	    }

	    
	    public void recetarMedicamento(String medicamento) {
	        System.out.println("El doctor " + getNombre() + " ha recetado el medicamento: " + medicamento);
	    }

	    @Override
	    public String toString() {
	        return super.toString();
	    }
	}
	

	


