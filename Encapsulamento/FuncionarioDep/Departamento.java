
public class Departamento {
	private int codigo;
	private String nome;
	
	//GET
	public int getCodigo() {
		return this.codigo;
	}
	public String getNome() {
		return this.nome;
	}
	
	//SET

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	//CONSTRUTORES
	public Departamento() {
		this.codigo = 0;
		this.nome = "DepPadrao";
	}
	public Departamento(int codigo, String nome) {
		this.codigo= codigo;
		this.nome = nome;
		}
	}

