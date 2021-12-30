package br.com.bytebank.banco.modelo;

public class SistemaInterno {

	private int senha = 111;

	public void autenticar(Autenticavel autenticavel) {
		
		boolean autenticou = autenticavel.autentica(senha);

		if (autenticou) {
			System.out.println("Pode entrar no sistema.");
		} else {
			System.out.println("Não pode entrar no Sistema.");
		}
	}

}
