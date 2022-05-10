
	public class Main {

		public static void main(String[] args) {
			Numero verificar = new Numero();
			
			int[] numero = {3, 17, 11, 8, 9, 20};
			
			System.out.println("Teste dos valores inseridos no vetor\n----------------------");
			System.out.println("VALORES PRIMOS = false\n----------------------");
			
			boolean[] pares = verificar.par(numero);
			
			for(int i = 0; i < pares.length; i++) {
				System.out.println(pares[i]);
			}
		}
	}
