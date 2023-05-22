package Banco;

public class Principal {
	
	public static void main(String[] args) {
		
		Conta c = new Conta("Murilo", 100);
		Conta c1 = new Conta("Beatriz", 200);
		Conta c2 = new Conta("Rodolfo", 300);
		Conta c3 = new Conta("Osvaldo", 400);
		Conta c4 = new Conta("Guga", 500);
		Conta c5 = new Conta("Ednaldo", 600);
		
		CadastrarConta cc = new CadastrarConta();
		
		cc.adicionar(c);
		cc.adicionar(c1);
		cc.adicionar(c2);
		cc.adicionar(c4);
		cc.adicionar(c5);
		cc.adicionarPelaPosicao(1, c3);
		
		cc.listar();
		
		/*System.out.println(cc.procurarPosicao(2));
		Conta conta = cc.procurarNome("Turilo");
		if(conta == null) {
			
			System.out.println("Conta nao encontrada");
			
		} else {
			
			System.out.println(conta);
		}
		*/
	}

}
