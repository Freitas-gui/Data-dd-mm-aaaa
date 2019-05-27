package exercicio19;

public class Ponto3D extends Ponto {
	
	private double z;
	
	public Ponto3D(double _x, double _y, double _z)throws Exception{
		super(_x,_y);//Classe Ponto
		this.setZ(_z);
	}

	
	public double getZ() {
		return z;
	}

	public void setZ(double _z)throws Exception{
		if(_z>=super.getLimiteInf() && _z<=super.getLimiteSup())
			this.z=_z;
		else
			throw new Exception ("Fora do limite");
	}
	
	public boolean equals(Ponto3D _xy)throws Exception {
		Ponto _p=new Ponto(super.getX(),super.getY());
		if (super.equals(_p)==true &&  this.z==_xy.getZ())
			return true;
		else 
			return false;
	}
	

	
}
