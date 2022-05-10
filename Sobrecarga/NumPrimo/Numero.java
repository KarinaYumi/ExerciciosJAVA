
public class Numero {
		
	//VERIFICAÇÃO NÚMERO PAR
	
	public boolean par (int num) {
		return num%2 == 0;
	}
	
	//VERIFICAÇÃO NÚMEROS PARES
	
	public boolean[] par (int[] numeros) {
		
		boolean[] resultado = new boolean[numeros.length];
	
	for(int i = 0; i < resultado.length; i++) {
		resultado[i] = par(numeros[i]); 
	}
		return resultado;
	}
	
	//VERIFICAÇÃO NÚMERO PRIMO
	
	public boolean primo (int num) {
		int divisores = 1;
		for(int i = 1; i<num; i++) {
			if(num%1 == 0) {
			divisores++;
			}
		} return divisores == 2;
	}
	
	public boolean[] primo(int[] numeros) {
		boolean[] resultados = new boolean[numeros.length];
		
		for(int i = 0; i < numeros.length; i++) {
			resultados[i] = primo(numeros[i]);
		}
		
		return resultados;
	}
}
