package javabasico;

import java.util.Scanner;
/*
 * Atividade 2. Fazer um programa, onde serão definidas três variáveis locais, nome, apelidos e idade, sendo esta última de tipo inteiro. Estas variáveis serão introduzidas por consola. Finalmente mostrará uma mensagem em consola usando as variáveis da seguinte forma: “Olá nome apelidos tens idade anos”.
 */

public class Atividade2 {

	public static void main(String[] args) {
		
		String name;
		String surname;
		int age;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Nome?");
		name = keyboard.nextLine();
		while (name.length() <= 0) {
			System.out.println("Nome?");
			name = keyboard.nextLine();
		}
		
		System.out.println("Sobrenome?");
		surname = keyboard.nextLine();
		while (surname.length() <= 0) {
			System.out.println("Sobrenome?");
			surname = keyboard.nextLine();
		}
		
		System.out.println("Idade?");
		age = keyboard.nextInt();
		while (age < 0) {
			System.out.println("Idade?");
			age = keyboard.nextInt();
		}
		
		System.out.println("Ola " + name + " " + surname + " tens " + age + " anos.");
	}

}
