package polimorfismo_exerciciofixacao;

public class Ingresso {
	
	double valor;
	String tipoIngresso;
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getTipoIngresso() {
		return tipoIngresso;
	}
	
	public void setTipoIngresso(String tipoIngresso) {
		this.tipoIngresso = tipoIngresso;
	}
	
	public void imprimirDados() {
		System.out.println("O valor do ingresso é"+this.getValor());
	}
	
}
