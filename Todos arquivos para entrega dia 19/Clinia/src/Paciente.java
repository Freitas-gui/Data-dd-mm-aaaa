
public class Paciente extends Pessoa{
	//os outros campos são herdados da classe pai, Pessoa
	private int planoSaude;
	
	//construtor que utiliza outro construtor da classe Pai Pessoa
	public Paciente(String _nome, String _id , Data _dtNa,int _planoSaude) {
		super(_nome,_id,_dtNa);
		this.setPlanoSaude(_planoSaude);
	}
	
	//metodo get
	public int getPlanoSaude() {
		return this.planoSaude;
	}
	//metodo set
	public void setPlanoSaude(int _planoSaude) {
		this.planoSaude=_planoSaude;
	}
	
	//toString
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append(" |Plano de Saude: ");
		dados.append(this.planoSaude);
		return dados.toString();
		
	}
	
}
