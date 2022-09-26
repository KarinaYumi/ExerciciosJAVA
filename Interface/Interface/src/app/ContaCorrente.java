package app;

public class ContaCorrente extends Conta implements Tributo {

	public ContaCorrente(int numero, int agencia, double saldo, String titularConta) {
		super(numero, agencia, saldo, titularConta);
	}
	
	public double calcularImposto() {
		double valorImposto = super.getSaldo() * 0.02;
		return valorImposto;
	}
	
	@Override
	public void sacar(double valor) {
		if(valor >= super.getSaldo()) {
			System.out.println("Valor insuficiente para saque");
		}else {
			double taxa = 5;
			double resultado = 0;
			resultado = super.getSaldo() - (valor + taxa);
			super.setSaldo(resultado) ;
			System.out.println("Valor R$"+valor+" Sacado com sucesso, seu saque teve uma taxa de R$"+taxa+", valor restante conta R$"+super.getSaldo());
		}
	}
	@Override
	public void infoConta() {
		System.out.println("Nome Titular: "+super.getTitularConta());
		System.out.println("Numero conta: "+super.getNumero());
		System.out.println("Agencia: "+super.getAgencia());
		System.out.println("Saldo em conta: "+super.getSaldo());
		System.out.println("Tributo: "+calcularImposto());
	}
	
	
}
