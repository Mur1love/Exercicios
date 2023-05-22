package ex02;

import java.util.Arrays;

public class RegraNegocioFuncionario {

	Funcionario[] listaDeFuncionarios = new Funcionario[3];
	int total = 0;

	public void cadastrarFuncionario(Funcionario funcionario) {
		aumentaVetor();
		this.listaDeFuncionarios[this.total] = funcionario;
		this.total++;
	}
	
	public Funcionario procurarFuncionario(String nome) {
		for(int i = 0; i < total; i++) {
			if(this.listaDeFuncionarios[i].getNome().equals(nome)) {
				return this.listaDeFuncionarios[i];
			}
		}
		
		return null;
	}
	
	public void adicionarPorPosicao(Funcionario funcionario, int posicao) {
		aumentaVetor();
		if(posicao < 0 || posicao > this.total) {
	        System.out.println("Posicao Invalida");
	        return;
	    }
	    for(int i = this.total-1; i >= posicao; i--) {
	        this.listaDeFuncionarios[i+1] = this.listaDeFuncionarios[i];
	    }
	    this.listaDeFuncionarios[posicao] = funcionario;
	    this.total++;
		}
	
	public void removerPorPorsicao(int posicao) {
		
		if(posicao < 0 || posicao >= this.total) {
	        System.out.println("Posicao Invalida");
	        return;
	    }
	    for(int i = posicao; i < this.total-1; i++) {
	        this.listaDeFuncionarios[i] = this.listaDeFuncionarios[i+1];
	    }
	    this.listaDeFuncionarios[this.total-1] = null;
	    this.total--;
	}

	public String listarFuncionarios() {
		return Arrays.toString(this.listaDeFuncionarios);
	}

	private void aumentaVetor() {
		if (this.listaDeFuncionarios.length == this.total) {
			Funcionario[] newFuncionario = new Funcionario[this.listaDeFuncionarios.length * 2];
			System.arraycopy(this.listaDeFuncionarios, 0, newFuncionario, 0, this.listaDeFuncionarios.length);
			this.listaDeFuncionarios = newFuncionario;

		}

	}

}
