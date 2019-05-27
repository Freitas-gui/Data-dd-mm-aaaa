package exercicio19;
import interfaces.ObjetoGeometrico;
import interfaces.ObjetoTridimensional;
public class Paralelepipedo  implements ObjetoTridimensional{
	private Ponto3D p1,p2;
	private double h;//altura
	public Paralelepipedo(Ponto3D _p1, Ponto3D _p2,double _h) {
		this.setP1(_p1);
		this.setP2(_p2);
		this.setH(_h);
		
	}
	
	//metodos get/set

	public Ponto3D getP1() {
		return this.p1;
	}
	public void setP1(Ponto3D _p1) {
		 this.p1 = _p1;
	}
	public Ponto3D getP2() {
		return this.p2;
	}
	public void setP2(Ponto3D _p2) {
		this.p2 = _p2;
	}
	public double getH() {
		return this.h;
	}
	public void setH(double _h) {
		this.h = _h;
	}
	
	
	//metodos auxiliares
	
	//calcula largura, lado x
	public double larguraX() {
		double comp;
		comp= this.p2.getX()-this.p1.getX();
		return comp;
	}


	//calcula profundidade, lado z
		public double profundidadeZ() {
			double comp;
			comp= this.p1.getZ()-this.p2.getZ();
			return comp;
		}
	
	
	
	//metodos implements ObjetoTridimensional
	
	public double calculaArea() {//4 lados e 2 base
		return this.larguraX()*this.getH()*4 + this.larguraX()*this.profundidadeZ()*2;
	}
	public double calculaPerimetro() {
		return this.getH()*2 + this.larguraX()*2;
	}
	public Ponto3D centro()throws Exception {
		double x,y,z;
		x=this.getP2().getX() - this.getP1().getX();
		y=this.getP1().getY() + (this.getH()/2);
		z=this.getP2().getZ() - this.getP1().getZ();
		return new Ponto3D(x,y,z);
	}
	public double calculaSuperficie() {//area do topo
		return this.larguraX()*this.profundidadeZ();
	}
	public double calculaVolume() {//base * altura
		return  this.larguraX()*this.profundidadeZ() * this.getH();
	}
	
	public ObjetoGeometrico clona() {
		return new Paralelepipedo(this.getP1(), this.getP2(),this.getH());
	}

}
