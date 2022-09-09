package praticasjava;

/*
 * Atividade 16. Programa que considere um número de 1 a 7 e diga o dia da semana correspondente.
 */

import javax.swing.JOptionPane;

public class Atividade16 {
	
	static String WEEKS [] = {"Segunda-Feira","Terça-Feira","Quarta-Feira","Quinta-Feira","Sexta-Feira","Sabado","Domigo"};
	
	public static void main(String[] args) {
		
		int number = 0;
		do {
			String keyboard = JOptionPane.showInputDialog("Insert number:");
			number = Integer.parseInt(keyboard);
		}while (number < 1 || number > 7);
		
		JOptionPane.showMessageDialog(null,"Corresponde a " + WEEKS[number-1] + "!","Atividade 15.",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0); 
	}

}
