package arraylist;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class EjercicioDeAdivinanza {

	public static void main(String[] args) {
		
		int intento;
		int contadorDeIntento = 0;
		int numeroMaximo = 500;
		
		Random random = new Random();
		int numeroSecreto = random.nextInt(numeroMaximo) + 1; 

		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> historial = new ArrayList<>();
		
		
		System.out.println("¡Este es el juego de la adivinacion! Adivina un número entre 1 y 500 y gana un cheque regalo del carrefour valorado en 500 euros. :)");

        do {
            System.out.print("Introduce tu intento: ");
            intento = scanner.nextInt();
            historial.add(intento);
            contadorDeIntento++;

            if (intento < numeroSecreto) {
                System.out.println("Casi! El número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("Casi! El número es menor.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número!!!!!!.");
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



