package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		String nome = "Alura";
		
		String n = nome;
		nome = "Caelum";
		
		System.out.println(nome + n);
		
		StringBuilder sb = new StringBuilder("Terra");
		System.out.println(sb.reverse());
		
		System.out.println(n.toString().toString().toString());
		
	}
}


