package app;

public class Main {

	public static void main(String[] args) {
		Conta C1 = new ContaCorrente(0001, 01, 10000, "Karina Yumi");	
		Conta C2 = new ContaPoupanca(0002, 01, 100, "Lorena Araujo");
		Conta C3 = new ContaPremium(0003, 01, 19850, "Gabriel Goes", 100000);
		
		System.out.println("Conta 1");
		C1.sacar(0);
		C1.depositar(0);
		C1.infoConta();
		System.out.println("");
		System.out.println("Conta 2");
		C2.sacar(0);
		C2.depositar(0);
		C2.infoConta();
		System.out.println("");
		System.out.println("Conta 3");
		C3.sacar(0);
		C3.depositar(0);
		C3.infoConta();
		
	}

}
