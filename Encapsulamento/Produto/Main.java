package Produto;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Produto produto = new Produto();
		
		System.out.print("Informe o nome do PRODUTO: ");
		produto.setNomeProduto(in.next());
		
		System.out.print("Informe o preço de CUSTO: ");
		produto.setPrecoCusto(in.nextDouble());
		
		System.out.print("Informe o preço de VENDA: ");
		produto.setPrecoVenda(in.nextDouble());
		
		produto.calcularMargemLucro();
		System.out.println("\nMargem de LUCRO: R$"+produto.getMargemLucro());
		System.out.println("Percentual LUCRO:"+produto.getMargemLucroPorcentagem()+"%");
		
	}
}