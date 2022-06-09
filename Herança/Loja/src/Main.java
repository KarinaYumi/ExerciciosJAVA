

public class Main {
	
	public static void main(String[]args) {
		
	Client Client = new Client();
	Client.setNome("Lorena");
	Client.setIdade(78);
	Client.setEndereco("Rua dos Carros, 154");
	Client.setValor_Pedido(500);
	
	System.out.println(Client.getNome()+ ", o valor total de sua compra foi de: "+Client.calculaDesconto());
	
	// CLIENT PREMIUM
	
	ClientPremium ClientKarina = new ClientPremium();

	ClientKarina.setNome("Karina");
	ClientKarina.setIdade(16);
	ClientKarina.setEndereco("Rua dos Blocos, 124");
	ClientKarina.setValor_Pedido(200);
	
	System.out.println("\n"+ClientKarina.getNome()+", o valor total de sua compra (com desconto) foi de: " +ClientKarina.calculaDesconto());
	}
}
