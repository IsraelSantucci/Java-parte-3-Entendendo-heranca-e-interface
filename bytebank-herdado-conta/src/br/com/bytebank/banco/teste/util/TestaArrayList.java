package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaArrayList {

	public static void main(String[] args) {
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		contas.add(new ContaCorrente(11,22));
		contas.add(new ContaPoupanca(11,80));
		contas.add(new ContaCorrente(22,12));
		
		for(Conta conta : contas) {
			System.out.println(conta);
		}
		
	
		System.out.println(contas.size());
		
		contas.forEach(System.out::println);
		
		contas.remove(1);
		
		System.out.println();
		for (Conta conta : contas) {
			System.out.println(conta);
		}
		
		System.out.println(contas.size());
	}
}
