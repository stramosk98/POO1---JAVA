package Exercicio07;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Antonio", 20, 86, 1.80f);
		System.out.println(p);
		p.envelhecer();
		System.out.println(p);
	}

}
