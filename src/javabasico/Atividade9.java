package javabasico;

public class Atividade9 {

	public static void main(String[] args) {
		
		String s = "A chuva em Lisboa e uma maravilha";
		
		String sAux = s.replace('a', 'e');
		
		s = sAux;

		System.out.println(s);
	}
}