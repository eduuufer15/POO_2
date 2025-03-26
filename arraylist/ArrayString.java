package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class ArrayString {

	    public static void main(String[] args) {
	    	
		        ArrayList<String> palabras = new ArrayList<>();
		        Random r = new Random();
		        
		        String letras = "abcdefghijklmnopqrstuvwxyz";

		        for (int i = 0; i < 1000; i++) {
		            String palabra = "";
		            for (int j = 0; j < 4; j++) {
		                palabra += letras.charAt(r.nextInt(letras.length()));
		            }
		            palabras.add(palabra);
		        }
		        
		        ArrayList<String> filtradas = new ArrayList<>();

		        for (String palabra : palabras) {
		            char ultimaLetra = palabra.charAt(palabra.length() - 1);
		            if (ultimaLetra == 'a' || ultimaLetra == 'c') {
		                filtradas.add(palabra);
		            }
		        }

		        System.out.println("Palabras que terminan en 'a' o 'c': " + filtradas);
		        
		        System.out.println("Cantidad de palabras filtradas: " + filtradas.size());
		    }
		}

