package javabasico;

import java.util.Scanner;
/*
 * Atividade 6. Mostrar o comprimento de uma cadeia.
 */
public class Atividade6 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Insert data frame of caracters");
		String name = keyboard.nextLine();
		
		System.out.println("Frame size is:" + name.length() + " caracters");
	}

}
