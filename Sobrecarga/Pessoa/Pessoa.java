
public class Pessoa {
	private String nome, frase;
	private double altura;
	
	public void Pessoa() {
		
	}
	public void Pessoa(String nome, String frase, double altura) {
		this.altura = altura;
		this.frase = frase;
		this.nome = nome;
	}
	
	//SET 
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setFrase(String frase) {
		this.nome = frase;
	}
	
	//GET
	
	public String getNome() {
		return this.nome;
	}
	public String getFrase() {
		return this.frase;
	}
	public double getAltura() {
		return this.altura;
	}
	
	//MÉTODOS
	
	public void imprimir() {
		System.out.println("\n------ RESULTADOS ------");
		System.out.println("\nNome: "+this.getNome()+"\nAltura: "+this.getAltura()+"m");
	}
	
	public void frasePessoa() {
		System.out.println("Meu nome é: "+this.getNome()+" e tenho "+this.getAltura()+"m");
	}
}
