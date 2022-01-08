package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TestaSaca {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente(123, 555);

		conta.deposita(400);

		try {
			conta.saca(500);
		} catch (SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
		System.out.println("Saldo da conta: " + conta.getAgencia() + " - " + conta.getNumero() + " : " 
				+ conta.getSaldo());
	}
}
