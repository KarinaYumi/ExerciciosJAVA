
public class Lucros {
	
	private double soma;
	
	public Lucros(double soma) {
		this.soma = soma;
	}
	// GET | SET
	
	public double getSoma() {
		return soma;
	}

	public void setSoma(double Soma) {
		soma = Soma;
	}
	
	//M�TODO
	public void registra(Conta c) {
		this.soma+=c.getSaldo();
	}
	
}
