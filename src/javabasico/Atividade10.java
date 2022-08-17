package javabasico;
/*
 * Atividade 10. Dada uma cadeia, extrair a quarta e quinta letra usando o método substring.
 */

public class Atividade10 {

	public static void main(String[] args) {

		String s = "Hello World!";
		
		String subS = s.substring(3,5);
		
		System.out.println("Trama = " + s);
		System.out.println("SubTrama[3,4] = " + subS);
	}

}
