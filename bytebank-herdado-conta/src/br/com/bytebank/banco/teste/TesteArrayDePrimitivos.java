package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		int[] idades = new int[5];

		for (int i = 0; i < idades.length; i++) {
			idades[i] = i + 2 * i;
		}

		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}

		char[] palavra = new char[10];

		palavra[0] = 'á';
		palavra[1] = 'r';
		palavra[2] = 'v';
		palavra[3] = 'o';
		palavra[4] = 'r';
		palavra[5] = 'e';

		for (int i = 0; i < palavra.length; i++) {
			System.out.print(palavra[i]);
		}
		
	}
}
