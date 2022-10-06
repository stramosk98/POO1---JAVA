package Exercicio10;

public class Main {

	public static void main(String[] args) {
		
		Televisor tv = new Televisor();
		tv.aumentarVolume();
		tv.aumentarVolume();
		System.out.println(tv.mostrarVolume());
		tv.diminuirVolume();
		System.out.println(tv.mostrarVolume());
		tv.mudarCanal(5);
		System.out.println(tv.mostrarCanal());
	}

}
