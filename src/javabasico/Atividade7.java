package javabasico;

import java.util.Scanner;
/*
 * Atividade 7. Pedir duas palavras por teclado, indicar se são iguais.
 */
public class Atividade7 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Insert first word");
		String name1 = keyboard.next();
		
		System.out.println("Insert second word");
		String name2 = keyboard.next();
		
		if(name1.equals(name2)) {
			System.out.println("words equals");
		}else {
			System.out.println("words NOT equals");
		}
		
	}

}
