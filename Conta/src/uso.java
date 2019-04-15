import java.util.Scanner;

public class uso {
	public static void main(String args[]) {
		/*try {
			Conta ct1=new Conta("gui",120);
			Conta ct2=new Conta("nativo",100.7);
			System.out.println(ct1.compareTo(ct2));
			System.out.println(ct1.equals(ct2));
			System.out.println(ct1);
			System.out.println(ct2);
			Conta.setTaxa(0.2);
			ct1.corrige();
			System.out.println(ct1);
		}catch(Exception e) {
			System.out.println("erro");
		}*/
		try {
			System.out.println("conta (1):");
			Conta ct3=new Conta();
			System.out.println("conta (2):");
			Conta ct4=new Conta();
			System.out.println("Digite 1 para corregir conta (1) ou Digite 2 para corregir conta (2)  :");
			Scanner scan=new Scanner(System.in);
			int op= scan.nextInt();
			if(op==1)
				ct3.corrige();
				
			else 
				ct4.corrige();
			System.out.println(ct3);
			System.out.println(ct4);				
		}catch(Exception e) {
			System.out.println("erro");
		}
	}
}
