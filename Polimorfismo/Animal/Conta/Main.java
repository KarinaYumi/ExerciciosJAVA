import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Conta conta = new Conta("Melissa", "123.456.789-90", "Ad12", 3500);
		ContaCorrente corrente = new ContaCorrente("Melissa", "123.456.789-90", "Ad12", 1234);
		ContaPoupanca Poupanca = new ContaPoupanca("Melissa", "123.456.789-90", "Ad12", 5460);
		Lucros lucro = new Lucros(0);
		
		// ESCOLHA DO USUÁRIO
		System.out.print("\n[S] - SACAR | [D] - DEPOSITAR: ");
		String opcao = in.next();
		
		if(opcao.equalsIgnoreCase("S")) {
			System.out.println("VALOR SAQUE: ");
			double quantia = in.nextDouble();
			conta.sacar(quantia);
			
		} else if(opcao.equalsIgnoreCase("D")) {
			System.out.println("VALOR DEPOSITO: ");
			double quantia = in.nextDouble();
			conta.depositar(quantia);
		}
		
		conta.imprimir();
		Poupanca.atualizarSaldo();
		Poupanca.imprimir();
		corrente.imprimir();
		lucro.registra(Poupanca);
		
	}
}
