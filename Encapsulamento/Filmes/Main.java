
public class Main {

	public static void main(String[] args) {
		
		Filme filme01 = new Filme();
		
		filme01.setTituloFilme("Os Vingadores");
		filme01.setDuracaoemMinutos(142);
		
		filme01.exibirDuracaoEmHoras();
		System.out.println("A duração do filme"+filme01.getTituloFilme()+"em horas é: "+filme01.getDuracaoemHoras()+"h");
		
		// 2° FILME
		
		Filme filme02 = new Filme("Hotel Transilvânia", 93);
		
		filme02.exibirDuracaoEmHoras();
		System.out.println("\nA duração do filme "+filme02.getTituloFilme()+" em horas é: "+filme02.getDuracaoemHoras()+"h");
		
		System.out.println("\nOs filmes em cartaz são: "+filme01.getTituloFilme()+" e "+filme02.getTituloFilme());
		
		System.out.println("\n -------------Outros Filmes------------");
		
		// 3° FILME
		
		Filme filme03 = new Filme("Velozes e Furiosos ", 180);
		
		filme03.exibirDuracaoEmHoras();
		System.out.println("\nA duração do filme "+filme03.getTituloFilme()+" em horas é: "+filme03.getDuracaoemHoras()+"h");
		
		
		// 4° FILME
		
		Filme filme04 = new Filme("Anny em USA", 120);
		
		filme04.exibirDuracaoEmHoras();
		System.out.println("\nA duração do filme "+filme04.getTituloFilme()+" em horas é: "+filme04.getDuracaoemHoras()+"h");
		
		// 5° FILME
		
		Filme filme05 = new Filme("Forest Gump", 200);
		
		filme05.exibirDuracaoEmHoras();
		System.out.println("\nA duração do filme "+filme05.getTituloFilme()+" em horas é: "+filme05.getDuracaoemHoras()+"h");
		
		// 6° FILME
		
		Filme filme06 = new Filme("Como eu era Antes de Você", 180);
		
		filme06.exibirDuracaoEmHoras();
		System.out.println("\nA duração do filme "+filme06.getTituloFilme()+" em horas é: "+filme06.getDuracaoemHoras()+"h");
		
		// 7° FILME
		
		Filme filme07 = new Filme("A cinco passos de Você", 120);
		
		filme07.exibirDuracaoEmHoras();
		System.out.println("\nA duração do filme "+filme07.getTituloFilme()+" em horas é: "+filme07.getDuracaoemHoras()+"h");
	}
}
