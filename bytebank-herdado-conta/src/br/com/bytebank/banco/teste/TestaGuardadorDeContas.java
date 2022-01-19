package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaGuardadorDeContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(11, 01);
		ContaCorrente cc1 = new ContaCorrente(11, 02);
		ContaCorrente cc2 = new ContaCorrente(11, 03);
		
		GuardadorDeContas guardador = new GuardadorDeContas(15);
		
		guardador.adicionar(cc);
		guardador.adicionar(cc1);
		guardador.adicionar(cc2);
		
		System.out.println(guardador.getQuantidade());
		
		Conta ref = (Conta) guardador.getReferencia(0);
		System.out.println(ref.getAgencia() + " - " + ref.getNumero());
		System.out.println(((Conta)(guardador.getReferencia(1))).getAgencia() + " - " + ((Conta)(guardador.getReferencia(1))).getNumero());
		
		guardador.apagar();
		
		System.out.println(guardador.getQuantidade());
		
		if (guardador.getReferencia(1) instanceof Conta) {
			System.out.println("Sim");
		}else {
			System.out.println("nao");
		}
		
	}
}
