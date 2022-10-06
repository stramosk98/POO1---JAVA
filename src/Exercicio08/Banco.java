package Exercicio08;

public class Banco {
	
	private int numConta;
	private double saldo;
	private String nome;
	
	
	public double getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		if(numConta > 0)
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 2)
		this.nome = nome;
	}
	public void incluirConta() {
		
	}
	public void alterarNome(String nome) {
		setNome(nome);
	}
	public void deposito(double dep) {
		setSaldo(getSaldo() + dep);
	}
	public void saque(double saque) {
		if(getSaldo() >= saque)
		setSaldo(getSaldo() - saque);
	}
	public Banco(int numConta, double saldo, String nome) {
		super();
		this.numConta = numConta;
		this.saldo = saldo;
		this.nome = nome;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banco [numConta=");
		builder.append(numConta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
