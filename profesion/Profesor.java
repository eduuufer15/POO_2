package profesion;

public class Profesor extends Profesion{

	    public Profesor(String nombre, short anioNacimiento, String especialidad) {
	        super(nombre, anioNacimiento, especialidad);
	    }

	    @Override
	    public void trabajar() {
	        System.out.println("El profesor " + getNombre() + " está enseñando " + getEspecialidad());
	    }

	    public void calificarExamenes(int cantidadEstudiantes) {
	        System.out.println("El profesor " + getNombre() + " ha calificado " + cantidadEstudiantes + " exámenes.");
	    }

	    @Override
	    public String toString() {
	        return super.toString();
	    }
	}
	

