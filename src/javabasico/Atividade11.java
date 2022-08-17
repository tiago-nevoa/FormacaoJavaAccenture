package javabasico;

import java.util.Scanner;
/*
 * Atividade 11. Dada uma frase que se pede por consola, o programa deve separá-lo em palavras.
 */

public class Atividade11 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Intruduza uma frase:");
		String frame = keyboard.nextLine();
		
		String words[] = frame.split(" ");
		
		for(int i = 0; i < words.length; i++)
		{
			if (words[i] == "") continue; 
			System.out.println("Word[" + i + "]: " + words[i]);
		}

	}

}
