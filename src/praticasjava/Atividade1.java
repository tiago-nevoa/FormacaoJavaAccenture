package praticasjava;

import java.util.Scanner;
/*
 * Atividade 1. Lê um número por teclado e indica se é divisível por 2 (resto = 0).
 * Se não for, também devemos indicá-lo.
 */

public class Atividade1 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Insert Number:");
		double n = keyboard.nextDouble();
		
		if(n%2 == 0) System.out.println ("The Number is par!");
		else System.out.println ("The Number is odd!");
	}
}