package _collections;

import java.util.Random;

public enum Color {
    RO("Rojo"),
    NA("Naranja"),
    AM("Amarillo"),
    VE("Verde"),
    AZ("Azul"),
    IN("Índigo"),
    VI("Violeta");
	
    private String nombreColor;
    
    // Generador de números aleatorios para el método aleatorio
    private static Random random = new Random();
    

    private Color(String nombreColor) {
        this.nombreColor = nombreColor;
    }

    public String getNombreColor() {
        return nombreColor;
    }
    
 
     // Método estático que devuelve un color aleatorio
     
    public static Color aleatorio() {
        
    	// Devuelve un color al azar usando la longitud del enum
       
    	return Color.values()[random.nextInt(Color.values().length)];
    }
}
