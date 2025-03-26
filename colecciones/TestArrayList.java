package colecciones;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		// Crear un ArrayList de tipo String
		
		ArrayList<String> lista = new ArrayList<>();

		// add(elemento): Añade un elemento al final de la lista.
		
		lista.add("Edu");
		lista.add("Manuel");
		lista.add("Alejandro");
		System.out.println("Lista después de add(): " + lista);

		// add(indice, elemento): Inserta un elemento en una posición específica.
		
		lista.add(1, "Cristiano");
		System.out.println("Lista después de add(indice, elemento): " + lista);

		// clear(): Elimina todos los elementos de la lista.
		
		ArrayList<String> copiaLista = new ArrayList<>(lista);
		copiaLista.clear();
		System.out.println("Lista después de clear(): " + copiaLista);

		// contains(elemento): Verifica si la lista contiene un elemento específico.
		
		System.out.println("¿La lista contiene el nombre de 'Cristiano'? " + lista.contains("Cristiano"));

		// get(indice): Obtiene el elemento en una posición dada.
		
		System.out.println("Elemento en la posición 2: " + lista.get(2));

		// indexOf(elemento): Devuelve la posición de la primera ocurrencia del
		// elemento.
		
		System.out.println("Índice de 'Cristiano': " + lista.indexOf("Cristiano"));

		// isEmpty(): Devuelve true si la lista está vacía.
		
		System.out.println("¿La lista de nombres está vacía? " + lista.isEmpty());

		// remove(indice): Elimina el elemento en una posición específica.
		
		lista.remove(1);
		System.out.println("Lista después de remove(indice): " + lista);

		// remove(elemento): Elimina la primera ocurrencia del elemento.
		
		lista.remove("Cristiano");
		System.out.println("Lista después de remove(elemento): " + lista);

		// set(indice, elemento): Reemplaza el elemento en una posición específica.
		
		lista.set(1, "Neymar");
		System.out.println("Lista después de set(indice, elemento): " + lista);

		// size(): Devuelve el tamaño de la lista.
		
		System.out.println("Tamaño de la lista: " + lista.size());

		// toArray(): Convierte la lista en un array.
		
		Object[] array = lista.toArray();
		System.out.print("Array convertido desde la lista: ");
		for (Object obj : array) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}
