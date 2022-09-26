public class Serie extends conteudo {
	
	private int duracao, qntEps, qntTemps;
	
	public Serie(String Categoria, String Titulo, int duracao, int qntEps, int qntTemps) {
		super(Categoria, Titulo);
		this.duracao = duracao;
		this.qntEps = qntEps;
		this.qntTemps = qntTemps;
	}
	
	//GET | SET
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public int getDuracao() {
		return this.duracao;
	}
	
	public void setQntEps(int qntEps) {
		this.qntEps = qntEps;
	}
	
	public int getQntEps() {
		return this.duracao;
	}
	
	public void setQntTemps(int qntTemps) {
		this.qntTemps = qntTemps;
	}
	
	public int getQntqTemps() {
		return this.qntTemps;
	}
	
	@Override
	public void Descricao() {
		System.out.println("-------------------------");
		System.out.println("Categoria: "+super.getCategoria());
		System.out.println("Nome: "+super.getTitulo());
		System.out.println("Duração Ep: "+this.duracao+"min");
		System.out.println("Quantidade de Episódios: "+this.qntEps);
		System.out.println("Quantidade de temporadas: "+this.qntTemps+"\n");
	}
	
}