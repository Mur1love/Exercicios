package contaRevisao;

import java.util.Arrays;

public class CadastroConta {
	
	Conta[] listaDeContas = new Conta[4];
	int total = 0;
	
	public void adicionarConta(Conta c) {
		aumentaVetor();
		this.listaDeContas[this.total] = c;
		this.total++;
	}
	
	public String listarContas() {
		return Arrays.toString(this.listaDeContas);
	}
	
	public void adicionarContaPorPosicao(Conta c, int posicao) {
		aumentaVetor();
		//comeca do ultimo elemento do vetor ate a posicao 
		for (int i = this.total-1; i >= posicao; i--) {
			this.listaDeContas[i+1] = this.listaDeContas[i]; //copia e move os elementos para a direita
		}
		this.listaDeContas[posicao] = c;
		this.total++;
	}
	
	public void removerContaPorPosicao(int posicao) {
		//comeca da posicao definida ate o ultimo elemento do vetor 
		aumentaVetor();
		for(int i = posicao; i <= this.total-1; i++) {
			this.listaDeContas[i] = this.listaDeContas[i+1]; // copia e move os elementos para a esquerda
		}
		this.listaDeContas[this.total-1] = null; //anula o ultimo elemento que esta duplicado
		this.total--; 
	}
	
	public Conta procurarContaPeloNome(String nome) {
		for (int i = 0; i <= this.total; i++) {
			if(this.listaDeContas[i].getNome().equals(nome)) {
				return this.listaDeContas[i];
			}
		}
		return null;
	}
	
	public Conta procurarConta(int posicao) {
		return this.listaDeContas[posicao];
	}
	
	

	private void aumentaVetor() {
		if(this.listaDeContas.length == this.total) {
			Conta[] newConta = new Conta[this.listaDeContas.length*2];
			System.arraycopy(listaDeContas, 0, newConta, 0, this.listaDeContas.length);
			this.listaDeContas = newConta;
			
		}
		
	}
	

}
