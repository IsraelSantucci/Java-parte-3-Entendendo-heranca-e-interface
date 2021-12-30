package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;

	}
	@Override
	public boolean saca(double valor) {
		double novoValor = valor + 0.2;
		return super.saca(novoValor);
	}

	@Override
	public double getValorImposto() {
		return 10;
	}

}
