package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaMetodoEquals {

	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente(11,21);
		ContaCorrente cc2 = new ContaCorrente(11,33);
		ContaCorrente cc3 = new ContaCorrente(11,21);
		
		
		System.out.println(cc1 == cc2);
		System.out.println(cc1.equals(cc2));
		System.out.println(cc1.equals(cc3));

	}

}
