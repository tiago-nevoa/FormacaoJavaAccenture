package javabasico;

import java.util.Scanner;
/*
 * Atividade 4. Lê um número por teclado e mostra por consola, o caráter a que pertence na tabela ASCII.
 * Por exemplo: se introduzo um 97, mostra-me um “a”.
 */

public class Atividade4 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Insert number > 0 and < 256");
		int number = keyboard.nextInt();
		while(number > 0xFF || number <= 0x00) {
			System.out.println("Insert number > 0 and < 256");
			number = keyboard.nextInt();
		}
		
		char c = (char) number;
		
		System.out.println("Code:" + number + " on ASCII is: " + c);
	}

}
