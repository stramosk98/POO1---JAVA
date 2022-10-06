package Exercicio02;

public class Num {
	
	private int n1;
	private int n2;
	
	public Num(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public String mostraIntervalo() {
		StringBuilder saida = new StringBuilder();
		if(getN1() > getN2()) {
			saida.append("O segundo número é menor que o primeiro, portanto serão invertidos\n");
		int aux = getN1();
			setN1(getN2());
			setN2(aux);
		}
		
		for(int i = getN1() +1; i < getN2(); i++) {
			saida.append(i);
			saida.append(" | ");
		}
		return saida.toString();	
	}
}
