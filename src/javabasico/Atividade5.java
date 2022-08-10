package javabasico;

import java.util.Scanner;
/*
 * Atividade 5. Modifica o exercício anterior, para que em vez de pedir um número, peça um caráter (char) e mostre o seu código na tabela ASCII.
 */

public class Atividade5 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Insert one caracter");
		char c = keyboard.next().charAt(0);
		
		int code = c;
		
		System.out.println("The caracter:" + c + " on ASCII is code: " + code);

	}

}
