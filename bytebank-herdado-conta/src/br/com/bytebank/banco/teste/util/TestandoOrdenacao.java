package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestandoOrdenacao {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente(22, 56);
		Conta c2 = new ContaCorrente(22, 12);
		Conta c3 = new ContaCorrente(22, 74);
		Conta c4 = new ContaCorrente(22, 90);
		Conta c5 = new ContaCorrente(22, 10);
		Conta c6 = new ContaCorrente(22, 01);
		Conta c7 = new ContaCorrente(22, 55);
		Conta c8 = new ContaCorrente(22, 74);

		List<Conta> lista = new ArrayList<>();
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);
		lista.add(c5);
		lista.add(c6);
		lista.add(c7);
		lista.add(c8);

		for (Conta conta : lista) {
			System.out.println(conta);
		}

		
		lista.sort((Conta conta1, Conta conta2) -> Integer.valueOf(conta1.getNumero()).compareTo(conta2.getNumero()) );
		System.out.println();

		int num = 12 ;
		int resultado = (num == 0) ? 0 : ((num > 0) ? 1 : -1); 
		System.out.println(resultado);
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}

}

class OrdenadorNumeroConta implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		if(c1.getNumero()  < c2.getNumero()) {
			return -1;
		}
		
		if(c1.getNumero()  > c2.getNumero()) {
			return +1;
		}
		
		return 0;
		
	}
}
