package br.com.bytebank.banco.modelo;
/**
 * Classe abstrata para representar uma conta generica
 * @author israel
 *
 */
public abstract class Conta implements Comparable<Conta>{

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		
	}

	public abstract void deposita(double valor);

	/**
	 * metodo usado para editar o saldo do cliente 
	 * @param valor
	 * @throws SacaException
	 */
	public void saca(double valor) throws SacaException {
		if(this.saldo < valor) {
			throw new SacaException("Saldo insuficiente para sacar o valor de " + valor);
		}
		
		if(valor <= 0){
			throw new SacaException("Valor invalido");
		}
			this.saldo -= valor;
				
	}

	public void transfere(double valor, Conta destino) throws SacaException{
		this.saca(valor);
		destino.deposita(valor);
			
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {
	
		return "Agencia: " + this.agencia + " Numero: " + this.numero + " Titular: " + 
				this.getTitular().getNome() + " Saldo: " + this.saldo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta conta = (Conta) obj;
		
		if(this.agencia != conta.agencia) {
			return false;
		}
		if(this.numero != conta.numero) {
			return false;
		}
		return true;
		
		
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}

}