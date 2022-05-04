
public class Funcionario {
	private String nome;
	private Double salario;
	private char sexo;
	private int idade;
	private Departamento Dep;
	
	//GET
	public String getNome() {
		return this.nome;
	}
	public double getSalario() {
		return this.salario;
	}
	public char getSexo() {
		return this.sexo;
	}
	public int getIdade() {
		return this.idade;
	}
	public Departamento getDep() {
		return this.Dep;
	}
	
	//SET
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setDep(Departamento Dep) {
		this.Dep = Dep;
	}
	
	//CONSTRUTORES
	
	public Funcionario() {
		this.nome ="FuncPadrap";
		this.Dep=null;
		this.idade = 0;
		this.salario = 0.0;
		this.sexo = 'x';
	}
	
	public Funcionario(String nome, Departamento Dep, int idade, double salario, char sexo) {
		this.nome = nome;
		this.Dep = Dep;
		this.idade = idade;
		this.salario = salario;
	}
}
