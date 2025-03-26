package planeta;

public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrar() {
        System.out.printf("Persona: %s, Edad: %d%n", nombre, edad);
    }
}