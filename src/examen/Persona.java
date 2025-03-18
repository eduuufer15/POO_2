package examen;

import java.util.Random;

public class Persona {
	
	private String nombre;
	private double peso;
	private ColorPelo colorPelo;
	private Continente continenteProcedencia;
	
	private static final String[] nombresPersonas = {"Pedro, María, Edu, Manuel, Alejandro, Adrián, Carolina, Javier, Álvaro, Carmen"};
	private static final Random random = new Random();
	
	public Persona(String nombre, double peso, ColorPelo colorPelo, Continente continenteProcedencia) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.colorPelo = colorPelo;
		this.continenteProcedencia = continenteProcedencia;
	}

	public Persona() {
		super();
		this.nombre = nombresPersonas[random.nextInt(nombresPersonas.length)];
		this.peso = 60.0 + (random.nextDouble() * 40.0);
		this.colorPelo = ColorPelo.values()[random.nextInt(ColorPelo.values().length)];
		this.continenteProcedencia = Continente.values()[random.nextInt(Continente.values().length)];
	}

	public String getNombre() {
		return nombre;
	}

	public double getPeso() {
		return peso;
	}

	public ColorPelo getColorPelo() {
		return colorPelo;
	}

	public Continente getContinenteProcedencia() {
		return continenteProcedencia;
	}

	@Override
	public String toString() {
		return "Persona [nombre = " + nombre + ", peso = " + peso + ", colorPelo = " + colorPelo + ", continenteProcedencia = "
				+ continenteProcedencia + "]";
	}


	
	
	
	
	
	
}
