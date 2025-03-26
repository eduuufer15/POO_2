package _billar;

import java.util.Random;

public enum ColorBola {
	RO("Rojo"),
	VE("Verde"),
	Ro("Rosa"),
	NA("Naranja"),
	BL("Blanco"),
	AM("Amarillo"),
	AZ("Azul"),
	MA("Marron"),
	NE("Negro");
	
	private String nombre;
	
	private static Random random = new Random();
	
	private ColorBola(String nombre) {
		this.nombre = nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public static ColorBola aleatorio() {
		return ColorBola.values()[random.nextInt(ColorBola.values().length)];
	}

	
	
	
}
