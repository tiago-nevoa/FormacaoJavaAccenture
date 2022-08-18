package praticasjava;
/*
 * Atividade 13. Cria um programa Java que calcule se um número é par ou impar.
 */

import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Insert int Number:");
		int number = keyboard.nextInt();
		
		if (number % 2 == 0) System.out.println ("The number " + number + " is pair!");
		else System.out.println ("The number " + number + " is odd!");
	}
}
