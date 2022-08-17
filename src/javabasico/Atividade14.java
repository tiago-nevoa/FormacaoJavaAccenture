package javabasico;

import java.util.Scanner;
/*
 * Atividade 14. Lê um número por teclado que peça o preço de um produto (pode ter decimais) e calcula o preço final com IVA. O IVA será uma constante que será 23%.
 */

public class Atividade14 {

	public static void main(String[] args) {

		final double IVA = 0.23;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Insert Price:");
		double n1 = keyboard.nextDouble();
		
		System.out.println("Final Price = " + (n1 + n1*IVA));
	}
}
