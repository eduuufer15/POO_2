package _billar;

import java.util.Random;

public enum TipoBola {
	LI("Lisa"),
	RA("Rayada"),
	NE("Negra");
	
	private String tipo;

	private static Random random = new Random();
	
	private TipoBola(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public static TipoBola aleatorio() {
		return TipoBola.values()[random.nextInt(TipoBola.values().length)];
	}
	
}
