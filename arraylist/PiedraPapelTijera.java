package arraylist;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[] opciones = {"piedra", "papel", "tijeras"};
		
		System.out.println("¡Este es el juego de piedra, papel y tijeras!");
		
		while (true) {
			System.out.print("Elige piedra, papel o tijeras: ");
			String usuario = scanner.nextLine().toLowerCase();
			String maquina = opciones[random.nextInt(3)];
			
			System.out.println("La maquina eligió: " + maquina);
			
			if (usuario.equals(maquina)) {
				System.out.println("\uD83D\uDE10 Empate!!! ");
			} else if ((usuario.equals("papel") && maquina.equals("piedra"))
					|| (usuario.equals("tijeras") && maquina.equals("papel"))
					|| (usuario.equals("piedra") && maquina.equals("tijeras"))) {
				System.out.println("\uD83D\uDE42 ​ Ganaste");
				System.out.println("Fin del juego \uD83D\uDE42");
				break;
			} else {
				System.out.println("\uD83D\uDE1E Perdiste");
			}
		}
	}
}
