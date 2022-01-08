package br.com.bytebank.banco.teste;
import javax.swing.JOptionPane;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException{
		ContaCorrente cc = new ContaCorrente(333, 333);
		cc.deposita(1000);
		
		ContaPoupanca cp = new ContaPoupanca(444, 444);
		cp.deposita(2000);
		cc.transfere(100, cp);
		
		System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
		System.out.println("Saldo Conta Poupanca: " + cp .getSaldo());
	}

}
