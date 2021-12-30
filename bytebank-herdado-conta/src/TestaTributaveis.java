
public class TestaTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		
		AcaoBolsa acao = new AcaoBolsa();
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
		
		calculadorDeImposto.registra(cc);
		calculadorDeImposto.registra(acao);
		calculadorDeImposto.registra(seguro);
		
		System.out.println("Total de impostos: " + calculadorDeImposto.getTotalDeImposto());

	}

}
