package praticasjava;
/*
 * Atividade 8. Pede pelo teclado um número inteiro positivo (devemos controlá-lo) e mostra o número de algarismos que tem.
 * Por exemplo: se introduzimos 1250, que nos mostre que tem 4 algarismos.
 * Teremos de controlar se tem um ou mais algarismos, ao exibir a mensagem.
 */

import javax.swing.JOptionPane;

public class Atividade8 {

	public static void main(String[] args) {
		
		int number;
		int counter = 0;
		
		do {
			String keyboard = JOptionPane.showInputDialog("Insert number:");
			number = Integer.parseInt(keyboard);
		}while(number<0);
		
		for(int i = number; i > 0; i/=10) counter++;
			
		if(counter == 1) System.out.println("O numero tem 1 Algarismo");
		else System.out.println("O numero tem " + counter + " Algarismos");
	}
}
