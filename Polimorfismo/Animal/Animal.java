public class Animal {
	
	String cor, nome, tamanho;
	
	
	// GET | SET
	
	public String getCor() {
		return  cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getNome() {
		return  nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTamanho() {
		return  tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	//METODOS
	
	public String Correr() {
		return ""; 
	}
	
	public String Alimentar() {
		return "";
	}
	
	public String Dormir() {
		return "";
	}
	public String EmitirSom() {
		return "";
	}
	public void CaracteristicasAtividades() {
		System.out.println("------------------------\n"+Correr()+"\n"+Alimentar()+"\n"+Dormir()+EmitirSom());
	}
	public void CaracteristicasPessoais() {
		System.out.println("Nome: "+getNome()+"\nCor: "+getCor()+"\nTamanho: "+getTamanho());
	}
}