package Exercicio03;

public class Num {
	private float n1;
	private float n2;
	private String op;
	
	public Num(float n1, String op, float n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.op = op;
	}
	
	public float getN1() {
		return n1;
	}

	public void setN1(float n1) {
		this.n1 = n1;
	}

	public float getN2() {
		return n2;
	}

	public void setN2(float n2) {
		this.n2 = n2;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))
		this.op = op;
	}

	public String mostrarCalculo() {
		StringBuilder saida = new StringBuilder();
		
		if(getOp().equals("+")) {
			saida.append(getN1() + getN2());
		}else if(getOp().equals("-")) {
			saida.append(getN1() - getN2());
		}else if(getOp().equals("*")) {
			saida.append(getN1() * getN2());
		}else if(getOp().equals("/")) {
			saida.append(getN1() / getN2());
		}
		
		return saida.toString();
		
	}
	
}
