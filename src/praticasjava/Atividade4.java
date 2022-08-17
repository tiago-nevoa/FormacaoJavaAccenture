package praticasjava;
/*
 * Atividade 4. Mostra os números de 1 a 100 (ambos inclusive) divisíveis entre 2 ou 3. Utiliza o ciclo que quiseres.
 */

public class Atividade4 {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			if (i % 2 == 0 || i % 3 == 0) System.out.print(i + " ");
		}
	}
}
