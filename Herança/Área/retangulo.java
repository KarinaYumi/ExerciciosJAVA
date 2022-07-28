
public class retangulo extends figura{
	
	@Override
	public int calcularArea() {
		return setArea((getAltura())*getLargura());
	}
	
	public void exibirArea() {
		System.out.println("A área do retângulo é: "+getArea()+"\n----------------------------------");
	}	
}

