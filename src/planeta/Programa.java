package planeta;

public class Programa {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 30);
        persona1.mostrar();
        
        Planeta planeta1 = new Planeta("Tierra", 12742);
        planeta1.mostrar();
        
        Publicacion publicacion1 = new Publicacion("La Tierra", 2023);
        publicacion1.mostrar();
    }
}