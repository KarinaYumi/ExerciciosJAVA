import java.util.Scanner;
public class Main {
	
	public static void main(String[]args) {
	Scanner in = new Scanner(System.in);
	Client client = new Client();
	
	System.out.println("Digite o nome do cliente:");
	client.setNome(in.next());
	
	System.out.println("Digite a idade do cliente");
	client.setIdade(in.nextInt());
	
	System.out.println("Digite o valor do pedido: ");
	client.setValor_Pedido(in.nextDouble());
	
	System.out.println(client.getNome()+ ", o valor total de sua compra foi de: "+client.calculaDesconto());
	
	// CLIENT PREMIUM
	
	ClientPremium clientPremium = new ClientPremium();

	System.out.println("\nDigite o nome do cliente:");
	clientPremium.setNome(in.next());
	
	System.out.println("Digite a idade do cliente");
	clientPremium.setIdade(in.nextInt());
	
	System.out.println("Digite o valor do pedido: ");
	clientPremium.setValor_Pedido(in.nextDouble());
	
	System.out.println("\n"+clientPremium.getNome()+", o valor total de sua compra (com desconto) foi de: " +clientPremium.calculaDesconto());
	}
}