
public class Uso {
	public static void main(String args[]) {
		try {
			Email e=new Email("freitas-gui19@hotmail.com");
			Email r=new Email();
			System.out.println(e);
			System.out.println(r);
			System.out.println(""+e.equals(r));
			Contato c =new Contato("Guilherme",e);
			Contato d =new Contato("Gulherme",e);
			System.out.println(c);
			System.out.println(""+c.equals(d));
		}catch(Exception a) {
			System.out.println("Login nao contem @");
		}
	}
}