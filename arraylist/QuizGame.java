package arraylist;

import java.util.Scanner;

public class QuizGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] preguntas = { "¿Primer equipo de futbol que fue fundado en España?",
				"¿Como se llama el estadio del Real Madrid?", 
				"¿Quien es el maximo goleador de futbol del mundo?",
				"¿Quien gano la liga española en 2006?", 
				"¿De que pais es Arda Guler?" };

		String[][] opciones = { 
				{ "A) FC Barcelona", "B) Real Madrid", "C) Recreativo de Huelva", "D) Athletic Club" }, // Correcta C																										// C
				{ "A) Camp Nou", "B) Wanda Metropolitano", "C) Santiago Bernabéu", "D) Mestalla" }, // Correcta: C
				{ "A) Lionel Messi", "B) Pelé", "C) Cristiano Ronaldo", "D) Romario" }, // Correcta: C
				{ "A) FC Barcelona", "B) Real Madrid", "C) Sevilla FC", "D) Valencia CF" }, // Correcta: A
				{ "A) Turquía", "B) Grecia", "C) Francia", "D) Portugal" } // Correcta: A
		};
		
		char[] respuestaCorrectas = {'C', 'C', 'C', 'A', 'A'};
		
		int puntaje = 0;
		
		
		
	}
}
