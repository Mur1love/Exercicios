package contaRevisao;

public class Principal {
	
	public static void main(String[] args) {
		CadastroConta cc = new CadastroConta();
		
		Conta c1 = new Conta("Murilo", 100);
		Conta c2 = new Conta("Bea", 100);
		Conta c3 = new Conta("Arnaldo", 100);
		Conta c4 = new Conta("Boi", 100);
		
		cc.adicionarConta(c1);
		cc.adicionarConta(c2);
		cc.adicionarConta(c3);
		cc.adicionarContaPorPosicao(c4, 0);
		
		System.out.println("Lista de Contas: "+ cc.listarContas());
		
		cc.removerContaPorPosicao(0);
		
		System.out.println("Lista de Contas: "+ cc.listarContas());
	
	}
}
