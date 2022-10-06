package Exercicio07;

public class Pessoa {
	
	private String nome;
	private int idade;
	private float peso;
	private float altura;
	
	public Pessoa(String nome, int idade, float peso, float altura) {
		this.altura = altura;
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 0)
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if(idade > 0)
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		if(peso > 0)
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		if(altura > 0)
		this.altura = altura;
	}
	
	public void envelhecer() {
		if(getIdade() < 21) {
			setIdade(getIdade()+1);
			setAltura(getAltura()+0.05f);
		}else
		setIdade(getIdade()+1);
		
	}
	
	public void engordar() {
		setPeso(getPeso()+1);
	}
	
	public void emagrecer() {
		setPeso(getPeso()-1);
	}
	
	public void crescer() {
		setAltura(getAltura()+1);
	}

	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", idade=");
		builder.append(idade);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", altura=");
		builder.append(altura);
		builder.append("]");
		return builder.toString();
	}
	
}
