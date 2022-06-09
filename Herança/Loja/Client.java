
public class Client {
	
	private String Nome;
	private int Idade;
	private String Endereco;
	private double Valor_Pedido;
	private double Desconto;

	// GET | SET
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public int getIdade() {
		return Idade;
	}
	
	public void setIdade(int idade) {
		Idade = idade;
	}
	
	public String getEndereco() {
		return Endereco;
	}
	
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	
	public double getValor_Pedido() {
		return Valor_Pedido;
	}
	
	public void setValor_Pedido(double valor_Pedido) {
		Valor_Pedido = valor_Pedido;
	}
	
	public double getDesconto() {
		return Desconto;
	}
	public void setDesconto(double desconto) {
		Desconto = desconto;
	}
	
	//MÉTODO
	
	public double calculaDesconto() {
		return (this.Valor_Pedido - (this.Valor_Pedido * 0.10));
	}
}
