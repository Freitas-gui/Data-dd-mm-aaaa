public class Chefe extends Funcionario {
	//os outros campos são herdados da classe pai, Funcionario
	private String depar;
	
	//construtor que utiliza outro construtor da classe Pai Pessoa
	public Chefe(String _nome, String _id , Data _dtNa,double _salario , Data _dtAd , String _depar) {
		super(_nome,_id,_dtNa, _salario, _dtAd);
		this.setDepar(_depar);
	}
	
	//metodos get
	public String getDepar() {
		return this.depar;
	}
	
	//metodos set
	public void setDepar(String _depar) {
		this.depar=_depar;
	}
	
	 //calcula valor maximo de emprestimo
	 public double maxEmprestimo(){
		 return super.maxEmprestimo()*2;
	 }
	
	//toString
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append(" |Departamento: ");
		dados.append(this.depar);
		return dados.toString();
		
	}
	
	
	
}