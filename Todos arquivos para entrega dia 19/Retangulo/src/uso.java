
public class uso {
	public static void main(String args[]) {
		try {
			Retangulo r=new Retangulo(3,5,6,0);
			Retangulo r2=new Retangulo(3,5,6,0);
			System.out.println(r);
			System.out.println(""+r.perimetro());
			System.out.println(""+r.area());
			System.out.println(""+r.equals(r2));
			System.out.println(""+r.equalsArea(r2));
			System.out.println(""+r.compareTo(r2));
		}catch(Exception e){
			System.out.println("erroh");
		}
	}
}