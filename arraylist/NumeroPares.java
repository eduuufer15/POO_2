package arraylist;

import java.util.ArrayList;

public class NumeroPares {
	public static void main(String[] args) {
	 
		int n = 10;
	
	ArrayList<Integer> NumerosPares = new ArrayList<>();
	
	for (int i = 0; i <= n; i++) {
		NumerosPares.add(i * 2);
	}
	
	
		System.out.println("Los primero numero " + n + " Pares son: ");
		for (int numero : NumerosPares) {
			System.out.println(numero + " ");
		}
		
	}
}
