package br.com.bytebank.banco.teste;

import java.util.Iterator;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class GuardadorDeContas{
	
	private Object[] contas;
	private int posicaoLivre;
	
	public GuardadorDeContas(int tamanho) {
		contas =  new Conta[tamanho];
		posicaoLivre = 0;
	}


	public void adicionar(ContaCorrente cc) {
		contas[posicaoLivre] = cc;	
		posicaoLivre++;
	}


	public int getQuantidade() {
		return posicaoLivre;
		
	}


	public Object getReferencia(int pos) {
		return contas[pos];
	}


	public void apagar() {
		posicaoLivre--;
		contas[posicaoLivre] = null;
		
	}


	
	
	

}
