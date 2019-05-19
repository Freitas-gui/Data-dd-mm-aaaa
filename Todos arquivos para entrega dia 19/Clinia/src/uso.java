import java.util.Scanner;

public class uso {
	public static void main(String args[]) {
	
		int op;
		Funcionario vet[] = new Funcionario[3];
		for(int i=0;i<3;i++) {
			System.out.println("Digite 1 para funcionario: ");
			System.out.println("Digite 2 para chefe: ");
			System.out.println("Digite 3 para diretor: ");
			Scanner scan=new Scanner(System.in);
			op =scan.nextInt();
			
			//dados de Funcionario
			System.out.println("Digite o nome: ");
			String _nome= new Scanner(System.in).nextLine();
			System.out.println("Digite a Identidade: ");
			String _id= new Scanner(System.in).nextLine();
			System.out.println("Data de nascimento: ");
			Data _dtNa = new Data();
			Scanner scan2=new Scanner(System.in);
			System.out.println("Digite o salario: ");
			double _salario = scan2.nextDouble();
			System.out.println("Data de admissao: ");
			Data _dtAd = new Data();
			
			if(op==1) {
				vet[i]=new Funcionario(_nome, _id ,_dtNa,_salario, _dtAd);
			}
			else if(op==2) {
				System.out.println("Digite o departamento: ");
				String _depar= new Scanner(System.in).nextLine();
				vet[i]=new Chefe(_nome, _id ,_dtNa,_salario, _dtAd,_depar);
			}
			else if(op==3) {
				Data _dtPromo = new Data();
				vet[i]=new Diretor(_nome, _id ,_dtNa,_salario, _dtAd,_dtPromo);
			}
			System.out.println("Taxa de reajuste de salario: ");
			vet[i].setSalarioDigita();
		}
		for(int i=0;i<3;i++) {
			System.out.println(""+vet[i].getNome()+" "+vet[i].getSalario()+" "+vet[i].getEmpre());
		}
		


	}
}
