package praticasjava;
/*
 * Atividade 7. Cria uma aplicação que nos peça um dia da semana e que nos diga se é um dia útil ou não. Usa um switch para isso.
 */

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String dia = keyboard.next();
		
		switch(dia){
			case "segunda-feira":
			case "terca-feira":
			case "quarta-feira":
			case "quinta-feira":
			case "sexta-feira":
				System.out.println("E um dia util!");
				break;
			case "sabado":
			case "domingo":
				System.out.println("E um dia de fim-de-semana!");
				break;
			default:
				System.out.println("Introduz um dia de semana!");
		}
	}
}
