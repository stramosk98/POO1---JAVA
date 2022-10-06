package Exercicio06;

public class Quadrado {
	
	private float tamanhoLado;

	public float getTamanhoLado() {
		return tamanhoLado;
	}

	public void setTamanhoLado(float tamanhoLado) {
		this.tamanhoLado = tamanhoLado;
	}
	
	public void mudarValor(float mudar) {
		setTamanhoLado(mudar);
	}
	
	public float retornarValor() {
		return getTamanhoLado();
		
	}
	
	public float calcularArea() {
		float area;
		area = getTamanhoLado() * getTamanhoLado();
		return area;
	}
}
