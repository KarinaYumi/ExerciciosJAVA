
public class Filme {
	
	private String TituloFilme;
	private double DuracaoemMinutos, DuracaoemHoras;
	
	public Filme () {}
	public Filme(String TituloFilme, double DuracaoemMinutos) {
		this.TituloFilme = TituloFilme;
		this.DuracaoemMinutos = DuracaoemMinutos;
		
	}
	
	//SET'S e GET'S
	
	public String getTituloFilme() {
		return this.TituloFilme;
	}
	public void setTituloFilme(String TituloFilme) {
		this.TituloFilme = TituloFilme;
	}
	
	public double getDuracaoemMinutos() {
		return this.DuracaoemMinutos;
	}
	public void setDuracaoemMinutos(double DuracaoemMinutos) {
		this.DuracaoemMinutos = DuracaoemMinutos;
	}
	
	public double getDuracaoemHoras() {
		return this.DuracaoemHoras;
	}
	public void setDuracaoemHoras(double DuracaoemHoras) {
		this.DuracaoemHoras = DuracaoemHoras;
	}
	
	//Métodos
	
	public void exibirDuracaoEmHoras() {
		this.DuracaoemHoras = (DuracaoemMinutos/60);
	}
	
}
