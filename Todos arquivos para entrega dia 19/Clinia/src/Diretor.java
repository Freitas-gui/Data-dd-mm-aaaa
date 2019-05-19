public class Diretor extends Funcionario{
	private Data promocao;
	public Diretor(String _nome, String _id , Data _dtNa,double _salario, Data _dtAd, Data _promocao){
		super(_nome,_id , _dtNa, _salario, _dtAd);
		this.setPromocao(_promocao);
	}

	public Data getPromocao() {
		return this.promocao;
	}
	public double getEmpre() {
		super.setEmpre(super.getSalario()*3);
		return Diretor.emprestimo;
	}
	public void setPromocao(Data _promocao) {
		this.promocao = _promocao;
	}
}