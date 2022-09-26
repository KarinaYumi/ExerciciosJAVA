
public class ContaCorrente extends Conta{
	
	private double tarifamensal = 12.5;
	
	//CONSTRUTOR
	public ContaCorrente(String Nome, String CPF, String numeroConta, double saldo) {
		super(Nome, CPF, numeroConta, saldo);
	}
	
	public void setTarifaMensa(double TarifaMensal) {
		tarifamensal = TarifaMensal;
	}
	
}
