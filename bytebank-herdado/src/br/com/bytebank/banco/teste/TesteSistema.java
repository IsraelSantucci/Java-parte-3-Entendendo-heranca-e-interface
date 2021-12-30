package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;


public class TesteSistema {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setSenha(111);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(222);
		
		Administrador adm = new Administrador();
		adm.setSenha(111);
		
		SistemaInterno sistema = new SistemaInterno();
		
		sistema.autenticar(gerente);
		sistema.autenticar(cliente);
		sistema.autenticar(adm);

	}

}
