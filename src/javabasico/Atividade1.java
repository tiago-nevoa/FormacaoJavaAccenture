package javabasico;
/*
 * Atividade 1.
 * Cria um programa onde definamos as seguintes variáveis e as convertamos nos diferentes tipos indicados, mostrando o resultado da conversão por consola.
 * int a = 65; →→ long e char
 * long b = 10 →→ double e int
 * char c = ‘A’ →→ int
 * double d = 1.8 →→ float e int
 */

public class Atividade1 {

	public static void main(String[] args) {
		
		int a = 65;
		System.out.println("Convert int:" + a + " to long=" + intToLong(a));
		System.out.println("Convert int:" + a + " to char=" + intToChar(a));
		
		long b = 10;
		System.out.println("Convert long:" + b + " to double=" + longToDouble(b));
		System.out.println("Convert long:" + b + " to int=" + longToInt(b));
		
		char c = 'A';
		System.out.println("Convert char:" + c + " to int=" + charToInt(c));
		
		double d = 1.8;
		System.out.println("Convert double:" + d + " to float=" + doubleToFloat(d));
		System.out.println("Convert double:" + d + " to int=" + doubleToInt(d));
	}
	
	public static long intToLong (int number) {
		long n = number;
		return n;
	}
	
	public static char intToChar (int number) {
		char c = (char) number;
		return c;
	}
	
	
	public static double longToDouble (long number) {
		double n = number;
		return n;
	}
	
	public static int longToInt (long number) {
		int n = (int) number;
		return n;
	}
	
	public static int charToInt (char caracter) {
		int n = caracter;
		return n;
	}
	
	public static float doubleToFloat (double number) {
		float n = (float) number;
		return n;
	}
	
	public static int doubleToInt (double number) {
		int n = (int) number;
		return n;
	}

}