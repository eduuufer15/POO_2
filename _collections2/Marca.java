package _collections2;

import java.util.Random;

public enum Marca {
    SE("Seat"),
    VO("Volvo"),
    ME("Mercedes"),
    WV("Volkswagen"),
    BM("BMW");
    
    private String nombreCompleto;
    private static Random random = new Random();
    
    private Marca(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    
    public static Marca aleatorio() {
        return Marca.values()[random.nextInt(Marca.values().length)];
    }
}