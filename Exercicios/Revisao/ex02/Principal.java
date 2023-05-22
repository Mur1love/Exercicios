package ex02;

public class Principal {
	
	public static void main(String[] args) {
		
		Empresa e1 = new Empresa("1111", "Apple", "999");
		Empresa e2 = new Empresa("2222", "Microsoft", "990");
		Empresa e3 = new Empresa("3333", "Google", "991");
		
		RegraNegocioEmpresa ce = new RegraNegocioEmpresa();
		
		ce.cadastrarEmpresa(e1);
		ce.cadastrarEmpresa(e3);
		ce.adicionarPorPosicao(e2, 2);
		
		System.out.println("Lista de empresas: "+ ce.listarEmpresas());
		
		ce.removerPorPorsicao(1);
		
		System.out.println("Lista de empresas: "+ ce.listarEmpresas());
		
		System.out.println("Procurar empresa: "+ce.procurarEmpresa("Apple"));
		
		System.out.println();
		
		Funcionario f1 = new Funcionario("Murilo", "123","123", "9090", e1);
		Funcionario f2 = new Funcionario("Beatriz", "000","777", "9191", e2);
		Funcionario f3 = new Funcionario("Cleiton", "444","555", "9292", e3);
		
		RegraNegocioFuncionario cf = new RegraNegocioFuncionario();
		
		cf.cadastrarFuncionario(f1);
		cf.cadastrarFuncionario(f2);
		cf.adicionarPorPosicao(f3, 1);
		
		System.out.println("Lista de Funcionarios: "+ cf.listarFuncionarios());
		
		cf.removerPorPorsicao(0);
		
		System.out.println("Lista de Funcionarios: "+ cf.listarFuncionarios());
		
		System.out.println("Procurar por funcionario: "+ cf.procurarFuncionario("Cleiton"));
		
	}

}
