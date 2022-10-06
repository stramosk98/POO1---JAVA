package Exercicio10;

public class Televisor {
	
	private int volume;
	private int canal;
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume > -1 && volume < 101)
		this.volume = volume;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if(canal > 0)
		this.canal = canal;
	}
	
	public void aumentarVolume() {
		setVolume(getVolume()+5);
	}
	public void diminuirVolume() {
		setVolume(getVolume()-5);
	}
	public String mostrarVolume() {
		return "Volume: " + getVolume();
	}
	public void mudarCanal(int canal) {
		setCanal(canal);
	}
	
	public String mostrarCanal() {
	return "Canal: " + getCanal();
}
}
