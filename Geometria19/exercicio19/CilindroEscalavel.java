package exercicio19;
import interfaces.Escalavel;
import interfaces.ObjetoGeometrico;
import interfaces.ObjetoTridimensional;
public class CilindroEscalavel implements ObjetoTridimensional,Escalavel {
	private Ponto centro;
   	private double raio;
	private double h;//altura
	
	public CilindroEscalavel(Ponto _centro,double _raio, double _h) {
		this.setCentro(_centro);
		this.setRaio(_raio);
		this.setH(_h);
	}
	
	//metodos get/set
	public Ponto getCentro() {
		return this.centro;
	}
	public void setCentro(Ponto centro) {
		this.centro = centro;
	}
	public double getRaio() {
		return this.raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getH() {
		return this.h;
	}
	public void setH(double h) {
		this.h = h;
	}

	public Ponto3D centro()throws Exception {
		double px,py,pz;
		px=this.getCentro().getX();
		py=this.getCentro().getY();
		pz=this.getH()/2;
		return new Ponto3D(px,py,pz);
	}
	public double calculaArea() {// piR^2 *2 + 2piRH
		return  Math.PI*this.getRaio()*this.getRaio()*2 + Math.PI*this.getRaio()*this.getH()*2;
	}
	public double calculaSuperficie() {//calcula e retorna a área de superfície no topo do cilindro pi^R*2
		return Math.PI*this.getRaio()*this.getRaio();
	}
	public double calculaVolume() {// que calcula e retorna o volume do cilindro piR^2 *H
		return Math.PI*this.getRaio()*this.getRaio()*2*this.getH();
	}
	public void amplia(double escala) {//multiplica a escala pelas dimençoes do cilinro R e H
		this.setH(escala*this.getH());
		this.setRaio(escala*this.getRaio());
	}
	public void espelha()throws Exception {
		this.centro = new Ponto(this.getCentro().getX()*(-1),this.getCentro().getY());
	}
	
	public double calculaPerimetro() {
		return this.getRaio()*2 + this.getH()*2;
	}
	
	public ObjetoGeometrico clona() {
		return new CilindroEscalavel(this.getCentro(),this.getRaio(), this.getH());
	}
	
	
	
}
