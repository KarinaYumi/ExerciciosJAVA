import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Funcionario[] funcionarios = new Funcionario[3];
		int i;
		double soma = 0, media = 0;
		
		Scanner recebeNome = new Scanner(System.in);
		Scanner recebeSalario = new Scanner(System.in);
		Scanner recebeIdade = new Scanner(System.in);
		Scanner recebeSexo = new Scanner(System.in);
		Scanner recebeCodDep = new Scanner(System.in);
		Scanner recebeNomeDep = new Scanner(System.in);
		
		System.out.println("Informe os dados dos Funcionários \n");
		
		for(i=0; i<funcionarios.length; i++) {
			
			Funcionario funcionario = new Funcionario();
			
			System.out.println("Informe nome do funcionário "+(i+1));
			funcionario.setNome(recebeNome.nextLine());
			
			System.out.println("Informe salário do funcionário "+(i+1));
			funcionario.setSalario(recebeSalario.nextDouble());
			
			System.out.println("Informe idade do funcionário "+(i+1));
			funcionario.setIdade(recebeIdade.nextInt());
			
			System.out.println("Informe sexo do funcionário "+(i+1));
			funcionario.setSexo(recebeSexo.nextLine().charAt(0));
			
			Departamento departamento = new Departamento();
			
			System.out.println("Informe o Código do Departamento do funcionário "+(i+1));
			departamento.setCodigo(recebeCodDep.nextInt());
			
			System.out.println("Informe o nome do Departamento do funcionário "+(i+1));
			departamento.setNome(recebeNomeDep.nextLine());
			
			funcionario.setDep(departamento);
			
			funcionarios[i]=funcionario;
			
			soma += funcionario.getSalario();
		}
		
		for(i=0; i<funcionarios.length; i++) {
			media =soma/funcionarios.length;
			
			if(funcionarios[i].getSalario()>media) {
				System.out.println("O funcionário "+funcionarios[i].getNome()+" com idade "+funcionarios[i].getIdade()+" do sexo "+ funcionarios[i].getSexo()+" tem o salário "+funcionarios[i].getSalario()+" que é maior que a média salarial");
			}
		}
	}