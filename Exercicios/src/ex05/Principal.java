package ex05;

import java.util.Scanner;



@SuppressWarnings("unused")
public class Principal {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Murilo", "123", "aaa");
		Funcionario f2 = new Funcionario("Bea", "456", "bbb");
		Funcionario f3 = new Funcionario("Valdeco", "789", "ccc");
		Funcionario f4 = new Funcionario("Valdemar", "000", "ddd");
		
		
		CadastrarFuncionario cf = new CadastrarFuncionario();
		
		cf.cadastrarFuncionario(f1);
		cf.cadastrarFuncionario(f2);
		cf.cadastrarFuncionario(f3);
		cf.cadastrarFuncionario(f4);
		
		cf.listarFuncionarios();
		
		cf.removerFuncionario("456");
		
		cf.listarFuncionarios();
		
		cf.procurarFuncionario("Valdeco");
		
		
		
		
		
		
		
		
		
		/*
		ArrayIFBA<Funcionario> cc = new ArrayIFBA<Funcionario>();
		
		cc.adicionar(f1);
		cc.adicionar(f2);
		cc.adicionar(f3);
		
		cc.adicionarPorPosicao(0, f4);
		
		cc.listar();
		
		cc.remover(1);
		
		
		
		
		
	
		Scanner sc = new Scanner(System.in);
		CadastrarFuncionario cff = new CadastrarFuncionario();
		
		int opcao;
		
		do {
			
			System.out.println("\nMenu de opcoes:");
            System.out.println("1. Cadastrar funcionario");
            System.out.println("2. Listar funcionarios");
            System.out.println("3. Procurar funcionarios");
            System.out.println("4. Remover funcionarios");
            System.out.println("0. Sair");
            System.out.println("Digite a opcao desejada: ");
            opcao = sc.nextInt();
            
            switch(opcao) {
            case 1:
            	System.out.print("Nome do funcionário: ");
                String nome = sc.next();
                System.out.print("CPF do funcionário: ");
                String cpf = sc.next();
                System.out.print("Função do funcionário: ");
                String funcao = sc.next();
                
                Funcionario fnc = new Funcionario(nome, cpf, funcao);
                cf.cadastrarFuncionario(fnc);
                break;
            
            case 2:
            	cf.listarFuncionarios();
            	break;
            	
            case 3:
            	System.out.println("Nome do Funcionario: ");
            	String cfpProcura = sc.next();
            	cf.procurarFuncionario(cfpProcura);
            	break;
            	
            case 4:
            	System.out.println("CPF do Funcionario: ");
            	String cpfRemove = sc.next();
            	cf.removerFuncionario(cpfRemove);
            	break;
            	
            case 0:
            	System.out.println("Saindo do programa...");
            	break;
            	
            default:
            	System.out.println("Opcao Invalida");
            	
            }
			
		} while(opcao != 0);
		
		sc.close();
	} 
	
	*/
	}
}



