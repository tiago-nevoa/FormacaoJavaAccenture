package praticasjava;
/*
 * Atividade 15. Cria um programa Java que calcule se um número de 1 a 30 é ou não primo.
 */

import javax.swing.JOptionPane;

public class Atividade15 {

	public static void main(String[] args) {
		
		boolean prime = false;
		int number = 0;
		int nSqrt;
		
		String keyboard = JOptionPane.showInputDialog("Insert number:");
		number = Integer.parseInt(keyboard);
				
		if (number > 1 && number <= 3) prime = true;
		if (number > 4 && number % 2 != 0 /* only odd can be prime*/) {
			// check if squareRoot(number) % (lowers prime_numbers) always != 0 -> that means is prime
			nSqrt = (int) Math.sqrt(number);
			prime = checkPrime(number,nSqrt);
		}
		
		if (prime) JOptionPane.showMessageDialog(null,"The number is Prime!","Atividade 15.",JOptionPane.INFORMATION_MESSAGE);
		else JOptionPane.showMessageDialog(null,"The number is composite!","Atividade 15.",JOptionPane.INFORMATION_MESSAGE);
	     
		System.exit(0); 
}
	
	public static boolean checkPrime(int number, int nSqrt) {
		boolean prime = true;
		int currentPrime = 3;
		//int nextPrime;
		
		while(currentPrime <= nSqrt) {
			if (number % currentPrime == 0) return false;
			currentPrime = nextPrime(currentPrime);
			
		}
		
		return true;
	}
	
	public static int nextPrime(int currentPrime) {
		
		int number = currentPrime + 2;
		boolean prime;
		
		for (int i = number; ; i+=2) {
			prime = true;
			System.out.println(i + " number to check");
			for (int j = i - 2; j > 2; j = j-2) {
				System.out.println(j + " number to divid");
				
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			
			System.out.println("prime?" + prime + " return:" + i);
			if (prime) return i;
		}
	}
}