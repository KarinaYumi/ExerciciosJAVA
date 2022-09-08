public class Filme extends conteudo {
	
	private int duracao; 
	
	public Filme(String Categoria, String Titulo, int duracao) {
		super(Categoria, Titulo);
		this.duracao = duracao;
	}
	
	// GET | SET
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public int getDuracao() {
		return this.duracao;
	}
	
	@Override
	public void Descricao() {
		System.out.println("-------------------------");
		System.out.println("Categoria: "+super.getCategoria());
		System.out.println("Nome: "+super.getTitulo());
		System.out.println("Duração: "+this.duracao+"min");
	
	}
}
