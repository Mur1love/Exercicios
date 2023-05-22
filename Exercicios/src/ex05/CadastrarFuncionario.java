package ex05;

import java.util.ArrayList;

public class CadastrarFuncionario {
	
	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public void cadastrarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
		System.out.println("Funcionario cadastrado com sucesso!");
	}
	
	public void listarFuncionarios() {
		if(funcionarios.isEmpty()) {
			System.out.println("Nao ha funcionarios cadastrados.");
		}else {
			System.out.println("Lista de Funcionarios: ");
			for(Funcionario f : funcionarios) {
				System.out.println(f);
			}
		}
	}
	
	public void procurarFuncionario(String nome) {
		boolean encontrado = false;
		for(Funcionario f : funcionarios) {
			if(f.getNome().equals(nome)) {
				System.out.println(f);
				encontrado = true;
				break;
			}
		}
		if(!encontrado) {
			System.out.println("Funcionario nao encontrado!");
		}
	}
	
	public void removerFuncionario (String cpf) {
		boolean removido = false;
		for(Funcionario f : funcionarios) {
			if(f.getCpf().equals(cpf)) {
				funcionarios.remove(f);
				System.out.println("Funcionario removido com sucesso!");
				removido = true;
				break;
			}
		}
		if(!removido) {
			System.out.println("Funcionario nao encontrado");
		}
	}
}
