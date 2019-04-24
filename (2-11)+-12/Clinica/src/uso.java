
public class uso {
	public static void main(String args[]) {
		try{
				
			Data dt = new Data(16,04,1999);
			Data _dtAd = new Data(3,05,1995);
			Data _dtPro = new Data(4,2,2004);
			Diretor p=new Diretor("Gui","07899936519",dt,3021,_dtAd,"motion graphics",_dtPro);
			System.out.println(p);
		}catch(Exception e){
			System.out.println("Erro");
		}
	}
}