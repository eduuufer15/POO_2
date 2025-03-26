package arraylist;

import java.util.ArrayList;

public class NumerosMultiplos {
	public static void main(String[] args) {
		
		int n = 10;
		int p = 5;
		int m = 3;
		
		ArrayList<Integer> multiplos = new ArrayList<>();
		
		for(int i = p; multiplos.size() < n; i++) {
			if (i % m == 0) {
                multiplos.add(i);
            }
		}
		
		System.out.println("Los primeros " + n + " múltiplos de " + m + " a partir de " + p + " son:");
		for (int multiplo : multiplos) {
			System.out.print(multiplo + " ");
		}
		
		
		
	}
	
	
}
