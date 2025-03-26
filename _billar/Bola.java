package _billar;

import java.util.Objects;

public class Bola {
	private ColorBola color;
	private TipoBola tipo;

	public Bola(ColorBola color, TipoBola tipo) {

		this.color = color;
		this.tipo = tipo;
	}
	
	public Bola() {

		this.color = ColorBola.aleatorio();
		this.tipo = TipoBola.aleatorio();
	}
	
	

	public ColorBola getColor() {
		return color;
	}

	public void setColor(ColorBola color) {
		this.color = color;
	}

	public TipoBola getTipo() {
		return tipo;
	}

	public void setTipo(TipoBola tipo) {
		this.tipo = tipo;
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
		Bola other = (Bola) obj;
		return color == other.color && tipo == other.tipo;
	}
	
	
	
}
