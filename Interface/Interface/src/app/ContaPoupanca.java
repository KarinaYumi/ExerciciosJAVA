package app;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int numero, int agencia, double saldo, String titularConta) {
		super(numero, agencia, saldo, titularConta);
	}
	
	public void rendimentoPoupanca() {
		double rendimento = 0.09;
		double resultado = 0;
		resultado = super.getSaldo() * rendimento;
		super.setSaldo(resultado);  
	}
	

}
