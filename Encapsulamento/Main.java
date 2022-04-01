public class Main {

	public static void main(String[] args) {
		// PRIMEIRO ANIMAL
		Animal primeiroAnimal = new Animal();
		primeiroAnimal.setEspecie("Mamífero");
		primeiroAnimal.setNome("Tamanduá");
		primeiroAnimal.setQuantPatas(4);
		primeiroAnimal.setPeso(30);
		
		System.out.println("------ 1° ANIMAL ------");
		System.out.println("\nESPECIE: "+primeiroAnimal.getEspecie()+"\nNOME: "+primeiroAnimal.getNome()+"\nQTD_PATAS: "+primeiroAnimal.getQuantPatas()+"\nPESO: "+primeiroAnimal.getPeso()+"KG\n");
		
		// SEGUNDO ANIMAL
		System.out.println("------ 2° ANIMAL ------");
		Animal segundoAnimal = new Animal("Inseto", "Borboleta", 6, 0.5);
		System.out.println("\nESPECIE: "+segundoAnimal.getEspecie()+"\nNOME: "+segundoAnimal.getNome()+"\nQTD_PATAS: "+segundoAnimal.getQuantPatas()+"\nPESO: "+segundoAnimal.getPeso()+"KG \n");
		
		// TERCEIRO ANIMAL
		System.out.println("------ 3° ANIMAL ------");
		Animal terceiroAnimal = new Animal("Ave", "Avestruz", 2, 100);
		System.out.println("\nESPECIE: "+terceiroAnimal.getEspecie()+"\nNOME: "+terceiroAnimal.getNome()+"\nQTD_PATAS: "+terceiroAnimal.getQuantPatas()+"\nPESO: "+terceiroAnimal.getPeso()+"KG");
	}
}
