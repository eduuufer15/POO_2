package _billar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class MesaBillar1 {
    private String nombreMesaBillar;
    private int capacidad;
    private List<Bola1> bolaEnMesa;
    private Map<ColorBola1, Integer> bolaPorColor;
    private Map<TipoBola1, Integer> bolaPorTipo;
    private Map<Bola1, Integer> bolasIguales;
    private Set<Bola1> bolaEnConjunto;
    private Random random;

    public MesaBillar1(String nombreMesaBillar, int cantidad) {
        this.nombreMesaBillar = nombreMesaBillar;
        this.capacidad = cantidad;
        this.bolaEnMesa = new ArrayList<>();
        this.bolaPorColor = new HashMap<>();
        this.bolaPorTipo = new HashMap<>();
        this.bolasIguales = new HashMap<>();
        this.bolaEnConjunto = new HashSet<>();
        this.random = new Random();
    }

    public boolean colocarBola(Bola1 bola) {
        if (bolaEnMesa.size() < capacidad) {
            bolaEnMesa.add(bola);
            bolaPorColor.put(bola.getColor(), bolaPorColor.getOrDefault(bola.getColor(), 0) + 1);
            bolaPorTipo.put(bola.getTipo(), bolaPorTipo.getOrDefault(bola.getTipo(), 0) + 1);
            bolasIguales.put(bola, bolasIguales.getOrDefault(bola, 0) + 1);
            bolaEnConjunto.add(bola);
            return true;
        }
        return false;
    }

    public boolean sacarBola(Bola1 bola) {
        if (bolaEnMesa.contains(bola)) {
            bolaEnMesa.remove(bola);
            bolaPorColor.put(bola.getColor(), bolaPorColor.getOrDefault(bola.getColor(), 0) - 1);
            bolaPorTipo.put(bola.getTipo(), bolaPorTipo.getOrDefault(bola.getTipo(), 0) - 1);
            bolasIguales.put(bola, bolasIguales.getOrDefault(bola, 1) - 1);
            if (bolasIguales.get(bola) <= 0) {
                bolasIguales.remove(bola);
            }
            bolaEnConjunto.remove(bola);
            return true;
        }
        return false;
    }

    public Bola1 sacarBolaAleatoria() {
        if (bolaEnMesa.isEmpty()) {
            return null;
        }
        int index = random.nextInt(bolaEnMesa.size());
        Bola1 bolaRemovida = bolaEnMesa.remove(index);
        bolaPorColor.put(bolaRemovida.getColor(), bolaPorColor.getOrDefault(bolaRemovida.getColor(), 0) - 1);
        bolaPorTipo.put(bolaRemovida.getTipo(), bolaPorTipo.getOrDefault(bolaRemovida.getTipo(), 0) - 1);
        bolasIguales.put(bolaRemovida, bolasIguales.getOrDefault(bolaRemovida, 1) - 1);
        if (bolasIguales.get(bolaRemovida) <= 0) {
            bolasIguales.remove(bolaRemovida);
        }
        bolaEnConjunto.remove(bolaRemovida);
        return bolaRemovida;
    }

    public void mostrarBolasIguales() {
        System.out.println("Bolas iguales en la mesa:");
        for (Map.Entry<Bola1, Integer> entry : bolasIguales.entrySet()) {
            System.out.println(entry.getKey() + " se repite " + entry.getValue() + " veces.");
        }
    }

   
    public void mostrarInforme() {
        System.out.println("Mesa de billar: " + nombreMesaBillar);
        System.out.println("Bolas en mesa: " + bolaEnMesa.size() + "/" + capacidad);
        for (Bola1 bola : bolaEnMesa) {
            System.out.println(bola);
        }
        mostrarBolasIguales();
        System.out.println();
    }
 public void vaciarMesa() {
        bolaEnMesa.clear();
        bolaEnConjunto.clear();
        bolaPorColor.clear();
        bolaPorTipo.clear();
        bolasIguales.clear();
    }
}