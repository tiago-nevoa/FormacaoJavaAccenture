package praticasjava;
/*
 * Atividade 5. Declara 2 variáveis numéricas (com o valor que quiseres) e indica qual é maior dos dois.
 * Se forem iguais também o indica. Vês os valores a mudar para verificar que funciona.
 */

public class Atividade5 {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		if(n1 > n2) {
			System.out.println("O numero: " + n1 + " e maior que: " + n2);
		}else if (n1 < n2) System.out.println("O numero: " + n2 + " e maior que: " + n1);
		else System.out.println("O numero: " + n1 + " e igual: " + n2);
	}
}
