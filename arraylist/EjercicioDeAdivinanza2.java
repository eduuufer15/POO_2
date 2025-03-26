package arraylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EjercicioDeAdivinanza2 {
	public static void main(String[] args) {
		
	
	int intento;
	int contadorDeIntento = 0;
	
	Random random = new Random();
	int numeroSecreto = random.nextInt(100) + 1;
	
	Scanner scanner = new Scanner(System.in);
	
	ArrayList <Integer> historial = new ArrayList<>();
	
	System.out.println("¡Este es el juego de la advivnación! Adivina un numero entre 1 y 100 y gana un premio valorado en 1000$ ");
	
	do {
		System.out.print("Introduce tu intento: ");
		intento = scanner.nextInt();
		historial.add(intento);
		contadorDeIntento++;
		
		if(intento < numeroSecreto) {
			System.out.println("Casi! El número es mayor.");
		}else if(intento > numeroSecreto){
			System.out.println("Casi! El número es menor");
		}else {
			System.out.println("¡Felicidades! Has adivinado el n");
		}
		
		System.out.print("Historial de intentos: ");
		for (int num : historial) {
			System.out.print(num + " ");
		}
		System.out.println();
		
	    } while (intento != numeroSecreto);
		
		System.out.println("Número total de intentos: " + contadorDeIntento);
		
		System.out.print("Tus intentos fueron: ");
		
		for (int num : historial) {
			System.out.print(num + " ");
		}
		System.out.println();
  }
}

