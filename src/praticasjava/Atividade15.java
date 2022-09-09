package praticasjava;
/*
 * Atividade 15. Cria um programa Java que calcule se um número de 1 a 30 é ou não primo.
 */

import javax.swing.JOptionPane;

public class Atividade15 {
	
	// Max primes need to calculat max int prime number -> 2147483647
	static int ARRAY_MAX_LENGHT = 4793;
	static int ARRAY_CURSOR = 0;
	static int PRIMES [] = new int[ARRAY_MAX_LENGHT];
	
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
	    for (int i = 0; i < PRIMES.length && PRIMES[i] != 0; i++) {
	    	System.out.print(PRIMES[i]);
	    	System.out.print(",");
	    }
		System.exit(0); 
}
	
	public static boolean checkPrime(int number, int nSqrt) {
		
		int currentPrime = 3;
		
		while(currentPrime <= nSqrt) {
			
			PRIMES [ARRAY_CURSOR++] = currentPrime;
			if (number % currentPrime == 0) return false;
			currentPrime = nextPrime(currentPrime);
		}
		PRIMES [ARRAY_CURSOR++] = currentPrime;
		return true;
	}
	
	public static int nextPrime(int currentPrime) {
		
		int number = currentPrime + 2;
		boolean prime;
		int x =0;;
		
		for (int i = number; ; i+=2) {
			prime = true;
			
			System.out.println(i + " number to check");
			
			for (int j = 3; j <= i-2; j = j+2) {
				for(; x < PRIMES.length && j <= PRIMES[x]; x++) {
					if (PRIMES[x] == 0) {
						//j = PRIMES[x -1] + 2;
						break;
					}
					System.out.println(PRIMES[x] + " number to divid on PRIME[x]");
					if (j <= PRIMES[x]) {
						if (i % PRIMES[x] == 0) {
							prime = false;
							x = 0;
							break; 
						}
					}
				}
				
				if (prime && x != 0) {
					j = PRIMES[x -1] + 2;
					x = 0;
				}
				System.out.println(j + " number to divid on j");
				
				if (i % j == 0 && i != j || prime == false) {
					prime = false;
					break;
				}
			}
			
			System.out.println("prime?" + prime + " return:" + i);
			if (prime) return i;
			}
	}
}