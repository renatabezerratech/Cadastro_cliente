package objetos;

public class Pessoas {
	private String cpf;
	private String nome;
	private String telefone;
	private String email;
	private String nascimento;
	private Endereco endereco;
	
	public Pessoas(String cpf, String nome, String telefone, String email, String nascimento, Endereco endereco) {
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.nascimento = nascimento;
		this.endereco = endereco;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNascimento() {
		return nascimento;
	}

	@Override
	public String toString() {
		return "Pessoas [cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email
				+ ", nascimento=" + nascimento + ", endereco=" + endereco + "]";
	}
	
}


