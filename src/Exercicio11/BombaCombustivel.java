package Exercicio11;

public class BombaCombustivel {
	
	private String tipoCombustivel;
	private float valorLitro;
	private float qntLitro;
	
	public BombaCombustivel(String tipoCombustivel, float valorLitro, float qntLitro) {
		super();
		this.tipoCombustivel = tipoCombustivel;
		this.valorLitro = valorLitro;
		this.qntLitro = qntLitro;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		if(tipoCombustivel.length() > 0)
		this.tipoCombustivel = tipoCombustivel;
	}

	public float getValorLitro() {
		return valorLitro;
	}

	public void setValorLitro(float valorLitro) {
		if(valorLitro > 0)
		this.valorLitro = valorLitro;
	}

	public float getQntLitro() {
		return qntLitro;
	}

	public void setQntLitro(float qntLitro) {
		if(qntLitro >= 0)
		this.qntLitro = qntLitro;
	}
	
	public float abastecerPorValor(float v) {
		float sum = (v / getValorLitro());
		if(sum <= getQntLitro()) {
			setQntLitro(getQntLitro() - sum);
		}
		return sum;
	}
	
	public float abastecerPorLitro(float l) {
		float sum = 0;
		if(l <= getQntLitro()) {
			sum = (l * getValorLitro());
			setQntLitro(getQntLitro() - l);
		}
		
		return sum;
	}
	
	public void alterarValor(float valor) {
		setValorLitro(valor);
	}
	
	public void alterarCombustivel(String tipo) {
		setTipoCombustivel(tipo);
	}
	
	public void alterarQuantidadeCombustivel(float qnt) {
		setQntLitro(qnt);
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaCombustivel [tipoCombustivel=");
		builder.append(tipoCombustivel);
		builder.append(", valorLitro=");
		builder.append(valorLitro);
		builder.append(", qntLitro=");
		builder.append(qntLitro);
		builder.append("]");
		return builder.toString();
	}
	
	
}
