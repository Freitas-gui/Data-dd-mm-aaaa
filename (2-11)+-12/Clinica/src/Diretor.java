
public class Diretor extends Chefe {
	//campo data de promoção
	private Data dtPro;
	
	//construtor que utiliza outro construtor da classe Pai Chefe
	public Diretor(String _nome, String _id , Data _dtNa,double _salario , Data _dtAd , String _depar , Data _dtPro){
		super(_nome,_id,_dtNa, _salario, _dtAd , _depar);
		this.setDtPro(_dtPro);
	}
	
	//metodo get 
	public Data getDtPro(){
		return this.dtPro;
	}
	//metodo set
	public void setDtPro(Data _dtPro){
		this.dtPro=_dtPro;
	}
	
	 //calcula valor maximo de emprestimo
	 public double maxEmprestimo(Chefe _c){
		 return super.maxEmprestimo()*(3/2);
	 }
	 
	//toString
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append(" |Data de promocao: ");
		dados.append(this.dtPro);
		return dados.toString();
		
		}
}
