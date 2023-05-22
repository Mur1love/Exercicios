package Banco;

import java.util.Arrays;

public class CadastrarConta {

	Conta[] conta = new Conta[5];
	int total = 0;
	
	public void adicionar(Conta c) {
		aumentarVetor();
		conta[this.total] = c;
		this.total++;
		
	}
	
	public void adicionarPelaPosicao(int posicao, Conta cc) {
		aumentarVetor();
		if(!verificarPosicao(posicao)) {
			
			System.out.println("Posicao invalida");
		}
		
		for (int i = this.total - 1; i >= posicao; i--) {
			
			this.conta[i + 1] = this.conta[i];
		}
		
		this.conta[posicao] = cc;
		this.total++;
	}
	
	public void listar() {
		
		System.out.println(Arrays.toString(this.conta));
		
	}
	
	public Conta procurarPosicao(int p) {
		if (!verificarPosicao(p)) {
			throw new IllegalAccessError("posicao invalida");
		}
		
		return this.conta[p];
	}
	
	public Conta procurarNome(String nome) {
		Conta c = null;
		
		for(int i = 0; i < this.total; i++) {
			if(nome.equalsIgnoreCase(this.conta[i].getNome())) {
				c = this.conta[i];
			}
		}
		return c;
	}
	
	private boolean verificarPosicao(int posicao) {
		return posicao >= 0 && posicao <= this.total;
	}
	
	private void aumentarVetor() {
		
		if(this.total == this.conta.length) {
			
			Conta[] newConta = new Conta[this.conta.length*2];
			
			System.arraycopy(newConta, 0, newConta, 0, this.conta.length);
			
			this.conta = newConta;
			
		}
			
	}
	
}
