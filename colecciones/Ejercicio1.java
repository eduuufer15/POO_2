package colecciones;

import java.util.ArrayList;

import java.util.Iterator;

import java.util.Random;

public class Ejercicio1 {

	private static void muestraYsubraya(String texto) {

		System.out.println(texto);

		for (int i = 0; i < texto.length(); i++) {

			System.out.print("-");

		}

		System.out.println();

	}

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		muestraYsubraya("Mostrar lista numeros aleatorios");

		Random random = new Random();

		for (int i = 0; i < 20; i++) {

			al.add(random.nextInt(100) + 1);

		}

		System.out.println(al);

		Integer suma = 0;

		Integer maximo = al.get(0);

		Integer minimo = al.get(0);

		for (Integer num : al) {

			suma += num;

			maximo = num > maximo ? num : maximo;

			minimo = num < minimo ? num : minimo;

		}

		muestraYsubraya("Suma");

		System.out.println(suma);

		muestraYsubraya("Media");

		System.out.println(suma / al.size());

		muestraYsubraya("Maximo");

		System.out.println(maximo);

		muestraYsubraya("Minimo");

		System.out.println(minimo);

		muestraYsubraya("Lista después de eliminar los menores que 50");

		for (int i = al.size() - 1; i >= 0; i--) {
			if (al.get(i) < 50) {
				al.remove(i);
			}
			System.out.println(al);
		}

//			al.removeIf(num -> num < 50);
		//
//			System.out.println(al);

	}

}
