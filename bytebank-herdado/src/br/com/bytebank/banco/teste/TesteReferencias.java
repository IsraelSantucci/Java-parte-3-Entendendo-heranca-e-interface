package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;


public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Designer designer = new Designer();
		designer.setSalario(2500);
		System.out.println("Bonificacao Designer: " + designer.getBonificacao());
		
		EditorDeVideo editor = new EditorDeVideo();
		editor.setSalario(2600);
		System.out.println("Bonificacao Editor de Video: " + editor.getBonificacao());
		
		Gerente gerente = new Gerente();
		gerente.setSalario(5000);
		System.out.println("Bonificacao Gerente: " + gerente.getBonificacao());
		
		ControleBonificacao controleBonificacao = new ControleBonificacao();
		
		controleBonificacao.registra(designer);
		controleBonificacao.registra(editor);
		controleBonificacao.registra(gerente);
		
		System.out.println("Soma das Bonificações: " + controleBonificacao.getSoma());
	}

}
