import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		figura Figura = new figura();
		
		System.out.println("Digite a altura da figura:");
		Figura.setAltura(in.nextInt());
		
		System.out.println("Digite a largura da figura:");
		Figura.setLargura(in.nextInt());
		
		Figura.calcularArea();
		Figura.exibirArea();

	
	//TRIANGULO
	triangulo Triangulo = new triangulo();
	
	System.out.println("Digite a altura do triângulo:");
	Triangulo.setAltura(in.nextInt());
	
	System.out.println("Digite o valor da base do triângulo");
	Triangulo.setBase(in.nextInt());
	
	Triangulo.calcularArea();
	Triangulo.exibirArea();
	
	//LOSANGO
	losango Losango = new losango();
	
	System.out.println("Digite a diagonal MAIOR do losango:");
	Losango.setDiagonalMaior(in.nextInt());
	
	System.out.println("Digite a diagonal MENOR do losango");
	Losango.setDiagonalMenor(in.nextInt());
	
	Losango.calcularArea();
	Losango.exibirArea();

	//RETANGULO
	retangulo Retangulo = new retangulo();
	
	System.out.println("Digite a altura do retângulo:");
	Retangulo.setAltura(in.nextInt());
	
	System.out.println("Digite a base da retângulo:");
	Retangulo.setLargura(in.nextInt());
	
	Retangulo.calcularArea();
	Retangulo.exibirArea();
	
	//QUADRADO
	quadrado Quadrado = new quadrado();
	
	System.out.println("Digite a altura do quadrado:");
	Quadrado.setAltura(in.nextInt());
	
	System.out.println("Digite a base da quadrado:");
	Quadrado.setLargura(in.nextInt());
	
	Quadrado.calcularArea();
	Quadrado.exibirArea();

	}
}
