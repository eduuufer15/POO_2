package _billar;

import java.util.Objects;

public class Bola1 {
	private ColorBola1 color;
	private TipoBola1 tipo;
	
	
	
	public Bola1(ColorBola1 color, TipoBola1 tipo) {
		this.color = color;
		this.tipo = tipo;
	}
	
	public Bola1() {

		this.color = ColorBola1.aleatorio();
		this.tipo = TipoBola1.aleatorio();
	}

	public ColorBola1 getColor() {
		return color;
	}

	public TipoBola1 getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "Bola [color=" + color + ", tipo=" + tipo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bola1 other = (Bola1) obj;
		return color == other.color && tipo == other.tipo;
	}

}
