package ex02;

public class Empresa {
	
	private String cnpj;
	private String nome;
	private String telefone;
	
	public Empresa() {
		super();
	}
	
	public Empresa(String cnpj, String nome, String telefone) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Empresa [cnpj=" + cnpj + ", nome=" + nome + ", telefone=" + telefone + "]";
	}

}
