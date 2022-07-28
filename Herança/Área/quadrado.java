
public class quadrado extends figura {
	
	@Override
	public int calcularArea() {
		return setArea((getAltura())*getLargura());
	}
	
	public void exibirArea() {
		System.out.println("A área do quadrado é: "+getArea()+"\n----------------------------------");
	}	

}
