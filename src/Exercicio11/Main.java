package Exercicio11;

public class Main {

	public static void main(String[] args) {
		
		BombaCombustivel bc = new BombaCombustivel("Comum", 4.99f, 250);
		
		System.out.println(bc);
		
		bc.alterarCombustivel("Etanol");
		bc.alterarValor(4.75f);
		bc.alterarQuantidadeCombustivel(200);
		System.out.println(bc);
		
		System.out.println(bc.abastecerPorValor(950));
		System.out.println(bc);
	}

}
