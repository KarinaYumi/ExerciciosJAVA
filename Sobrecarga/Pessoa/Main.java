import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Digite seu nome:");
		pessoa.setNome(in.nextLine());
		
		System.out.println("Digite sua altura: ");
		pessoa.setAltura(in.nextDouble());

		pessoa.imprimir();
		pessoa.frasePessoa();
	}
}
