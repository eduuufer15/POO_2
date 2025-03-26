package profesion;

public abstract class Profesion {
	    private String nombre;
	    private short anioNacimiento;
	    private String especialidad;

	    
	    public Profesion(String nombre, short anioNacimiento, String especialidad) {
	        this.nombre = nombre;
	        this.anioNacimiento = anioNacimiento;
	        this.especialidad = especialidad;
	    }

	    
	    public abstract void trabajar();

	    
	    public short calcularEdad() {
	        return (short) (2025 - anioNacimiento);
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getEspecialidad() {
	        return especialidad;
	    }

	    @Override
	    public String toString() {
	        return "Nombre: " + nombre + ", Especialidad: " + especialidad + ", Año de Nacimiento: " + anioNacimiento;
	    }

}

