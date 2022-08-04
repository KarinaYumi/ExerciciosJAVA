import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Animal cachorro = new cachorro();
		System.out.println("Digite o nome do cachorro: ");
		cachorro.setNome(in.next());
		System.out.println("Digite a cor do cachorro: ");
		cachorro.setCor(in.next());
		System.out.println("Digite o tamanho do animal: ");
		cachorro.setTamanho(in.next());
		cachorro.CaracteristicasPessoais();
		cachorro.CaracteristicasAtividades();
		
		Animal gato = new gato();
		
		System.out.println("Digite o nome do gato: ");
		gato.setNome(in.next());
		System.out.println("Digite a cor do gato: ");
		gato.setCor(in.next());
		System.out.println("Digite o tamanho do animal: ");
		gato.setTamanho(in.next());
		gato.CaracteristicasPessoais();
		gato.CaracteristicasAtividades();
		
		Animal elefante = new elefante();
		
		System.out.println("\nDigite o nome do elefante: ");
		elefante.setNome(in.next());
		System.out.println("Digite a cor do elefante: ");
		elefante.setCor(in.next());
		System.out.println("Digite o tamanho do animal: ");
		elefante.setTamanho(in.next());
		elefante.CaracteristicasPessoais();
		elefante.CaracteristicasAtividades();
		
	}
}