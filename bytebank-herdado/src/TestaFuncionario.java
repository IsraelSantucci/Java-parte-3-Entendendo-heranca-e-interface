
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new EditorDeVideo();
		funcionario.setNome("Joao Teste");
		funcionario.setCpf("122.525.452.78");
		funcionario.setSalario(3000.00);
		
		System.out.println("Funcionario: " + funcionario.getNome());
		System.out.println("CPF: " + funcionario.getCpf());
		System.out.println("Salario: " + funcionario.getSalario());
		System.out.println("Bonificacao: " + funcionario.getBonificacao());
	
	}

}
