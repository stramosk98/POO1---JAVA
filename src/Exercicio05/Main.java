package Exercicio05;

public class Main {

	public static void main(String[] args) {
		
		Lanchonete lanc = new Lanchonete(100, 5); //(C�D_ITEM, QUANTIDADE)
		Lanchonete lanc1 = new Lanchonete(105, 7);
		System.out.println(lanc.mostrarValor());
		System.out.println(lanc1.mostrarValor());
	}

}
