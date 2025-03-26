package colecciones;

import java.util.Arrays;

public class Frase {
	
	private String[] palabras;
	
	public Frase(String frase) {
	    this.palabras = frase.split(" ");
	}

	@Override
	public String toString() {
	     String resultado = "";
	     for (String palabra : palabras) {
			resultado = resultado + palabra + " ";
		}
	     return resultado;
	}
	
	public void addPalabra(String palabra) {
		String[] nuevasPalabras = new String[palabras.length + 1]; 
		for (int i = 0; i < palabras.length; i++) {
		    nuevasPalabras[i] = palabras[i]; 
		}
		nuevasPalabras[palabras.length] = palabra; 
		palabras = nuevasPalabras; 
	}
	
	public static void main(String[] args) {
		Frase f = new Frase("HOLA EDUARDO");
		System.out.println(f);
		f.addPalabra("OLE!");
		System.out.println(f);
	}
	
	
}
