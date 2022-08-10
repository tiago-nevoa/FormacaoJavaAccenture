package javabasico;

import java.util.Scanner;
/*
 * Atividade 3. Faz uma aplicação que calcule a área de um círculo(pi*R2).
 * O raio será pedido por teclado (lembra-te de passar de String para double com Double.parseDouble).
 * Usa a constante PI e o método pow de Math.
 */

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Introduz um raio");
		double raio = keyboard.nextDouble();
		while (raio < 0) {
			System.out.println("Porfavor insira um valor de raio >= 0!");
			System.out.println("Introduz um raio");
			raio = keyboard.nextDouble();
		}
		
		double area = Math.PI * Math.pow(raio,2);
		
		System.out.print("A area do circulo e: " + area);
	}

}
