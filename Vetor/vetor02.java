package vetor;

public class vetor2 {

	public static void main(String[] args) {
		
	int vetor[] = {27,1,54,65,2,7,16,53,12,43};
	int aux;
	
	for(int x=0; x <vetor.length; x++) {
		for(int j=0; j<vetor.length - 1; j++) {
			if(vetor[j] > vetor[j+1]) {
				aux = vetor[j];
				vetor[j] = vetor[j+1];
				vetor[j+1] = aux;
				
				}
			}
		}
		int k = 0;
		while(k <vetor.length) {
			System.out.println(vetor[k] +"");
			k++;
		}
	}
}
