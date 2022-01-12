package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaArrayDeReferencia {

	public static void main(String[] args) {

		ContaCorrente[] contas = new ContaCorrente[5];
		ContaCorrente conta1 = new ContaCorrente(122, 122);
		ContaCorrente conta2 = new ContaCorrente(333, 562);
		ContaCorrente conta3 = new ContaCorrente(11, 55);
		ContaCorrente conta4 = new ContaCorrente(77, 10);
		ContaCorrente conta5 = new ContaCorrente(999, 300);

		contas[0] = conta1;
		contas[1] = conta2;
		contas[2] = conta3;
		contas[3] = conta4;
		contas[4] = conta5;

		for (int i = 0; i < contas.length; i++) {
			System.out.println("Conta Corrente agencia: " + contas[i].getAgencia() + " numero: "+ contas[i].getNumero());
		}

	}

}
