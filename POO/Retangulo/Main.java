package ex01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    Retangulo Retangulo1 = new Retangulo();
    Retangulo Retangulo2 = new Retangulo();
    
    Scanner in = new Scanner(System.in);

    System.out.print("Valor da Base do Retangulo: ");
    double base = in.nextDouble();
    System.out.print("Valor da Altura do Retangulo: ");
    double altura = in.nextDouble();
    Retangulo1.calcularArea(base,altura);

    System.out.print("Valor da Base do próximo Retangulo: ");
    base = in.nextDouble();
    System.out.print("Valor da Altura do Retangulo: ");
    altura = in.nextDouble();
    Retangulo2.calcularArea(base,altura);
    System.out.println("FIM DO PROGRAMA!");
    }
}