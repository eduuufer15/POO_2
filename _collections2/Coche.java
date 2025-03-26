package _collections2;

import java.util.Objects;

public class Coche {
    private Color color;
    private Marca marca;
    
    // Constructor con parámetros
    public Coche(Marca marca, Color color) {
        this.marca = marca;
        this.color = color;
    }
    
    // Constructor sin parámetros (aleatorio)
    public Coche() {
        this.marca = Marca.aleatorio();
        this.color = Color.aleatorio();
    }
    
    // Getters
    public Color getColor() {
        return color;
    }
    
    public Marca getMarca() {
        return marca;
    }
    
    @Override
    public String toString() {
        return "Coche: " + marca + " " + color;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(color, marca);
    }
    
    @Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Coche)) return false;
		if (this.color == ((Coche)obj).color && this.marca == ((Coche)obj).marca) {
			return true;
		} else {
			return false;
		}
	} 
}