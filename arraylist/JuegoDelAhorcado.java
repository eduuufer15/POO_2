package arraylist;

import java.util.Scanner;
import java.util.Random;

public class JuegoDelAhorcado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] palabras = {"cristiano", "programacion", "ordenador", "avion", "marcador"};
        String palabraSecreta = palabras[random.nextInt(palabras.length)];

        char[] palabraAdivinada = new char[palabraSecreta.length()];
        
        for (int i = 0; i < palabraAdivinada.length; i++) {
            palabraAdivinada[i] = '_';
        }

        int numeroIntentos = 0;
        boolean palabraAdivinadaCompleta = false;

        System.out.println("¡Bienvenido al juego del Ahorcado!");
        System.out.println("Adivina la palabra letra por letra o intenta adivinar la palabra completa.");

        while (!palabraAdivinadaCompleta) {
            System.out.print("\nPalabra: ");
            for (int i = 0; i < palabraAdivinada.length; i++) {
                System.out.print(palabraAdivinada[i] + " ");
            }
            System.out.println();

            System.out.print("Introduce una letra o la palabra completa: ");
            String entrada = scanner.next().toLowerCase();

            numeroIntentos++;

            if (entrada.length() > 1) {
                if (entrada.equals(palabraSecreta)) {
                    palabraAdivinadaCompleta = true;
                    palabraAdivinada = palabraSecreta.toCharArray();
                } else {
                    System.out.println("Incorrecto! Esa no es la palabra.");
                }
            } else {
                char letra = entrada.charAt(0);
                boolean letraCorrecta = false;

                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraSecreta.charAt(i) == letra) {
                        palabraAdivinada[i] = letra;
                        letraCorrecta = true;
                    }
                }

                if (letraCorrecta) {
                    System.out.println("¡Correcto! La letra '" + letra + "' esta en la palabra.");
                } else {
                    System.out.println("¡Incorrecto! La letra '" + letra + "' no esta en la palabra.");
                }

                boolean palabraCompleta = true;
                for (int i = 0; i < palabraAdivinada.length; i++) {
                    if (palabraAdivinada[i] == '_') {
                        palabraCompleta = false;
                        break;
                    }
                }
                
                if (palabraCompleta) {
                    palabraAdivinadaCompleta = true;
                }
            }
        }

        System.out.println("\nFelicidades! Has adivinado la palabra: " + palabraSecreta);
        System.out.println("Numero total de intentos: " + numeroIntentos);
    }
}