package _billar;

import java.util.Random;

public enum TipoBola1 {
	Li("Lisas"),
	Ra("Rayadas"),
	Ne("Negra");
	
	private String NombreTipo;
	
	private static Random random = new Random();
	
	private TipoBola1(String nombreTipo) {
		NombreTipo = nombreTipo;
	}

	public String getNombreTipo() {
		return NombreTipo;
	}


	public static TipoBola1 aleatorio() {
		return TipoBola1.values()[random.nextInt(TipoBola1.values().length)];
	}
}
