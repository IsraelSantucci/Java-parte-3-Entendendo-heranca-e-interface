package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestandoCollections {

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
		
		Collections.sort(contas);
		contas.forEach((conta)->System.out.println(conta));
		
		System.out.println();
		
		NumeroDaContaComparator com = new NumeroDaContaComparator();
		Collections.sort(contas, com);
		contas.forEach((conta) -> System.out.println(conta));
		
		System.out.println();
		
		Collections.reverse(contas);
		contas.forEach((conta)->System.out.println(conta));
		
		System.out.println();
		
		Conta c = new ContaCorrente(55,99);
		c.deposita(200);
		c.setTitular(new Cliente());
		
		contas.sort(new NumeroDaContaComparator());
		contas.forEach((conta)->System.out.println(conta));
		
		int pos = Collections.binarySearch(contas, c, new NumeroDaContaComparator());
		
		System.out.println(pos);
		
		System.out.println(c);
		
		Iterator it = contas.iterator();
		
		System.out.println("-----------------------");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			
	}

	
}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		return Integer.compare(c1.getNumero(), c2.getNumero());
	}
};
