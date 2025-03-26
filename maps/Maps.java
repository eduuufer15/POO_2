package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Maps {
	public static void main(String[] args) {
		String frase = "La casa de la pradera es de todos";
		String[] palabras = frase.split(" ");
		ArrayList<String> palabrasAL = new ArrayList<>();
		HashSet<String> palabrasSet = new HashSet<>();
		TreeSet<String> palabrasTreeSet = new TreeSet<>();
		for (String palabra : palabras) {
			palabrasAL.add(palabra);
			palabrasSet.add(palabra.toLowerCase());
			palabrasTreeSet.add(palabra.toLowerCase());
		}
		System.out.println(palabrasAL);
		System.out.println(palabrasSet);
		System.out.println(palabrasTreeSet);
		
		for (String palabra : palabrasAL) {
			System.out.print(palabra + " ");
		}
		System.out.println();
		
		for (String palabra : palabrasSet) {
			System.out.print(palabra + " ");
		}
		System.out.println();
		
		for (String palabra : palabrasTreeSet) {
			System.out.print(palabra + " ");
		}
		System.out.println();
		
		HashMap<String, Integer> contadorPalabras = new HashMap<>();
		TreeMap<String, Integer> contadorPalabrasOrdenadas = new TreeMap<>();
		

		for (String palabra : palabrasAL) {
			palabra = palabra.toLowerCase();
			if(contadorPalabras.get(palabra)==null) {
				contadorPalabras.put(palabra, 1);
			} else {
				contadorPalabras.put(palabra, contadorPalabras.get(palabra) + 1);
			}
			if(contadorPalabrasOrdenadas.get(palabra)==null) {
				contadorPalabrasOrdenadas.put(palabra, 1);
			} else {
				contadorPalabrasOrdenadas.put(palabra, contadorPalabrasOrdenadas.get(palabra) + 1);
			}
		}		
		System.out.println(contadorPalabras);
		System.out.println(contadorPalabrasOrdenadas);	
	}
}
