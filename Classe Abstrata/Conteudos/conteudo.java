
public abstract class conteudo {
	
	private String Categoria, Titulo;
	
	
//CONSTRUTOR
	public conteudo(String Categoria, String Titulo) {
		this.Categoria = Categoria;
		this.Titulo = Titulo;
	}
		
// GET | SET
	
		public void setCategoria(String Categoria) {
			Categoria = Categoria;
		}
		
		public String getCategoria() {
			return this.Categoria;
		}
		
		public void setTitulo(String Titulo) {
			Titulo = Titulo;
		}
		public String getTitulo() {
			return this.Titulo;
		}
	
//METODOS
	
	public abstract void Descricao();

}
