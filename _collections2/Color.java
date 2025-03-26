package _collections2;

import java.util.Random;

public enum Color {
    RO("Rojo"), 
    NA("Naranja"), 
    AM("Amarillo"), 
    VE("Verde"), 
    AZ("Azul"), 
    IN("Índigo"), 
    VI("Violeta");
    
    private String nombreCompleto;
    private static Random random = new Random();
    
    private Color(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    
    public static Color aleatorio() {
        return Color.values()[random.nextInt(Color.values().length)];
    }
}