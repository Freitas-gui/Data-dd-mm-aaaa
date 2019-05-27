package exercicio19;
import interfaces.ObjetoGeometrico;
import interfaces.ObjetoTridimensional;
public class Esfera implements ObjetoTridimensional{
	private Ponto3D centro;
	private double raio;
	public Esfera(Ponto3D _centro,double _raio) {
		this.setCentro(_centro);
		this.setRaio(_raio);
	}
	
	//metodos get/set
	public Ponto3D getCentro() {
		return this.centro;
	}
	public void setCentro(Ponto3D centro) {
		this.centro = centro;
	}
	public double getRaio() {
		return this.raio;
	}
	 void setRaio(double raio) {
		this.raio = raio;
	}

	public double calculaArea() {// 4pir^2
		return 4*Math.PI*this.getRaio()*this.getRaio();
	}
	public double calculaPerimetro() {//2pir
		return 2*Math.PI*this.getRaio();
	}
	public Ponto3D centro()throws Exception {
		return new Ponto3D(this.getCentro().getX(),this.getCentro().getY(),this.getCentro().getZ());
	}
	public double calculaSuperficie() {
		return calculaArea();
	}
	public double calculaVolume() {//4/3 * pi*r^3
		return (4/3)*Math.PI*this.getRaio()*this.getRaio()*this.getRaio();
	}
	
	public ObjetoGeometrico clona() {
		return new Esfera(this.getCentro(),this.getRaio());
	}

}
