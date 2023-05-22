package ex02;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private String rg;
	private String telefone;
	private Empresa empresa;
	
	public Funcionario() {
		super();
	}

	public Funcionario(String nome, String cpf, String rg, String telefone, Empresa empresa) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.telefone = telefone;
		this.empresa = empresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", telefone=" + telefone + ", empresa="
				+ empresa + "]";
	}
	
	

}
