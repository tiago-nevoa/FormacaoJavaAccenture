package javabasico;

import java.util.Scanner;
/*
 * Atividade 12. Criar um programa, com duas variáveis inteiras onde os valores serão pedidos por consola.
 * Mostrará finalmente uma mensagem: “A soma de XX e YY é ZZ”.
 */

public class Atividade12 {

	public static void main(String[] args) {
		
		int n1;
		int n2;
		long res;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Insert 1 number:");
		n1 = keyboard.nextInt();
		
		System.out.println("Insert 2 number:");
		n2 = keyboard.nextInt();
		
		res = n1 + n2;
		
		System.out.println("A soma de " + n1 + " e " + n2 + " é " + res);
	}
}
