package praticasjava;

import java.util.Scanner;

/*
 * Atividade 6. Lê um número pelo teclado e verifica que este número é maior ou igual a zero, se não for voltará a pedir (do while), depois mostra esse número por consola.
 */

public class Atividade6 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("Introduz um numero maior que 0:");
			n = keyboard.nextInt();
		}while(n <= 0);
		System.out.println("Numero: " + n);
	}
}