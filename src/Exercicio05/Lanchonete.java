package Exercicio05;

public class Lanchonete {
	
	private int cod;
	private int qnt;
	
	public Lanchonete(int cod, int qnt) {
		super();
		this.cod = cod;
		this.qnt = qnt;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		if(cod >= 100 || cod <= 105)
		this.cod = cod;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		if(qnt > 0)
		this.qnt = qnt;
	}
	
	public String mostrarValor() {
		StringBuilder builder = new StringBuilder();
		if(getCod() == 100) {
			builder.append("Cachorro Quente = R$" + (getQnt() * 1.20));
		}else if(getCod() == 101) {
			builder.append("Bauru Simples = R$" + (getQnt() * 1.30));
		}else if(getCod() == 102) {
			builder.append("Bauru com ovo = R$" + (getQnt() * 1.50));
		}else if(getCod() == 103) {
			builder.append("Hambúrguer = R$" + (getQnt() * 1.20));
		}else if(getCod() == 104) {
			builder.append("Cheeseburguer = R$" + (getQnt() * 1.30));
		}else if(getCod() == 105) {
			builder.append("Refrigerante = R$" + (getQnt() * 1));
		}
		return builder.toString();
	}
	
}
