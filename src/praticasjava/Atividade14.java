package praticasjava;
/*
 * Atividade 14. Cria um programa Java que calcule se um número é múltiplo de 10.
 */

import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Insert int Number:");
		int number = keyboard.nextInt();
		
		if (number % 10 == 0) System.out.println ("The number " + number + " is multiple 10!");
		else System.out.println ("The number " + number + " is NOT multiple 10!");
	}
}
