package app;

public class ContaPremium extends Conta implements Tributo{
    private double credito;
	
	public ContaPremium(int numero, int agencia, double saldo, String titularConta, double credito) {
		super(numero, agencia, saldo, titularConta);
		this.credito = credito;
	}
	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public double calcularImposto() {
		double valorImposto = super.getSaldo() * 0.01;
		return valorImposto;
	}
	@Override
	public void infoConta() {
		System.out.println("Nome Titular: "+super.getTitularConta());
		System.out.println("Numero conta: "+super.getNumero());
		System.out.println("Agencia: "+super.getAgencia());
		System.out.println("Saldo em conta: "+super.getSaldo());
		System.out.println("Credito em conta: "+this.credito);
		System.out.println("Tributo: "+calcularImposto());
	}
	
}
