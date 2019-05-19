
public class Cliente extends Contato {

	private String endere�o;
	private double renda,celular;
	
	public Cliente(String _end , double _renda , double _celular , String _nome , Email _email ){
		super(_nome ,_email);
		this.setEndere�o(_end);
		this.setRenda(_renda);
		this.setCelular(_celular);
	}
	
	//metodos get
	
	
	public String getEndere�o() {
		return this.endere�o;
	}
	public double getRenda() {
		return this.renda;
	}
	public double getCelular() {
		return this.celular;
	}
	
	//metodos set
	
	public void setEndere�o(String _end) {
		this.endere�o=_end;
	}
	public void setRenda(double _renda) {
		this.renda=_renda;
	}
	public void setCelular(double _celular) {
		this.celular=_celular;
	}
	
	
	public boolean equals(Object objeto) {
		Cliente aux=(Cliente)objeto;
		if (this.getRenda() == aux.getRenda() && this.getCelular() == aux.getCelular() && this.getEndere�o()== aux.getEndere�o() &&
				this.getNome() == aux.getNome()&& this.getEmail() == aux.getEmail())
			return true;
		else
			return false;
	}
	
	
	
}
