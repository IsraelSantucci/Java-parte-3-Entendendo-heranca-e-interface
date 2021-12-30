package br.com.bytebank.banco.modelo;

public interface Autenticavel {
	
	public void setSenha(int senha);

	public boolean autentica(int senha);

}
