package polimorfismo_exerciciofixacao;

public class VIP extends Ingresso {
	
	 double valorAdc;
	 
	 @Override
	 public void imprimirDados() {
		 valor = valor+valorAdc;
		 System.out.println("O valor do ingresso VIP é:"+valor);
	 }
	
}
