package colecciones;

import java.util.ArrayList;

public class Frase2 {
	
	private ArrayList<String> palabras;
	
	public Frase2(String frase) {
		palabras = new ArrayList<String>();
		String[] ArrayPalabra = frase.split(" ");
		for(String palabra : ArrayPalabra) {
			palabras.add(palabra);
		}
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
		palabras.add(palabra);
	}
	
	public static void main(String[] args) {
		Frase2 f = new Frase2("HOLA EDUARDO");
		System.out.println(f);
		f.addPalabra("OLE!");
		System.out.println(f);
	}
	
	
}
