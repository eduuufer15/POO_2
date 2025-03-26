package publicaciones;

public class Publicacion {
    private String titulo;
    private int anio;
    
    public Publicacion(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
    }
    
    public void mostrar() {
        System.out.printf("Publicación: %s, Año: %d%n", titulo, anio);
    }
}