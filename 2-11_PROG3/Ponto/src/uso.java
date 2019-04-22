import java.util.Scanner;
import java.util.Random;
class uso {
	public static void main(String args[]) {
		/*try {
			Ponto g =new Ponto("6,6");
			Ponto s =g.clona();
			s.setX(5);
			System.out.println(""+g.equals(s));
			System.out.println(""+g.temEixoComum(s));
			double d=Ponto.distancia(g,s);
			System.out.println(""+g.compareTo(s));
		}catch(Exception e) {
			System.out.println("erro");
		}*/
		try {
			//campos necessarios e gerador de numeros aleatorios
			int cont=0;
			double x,y;
			Ponto vetor[]=new Ponto[100];
			Random gerador=new Random();
			
			//declaracao de Ponto digitado pelo usuario
			System.out.println("Digite a coordenada x: ");
			Scanner scanX=new Scanner(System.in);
			x=scanX.nextDouble();
			System.out.println("Digite a coordenada y: ");
			Scanner scanY=new Scanner(System.in);
			y=scanY.nextDouble();
			Ponto p= new Ponto(x,y);
			
			//gerador de Pontos aleatorios
			while(cont<100) {
				x  = gerador.nextDouble()*100;
				y  = gerador.nextDouble()*100;
				vetor[cont]=new Ponto(x,y);
				System.out.println(""+vetor[cont]);
				cont++;
			}

			
		}catch (Exception e) {
			System.out.println("erro");
		}
		
	}
}
