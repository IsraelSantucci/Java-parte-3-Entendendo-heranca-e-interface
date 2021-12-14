
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Maria Teste");
		gerente.setCpf("852.152.474.66");
		gerente.setSalario(5000.00);
		gerente.setSenha(321);
		
		System.out.println("Gerente: " + gerente.getNome());
		System.out.println("CPF: " + gerente.getCpf());
		System.out.println("Salario: " + gerente.getSalario());
		int senha = 321;
		boolean autentica = gerente.autentica(senha);
		System.out.println(autentica);

	}

}
