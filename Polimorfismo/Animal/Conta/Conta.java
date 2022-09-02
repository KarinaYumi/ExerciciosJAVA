
public class Conta {
	
	private String nome, cpf, numeroConta;
	private double saldo;
	
	//CONSTRUTOR
	public Conta(String Nome, String CPF, String numeroConta, double saldo) {
		this.nome = Nome;
		this.cpf = CPF;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	// GET | SET
	public void setNome(String Nome) {
		nome = Nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCPF(String CPF) {
		cpf = CPF;
	}
	
	public String getCPF() {
		return cpf;
	}
	
	public void setNumeroConta(String NumeroConta) {
		numeroConta = NumeroConta;
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	
	public void setSaldo(double Saldo) {
		saldo = Saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	// MÉTODOS
	
	public double depositar(double quantia) {
		return (saldo+=quantia);
	}
	
	public void sacar(double quantia) {
		if (quantia <= saldo) {
			saldo -= quantia;
		}
	}
	
	public void imprimir() {
		System.out.println("\nTitular da Conta: "+this.getNome());
		System.out.println("CPF: "+this.getCPF());
		System.out.println("Número da Conta: "+this.getNumeroConta());
		System.out.println("SALDO: "+this.getSaldo()+"\n----------------------");
	}
	
}
