package vetor;

import java.util.Scanner;

public class vetor1 {
	
public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
    int notas[] = new int[3];
    int soma;
    double media;

    for (int i = 1; i <=10; i++) {
        soma = 0;
        System.out.println("Digite a primeira nota");
        notas[0] = in.nextInt();
        System.out.println("Digite a Segunda nota");
        notas[1] = in.nextInt();
        System.out.println("Digite a Terceira nota");
        notas[2] = in.nextInt();
    for(int x=0; x <3; x++) {
        soma = soma + notas[i];
        }
        System.out.println("A soma das notas foi: "+soma);
        media = soma / 3;
        System.out.println("E a MÉDIA da "+i+"° pessoa é: "+media);
    	}
	}
}
