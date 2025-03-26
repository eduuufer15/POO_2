package _billar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class MesaBillar {
	private String nombreMesa;
	private int capacidad;
	private List<Bola> bolaEnMesa;
	private Map<ColorBola, Integer> bolaPorColor;
	private Map<TipoBola, Integer> bolaPorTipo;
	private Map<Bola, Integer> bolasIguales;
	private Set<Bola> bolaEnConjunto;
	private Random random;
	
	public MesaBillar(String nombreMesa, int capacidad) {
		this.nombreMesa = nombreMesa;
		this.capacidad = capacidad;
		this.bolaEnMesa = new ArrayList<>();
		this.bolaPorColor = new HashMap<>();
		this.bolaPorTipo = new HashMap<>();
		this.bolasIguales = new HashMap<>();
		this.bolaEnConjunto = new HashSet<>();
		this.random = random;
	}
	
	public boolean colocarBola(Bola bola) {
		if(bolaEnMesa.size() < capacidad) {
			bolaEnMesa.add(bola);
			bolaPorColor.put(bola.getColor(), bolaPorColor.getOrDefault(bola.getColor(), 0) + 1);
			bolaPorTipo.put(bola.getTipo(), bolaPorTipo.getOrDefault(bola.getTipo(), 0) + 1);
			bolasIguales.put(bola, bolasIguales.getOrDefault(bola, 0) +1);
			bolaEnConjunto.add(bola);
			return true;
		}
		return false;
	}
	
	public boolean sacarBola(Bola bola) {
		if(bolaEnMesa.contains(bola)){
			bolaEnMesa.remove(bola);
			bolaPorColor.put(bola.getColor(), bolaPorColor.getOrDefault(bola.getColor(), 0) - 1);
			bolaPorTipo.put(bola.getTipo(), bolaPorTipo.getOrDefault(bola.getTipo(), 0) - 1);
			bolasIguales.put(bola, bolasIguales.getOrDefault(bola, 1) -1);
			if(bolasIguales.get(bola) <= 0) {
				bolasIguales.remove(bola);
			}
			return true;
		}
		return false;
	}
	public Bola sacarBolaAleatoria() {
		if(bolaEnMesa.isEmpty()) {
			return null;
		}
		int index = random.nextInt(bolaEnMesa.size());
		Bola bolaRemovida = bolaEnMesa.remove(index);
		bolaPorColor.put(bolaRemovida.getColor(), bolaPorColor.getOrDefault(bolaRemovida.getColor(), 0) - 1);
		bolaPorTipo.put(bolaRemovida.getTipo(), bolaPorTipo.getOrDefault(bolaRemovida.getTipo(), 0) - 1);
		bolasIguales.put(bolaRemovida, bolasIguales.getOrDefault(bolaRemovida, 1) -1);
		if(bolasIguales.get(bolaRemovida) <= 0) {
			bolasIguales.remove(bolaRemovida);
		}
		bolaEnConjunto.add(bolaRemovida);
		return  bolaRemovida;
		
	}
	
	public void vaciarBolas() {
		bolaEnConjunto.clear();
		bolaEnMesa.clear();
		bolaPorColor.clear();
		bolaPorTipo.clear();
		bolasIguales.clear();
	}
	
}
