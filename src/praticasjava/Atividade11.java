package praticasjava;
/*
 * Atividade 11. Dado um array de números de 5 posições com os seguintes valores {1,2,3,4,5}, guardar os valores deste array noutro array diferente, mas com os valores invertidos, ou seja, o segundo array deverá ter os valores {5,4,3,2,1}.
 */

public class Atividade11 {

	public static void main(String[] args) {
		
		int data[] = {1,2,3,4,5};
		int newData[] = new int[data.length];
		
		for(int i = 0; i < newData.length; i++) {
			newData[i] = data[data.length-i-1];
			System.out.println(newData[i]);
		}
	}
}
