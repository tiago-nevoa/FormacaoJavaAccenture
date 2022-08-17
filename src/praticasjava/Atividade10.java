package praticasjava;
/*
 * Atividade 10. Pede ao utilizador pelo teclado uma frase e passa os seus carateres para um array de carateres.
 * Podes fazer com ou sem métodos de String.
 */
import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Insert phrase:");
		String phrase = keyboard.nextLine();
		char data[] = new char[phrase.length()];
		
		for(int i = 0; i < data.length; i++) {
			data[i] = phrase.charAt(i);
			System.out.println("data[" + i + "]:" + data[i]);
		}	
	}
}
