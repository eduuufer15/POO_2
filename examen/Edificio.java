package examen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Edificio {
	private int aforo;
	private double pesoMaximo;
	private List<Persona> personaDentro;
	private Set<Persona> visitantesHistoricos;
	private Map<ColorPelo , Integer> personasPorColor;
	private Map<Continente , Integer> personasPorContinente;
	private Map<Continente , Double> pesoPorContinente;

	
	public Edificio(int aforo, double pesoMaximo) {
		this.aforo = aforo < 0 ? 0 : aforo;
		this.pesoMaximo = pesoMaximo < 0 ? 50 : pesoMaximo;
		this.personaDentro = new ArrayList<>();
		this.visitantesHistoricos = new HashSet<>();
		this.personasPorColor = new HashMap<>();
		this.personasPorContinente = new HashMap<>();
		this.pesoPorContinente = new HashMap<>();

		
	}
	
	public boolean entrar(Persona persona) {
		if(personaDentro.contains(persona)) {
			return false;
		}
		if(personaDentro.size() < aforo && obtenerPesoTotal() + persona.getPeso() <= pesoMaximo) {
			personaDentro.add(persona);
			visitantesHistoricos.add(persona);
			personasPorColor.put(persona.getColorPelo(), personasPorColor.getOrDefault(persona.getColorPelo(), 0) + 1);
			personasPorContinente.put(persona.getContinenteProcedencia(), personasPorContinente.getOrDefault(persona.getContinenteProcedencia(), 0) + 1);
			pesoPorContinente.put(persona.getContinenteProcedencia(), (pesoPorContinente.getOrDefault(persona.getContinenteProcedencia(), 0.0) + persona.getPeso()));
			return true;
		}
		
		return false;
	}
	
	public boolean salir(Persona persona) {
		if(!personaDentro.contains(persona)) {
			return false;
		} 
		personaDentro.remove(persona);
		personasPorColor.put(persona.getColorPelo(), personasPorColor.get(persona.getColorPelo()) -1);
		personasPorContinente.put(persona.getContinenteProcedencia(), personasPorContinente.get(persona.getContinenteProcedencia()) -1);
		pesoPorContinente.put(persona.getContinenteProcedencia(), (personasPorContinente.get(persona.getContinenteProcedencia()) - persona.getPeso() < 0 ? 0 : pesoMaximo));
		return true;
		}
	
	private double obtenerPesoTotal() {
		double pesoTotal = 0;
		for (Persona persona : personaDentro) {
			pesoTotal += persona.getPeso();
		}
		return pesoTotal;
	}
	public String obternerInforme() {
		
		String resultado = "\n--Informacion General---\n";
		
		resultado += "Aforo: " + personaDentro.size() + aforo + "\n";
		resultado += "Peso Total: " + obtenerPesoTotal() + pesoMaximo + "kg" + "\n";
		resultado += "Visitantes Historicos: " + visitantesHistoricos.size() + "\n";
		
		resultado += "\n---Distribucion por continente---\n";
		for (Map.Entry<Continente, Integer> entry : personasPorContinente.entrySet()) {
			resultado += entry.getKey().getNombre() + ": " + entry.getValue() + "personas" + "\n";
		
			for (Map.Entry<Continente, Double> entry1 : pesoPorContinente.entrySet()) {
			resultado += entry1.getKey().getNombre() + ": " + entry1.getValue() + "kg" + "\n";
		}
		}
		
		resultado += "\n---Ocupantes Actuales---\n";
		for (Persona persona : personaDentro) {
			resultado += persona + "\n";
		}
		return resultado;
	}
	
		
		
	
	
}
