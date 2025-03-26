package planeta;

public class Planeta {
    private String nombre;
    private double tamaño;
    
    public Planeta(String nombre, double tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }
    
    public void mostrar() {
        System.out.printf("Planeta: %s, Tamaño: %.2f%n", nombre, tamaño);
    }
}