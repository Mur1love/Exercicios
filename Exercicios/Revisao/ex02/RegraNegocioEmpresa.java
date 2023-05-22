package ex02;

import java.util.Arrays;

public class RegraNegocioEmpresa {

	Empresa[] listaDeEmpresas = new Empresa[3];
	int total = 0;

	public void cadastrarEmpresa(Empresa empresa) {
		aumentaVetor();
		this.listaDeEmpresas[this.total] = empresa;
		this.total++;
	}

	public Empresa procurarEmpresa(String nome) {
		for (int i = 0; i < total; i++) {
			if (this.listaDeEmpresas[i].getNome().equals(nome)) {
				return this.listaDeEmpresas[i];
			}
		}

		return null;
	}
	
	public void adicionarPorPosicao(Empresa empresa, int posicao) {
		aumentaVetor();
		if(posicao < 0 || posicao > this.total) {
	        System.out.println("Posicao Invalida");
	        return;
	    }
	    for(int i = this.total-1; i >= posicao; i--) {
	        this.listaDeEmpresas[i+1] = this.listaDeEmpresas[i];
	    }
	    this.listaDeEmpresas[posicao] = empresa;
	    this.total++;
		
	}
	
	public void removerPorPorsicao(int posicao) {
		
		if(posicao < 0 || posicao >= this.total) {
	        System.out.println("Posicao Invalida");
	        return;
	    }
	    for(int i = posicao; i < this.total-1; i++) {
	        this.listaDeEmpresas[i] = this.listaDeEmpresas[i+1];
	    }
	    this.listaDeEmpresas[this.total-1] = null;
	    this.total--;
		
	}

	public String listarEmpresas() {
		return Arrays.toString(this.listaDeEmpresas);
	}

	private void aumentaVetor() {
		if (this.listaDeEmpresas.length == this.total) {
	        Empresa[] newEmpresa = new Empresa[this.listaDeEmpresas.length * 2];
	        System.arraycopy(this.listaDeEmpresas, 0, newEmpresa, 0, this.listaDeEmpresas.length);
	        this.listaDeEmpresas = newEmpresa;
		}
	}
}
