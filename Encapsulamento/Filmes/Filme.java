
public class Filme {
	
	private String TituloFilme;
	private int DuracaoemMinutos, DuracaoemHoras;
	
	public Filme () {}
	public Filme(String TituloFilme, int DuracaoemMinutos) {
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
	public void setDuracaoemMinutos(int DuracaoemMinutos) {
		this.DuracaoemMinutos = DuracaoemMinutos;
	}
	
	public double getDuracaoemHoras() {
		return this.DuracaoemHoras;
	}
	public void setDuracaoemHoras(int DuracaoemHoras) {
		this.DuracaoemHoras = DuracaoemHoras;
	}
	
	//Métodos
	
	public String exibirDuracaoEmHoras() {
		return (DuracaoemMinutos/60)+"h"+(DuracaoemMinutos%60)+"min";
	}
	
}
