package Exercicio01;

public class Nome {
	
	private String nome;
	private String sobrenome;
	
	public Nome(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nome Completo: ");
		builder.append(nome + " " + sobrenome);
		return builder.toString();
	}
	
	
	
}
