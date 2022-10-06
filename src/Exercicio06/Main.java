package Exercicio06;

public class Main {

	public static void main(String[] args) {
		
		Quadrado quad = new Quadrado();
		
		quad.mudarValor(10);
		System.out.println(quad.retornarValor());
		System.out.println(quad.calcularArea());
	}

}
