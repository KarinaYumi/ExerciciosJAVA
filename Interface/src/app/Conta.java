package app;

public abstract class Conta {
	private int Numero;
	private int Agencia;
	private double saldo;
	private String TitularConta;
	
	public Conta(int numero, int agencia, double saldo, String titularConta) {
		this.Numero = numero;
		this.Agencia = agencia;
		this.saldo = saldo;
		this.TitularConta = titularConta;
	}

	public int getNumero() {
		return this.Numero;
	}

	public void setNumero(int numero) {
		this.Numero = numero;
	}

	public int getAgencia() {
		return this.Agencia;
	}

	public void setAgencia(int agencia) {
		this.Agencia = agencia;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitularConta() {
		return this.TitularConta;
	}

	public void setTitularConta(String titularConta) {
		this.TitularConta = titularConta;
	}
	
	public void sacar(double valor) {
		if(valor >= this.saldo) {
			System.out.println("Valor insuficiente para saque");
		}else {
			this.saldo -= valor;
			System.out.println("Valor R$"+valor+" Sacado com sucesso, valor restante conta R$"+this.saldo);
		}
	}
	public void depositar(double valor){
			this.saldo += valor;
			System.out.println("Valor R$"+valor+" depositado com sucesso, valor em conta R$"+this.saldo);
	}
	public void infoConta() {
		System.out.println("Nome Titular: "+this.TitularConta);
		System.out.println("Numero conta: "+this.Numero);
		System.out.println("Agencia: "+this.Agencia);
		System.out.println("Saldo em conta: "+this.saldo);
	}
	
	
}
