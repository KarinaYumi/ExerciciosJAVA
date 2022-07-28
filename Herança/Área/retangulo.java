
public class retangulo extends figura{
	
	public int calcularArea() {
		return setArea((getAltura())*getLargura());
	}
	
	public void exibirArea() {
		System.out.println("A área do retângulo é: "+getArea()+"\n----------------------------------");
	}	
}

