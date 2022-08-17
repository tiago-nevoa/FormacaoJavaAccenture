package praticasjava;
/*
 * Atividade 9. Cria um array de números de 100 posições, que conterá os números de 1 a 100.
 * Obtém a soma de todos eles e a média.
 */
import java.util.Random;

public class Atividade9 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int data[] = new int[100];
		int sum = 0;
		double median;
		
		for(int i = 0; i < data.length; i++) {
			data[i] = rand.nextInt(100) + 1;
			System.out.println("data[" + (i+1) + "] = " + data[i]);
			sum += data[i];
		}
		median = (double) sum / data.length;
		System.out.println("Sum: " + sum);
		System.out.println("Median: " + median);
	}
}