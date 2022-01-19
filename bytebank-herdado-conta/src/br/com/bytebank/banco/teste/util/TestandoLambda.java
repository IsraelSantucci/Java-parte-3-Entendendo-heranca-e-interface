package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestandoLambda {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();
		cliente1.setNome("Teresa Silva");
		Conta conta1 = new ContaCorrente(55, 99);
		conta1.setTitular(cliente1);
		conta1.deposita(800.00);

		Cliente cliente2 = new Cliente();
		cliente2.setNome("Ricardo Silva");
		Conta conta2 = new ContaCorrente(55, 12);
		conta2.setTitular(cliente2);
		conta2.deposita(450.20);

		Cliente cliente3 = new Cliente();
		cliente3.setNome("Ana Bonifacio");
		Conta conta3 = new ContaCorrente(55, 60);
		conta3.setTitular(cliente3);
		conta3.deposita(200.0);

		Cliente cliente4 = new Cliente();
		cliente4.setNome("Benedito Silva");
		Conta conta4 = new ContaCorrente(55, 25);
		conta4.setTitular(cliente4);
		conta4.deposita(700.00);

		Cliente cliente5 = new Cliente();
		cliente5.setNome("Carlos Silva");
		Conta conta5 = new ContaCorrente(55, 9);
		conta5.setTitular(cliente5);
		conta5.deposita(50.0);

		List<Conta> contas = new ArrayList<>();

		contas.add(conta1);
		contas.add(conta2);
		contas.add(conta3);
		contas.add(conta4);
		contas.add(conta5);

		contas.forEach((conta) -> System.out.println(conta));

		// Ordenando pelo numero da agencia
		contas.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));

		System.out.println();

		contas.forEach((conta) -> System.out.println(conta));

		// ordenando pelo nome do titular
		contas.sort((c1, c2) -> c1.getTitular().getNome().compareTo(c2.getTitular().getNome()));

		System.out.println();

		contas.forEach((conta) -> System.out.println(conta));

		// Ordenando pela ordem natural. deve-se ter implementando a Interface
		// Comparable
		contas.sort(null);
		System.out.println();

		contas.forEach((conta) -> System.out.println(conta));
	}

}
