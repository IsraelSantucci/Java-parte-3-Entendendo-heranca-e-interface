package br.com.bytebank.banco.modelo;

public class ControleBonificacao {
	
	private double soma;
	
	public double getSoma() {
		return soma;
	}
	
	public void setSoma(double soma) {
		this.soma = soma;
	}
	
	public void registra(Funcionario funcionario) {
		soma += funcionario.getBonificacao();

	}

}
