import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		conteudo catalogo[] = new conteudo[10];
		
		catalogo[0] = new Filme("Filme", "A culpa � das estrelas", 140);
		catalogo[0].Descricao();
		catalogo[1] = new Serie("S�rie", "The 100", 40, 12, 2);
		catalogo[1].Descricao();
		catalogo[2] = new Filme("Filme", "Efeito Borboleta", 210);
		catalogo[2].Descricao();
		catalogo[3] = new Serie("S�rie", "The Walking Dead", 60, 15, 8);
		catalogo[3].Descricao();
		catalogo[4] = new Filme("Filme", "Forest Gump", 200);
		catalogo[4].Descricao();
		catalogo[5] = new Serie("S�rie", "Sabrina", 52, 8, 2);
		catalogo[5].Descricao();
		catalogo[6] = new Filme("Filme", "O Bombardeiro", 225);
		catalogo[6].Descricao();
		catalogo[7] = new Serie("S�rie", "Sandman", 62, 11, 1);
		catalogo[7].Descricao();
		catalogo[8] = new Filme("Filme", "O amanh�", 175);
		catalogo[8].Descricao();
		catalogo[9] = new Serie("S�rie", "Flash", 53, 23, 5);
		catalogo[9].Descricao();
		
	}

}