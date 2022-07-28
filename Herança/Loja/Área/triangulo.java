
public class triangulo extends figura {
	
	private int base;
	
	//GET SET
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	
	//MÉTODOS
	public int calcularArea() {
		return setArea((this.getAltura()*this.getBase()/2));
	}
	
	public void exibirArea() {
		System.out.println("A área do triângulo é :"+getArea()+"\n----------------------------------");
	}
}
