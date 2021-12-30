package br.com.bytebank.banco.modelo;

public class CalculadorDeImposto {

	private double totalDeImposto;
	
	public double getTotalDeImposto() {
		return totalDeImposto;
	}
	
	public void registra(Tributavel tributavel) {	
		totalDeImposto += tributavel.getValorImposto();	
	}
	
}
