package Exercicio04;

public class HorasTrabalho {
	
	private float ganhoHora;
	private float horasMes;
	
	public HorasTrabalho(float ganhoHora, float horasMes) {
		super();
		this.ganhoHora = ganhoHora;
		this.horasMes = horasMes;
	}

	public float getGanhoHora() {
		return ganhoHora;
	}

	public void setGanhoHora(float ganhoHora) {
		if(ganhoHora > 0)
		this.ganhoHora = ganhoHora;
	}

	public float getHorasMes() {
		return horasMes;
	}

	public void setHorasMes(float horasMes) {
		if(horasMes > 0)
		this.horasMes = horasMes;
	}
	
	public float mostrarSalBruto() {
		float sal = (getHorasMes() * getGanhoHora());
		return sal;
	}
	
	public float descontoInss() {
		float inss = ((getHorasMes() * getGanhoHora()) * 0.08f);
		return inss;
	}
	
	public float descontoIr() {
		float ir = ((getHorasMes() * getGanhoHora()) * 0.11f);
		return ir;
	}
	
	public float descontoSind() {
		float sind = ((getHorasMes() * getGanhoHora()) * 0.05f);
		return sind;
	}
	
	public float mostrarSalLiquido() {
		float inss = ((getHorasMes() * getGanhoHora()) * 0.08f);
		float sind = ((getHorasMes() * getGanhoHora()) * 0.05f);
		float ir = ((getHorasMes() * getGanhoHora()) * 0.11f);
		float salLqd = ((getHorasMes() * getGanhoHora()) - (inss + sind + ir));
		return salLqd;
	}

	public String toString() {
		return "HorasTrabalho [ganhoHora=" + ganhoHora + ", horasMes=" + horasMes + "\n mostrarSalBruto()=" + mostrarSalBruto() + "\n descontoInss()="
				+ descontoInss() + "\n descontoIr()=" + descontoIr() + "\n descontoSind()=" + descontoSind()
				+ "\n mostrarSalLiquido()=" + mostrarSalLiquido() + "]";
	}
	
	
	
	
	
}
