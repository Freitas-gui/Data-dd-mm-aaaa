public class uso {
	public static void main(String args[]) {
		
		//verifica e cria data
		try {
			Data a;
			a=Data.verificaECriaData(3,5,2001);
			if(a==null) 
				a=new Data(1,1,1900);
			System.out.println(a);
		//	System.out.println(a.compareTo(a));
		}catch(Exception a){
			System.out.println("Data invalida");
		}
	  //Usuario digita
		/*int i=0;
		while(i<3) {
			try{
				Data b= new Data();
				System.out.println(b);
				break;
			}catch (Exception e) {
				if(i==2) {
					System.out.println("01/01/1900");break;
				}
			System.out.println("Data invalida Digite novamente");
			i++;
			}
		}
*/
		// teste exercicio 02
		//System.out.println("teste exercicio 02:");
		
	/*	try {
		//equals + mes string + MenorMaior
		Data c= new Data(20,"abril",2025);
		System.out.println(c);
		Data d= new Data(21,4,2025);
		System.out.println(d);
		Data.imprimeMenorMaior(c,d);
		System.out.println(c.equals(d));
		}catch(Exception e) {
			System.out.println("erroh");
		}
		
		//Incrementa dia ou dias
		try {
			Data e=new Data(12,3,2015);
			e.setIncrementaDia(2);
			System.out.println(e);
		}catch(Exception e){
			try {
				Data t=new Data(12,3,2015);
				t.setIncrementaMes();
				System.out.println(e);
			}catch(Exception a){
				try {
					Data t=new Data(12,3,2015);
					t.setIncrementaAno();
					System.out.println(e);
				}catch(Exception o){
					System.out.println("Data Invalida");
				}
			}
		}*/
		/*try {
			Data f[]=new Data[4];
			f[0]=new Data(4,5,2018);
			f[1]=new Data(1,3,2014);
			f[2]=new Data(4,2,2015);
			f[3]=new Data(27,6,2015);
			Data.imprime4DatasCrescente(f,4);
		}catch(Exception e) {
			System.out.println("Errroh");
		}*/
		/*try {
		incrementa(x);
		System.out.println(x);
		}catch(Exception e) {
			System.out.println("errohh");
		}
		/*
		//Data passada por 3 inteiros
		Data a= new Data(19,04,2019);
		System.out.println(a);
		//Data passada por 3 inteiros
		
		//Data pasada sem dia
		Data b= new Data(04,2019);
		System.out.println(b);
		//Data pasada sem dia
		
		//ano muito antigo
		Data c= new Data(02,04,1442);
		System.out.println(c);
		
		//string "dd/mm/aaaa"
		Data d= new Data("02/04/2019");
		System.out.println(d);*/
	}
}