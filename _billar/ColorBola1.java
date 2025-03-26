package _billar;

import java.util.Random;

public enum ColorBola1 {
	Ro("Rojo"),
	Az("Azul"),
	Am("Amarrilo"),
	Na("Naranja"),
	Ve("Verde"),
	Ne("negro");
	
	
	private String nombre;
	
	private static Random random = new Random();

	private ColorBola1(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static ColorBola1 aleatorio() {
		return ColorBola1.values()[random.nextInt(ColorBola1.values().length)];
	}
	
}
