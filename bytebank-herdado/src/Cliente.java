
public class Cliente implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Cliente() {
		autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		autenticador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return autenticador.autentica(senha);
	}

}
