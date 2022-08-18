package praticasjava;
/*
 * Atividade 12. Criar um array com os seguintes valores: {5,6,2,10,1} e mostrar por consola os valores do array ordenados.
 */

public class Atividade12 {

	public static void main(String[] args) {
		
		int data[] = {5,6,2,10,1};
		bubbleSort(data,0,data.length-1);
	}
	private static void bubbleSort( int data[], int begin, int end) {
		for(int i = begin; i <= end; i++) {
			for (int j = end; j >= i + 1; j--) {
				if (data[j] < data[j-1]) exchange (data,j,j-1);
			}
		}
	}

	private static void exchange(int[] data, int i, int j) {
		int aux = data[i];
		data[i] = data[j];
		data[j] = aux;
		for(int t = 0; t < data.length; t++) {
			System.out.print(data[t] + ", ");
		}
		System.out.println("");
	}

}
