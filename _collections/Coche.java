package _collections;

import java.util.Objects;

public class Coche {
    private Color color;
    private Marca marca;
    
    public Coche(Color color, Marca marca) {
        this.color = color;
        this.marca = marca;
    }
    
    
    public Coche() {
        this.color = Color.aleatorio();
        this.marca = Marca.aleatorio();
    }
    

	public Color getColor() {
        return color;
    }

    public Marca getMarca() {
        return marca;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Coche other = (Coche) obj;
        return color == other.color && marca == other.marca;
   }
    
    @Override
    public int hashCode() {
        return Objects.hash(color, marca);
    }
    
    // Aquí añadimos el hashCode al final
    @Override
    public String toString() {
        return "Coche: " + marca.name() 
                + " " + color.name() 
                + " (hashCode=" + this.hashCode() + ")";
    }
}
