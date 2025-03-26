package _collections;

import java.util.Random;

public enum Marca {
	SE("Seat"), WV("Volkswagen"), BM("BMW"), ME("Mercedes"), VO("Volvo");

	private String nombreCompleto;
	private static Random random = new Random();

	private Marca(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public static Marca aleatorio() {
		return values()[random.nextInt(values().length)];
	}
}
