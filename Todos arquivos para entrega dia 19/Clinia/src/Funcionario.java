import java.util.Scanner;
public class Funcionario extends Pessoa {
	//os outros campos são herdados da classe pai, Pessoa
	double salario;
	private Data dtAd;
	
	//construtor que utiliza outro construtor da classe Pai Pessoa
	public Funcionario(String _nome, String _id , Data _dtNa,double _salario, Data _dtAd) {
		super(_nome,_id,_dtNa);
		this.setSalario(_salario);
		this.setDtAd(_dtAd);
	}
	
	//metodos get
	public double getSalario() {
		return this.salario;
	}
	public Data getDtAd() {
		return this.dtAd;
	}
	public double getEmpre() {
		super.setEmpre(this.getSalario());
		return Funcionario.emprestimo;
	}
	
	// método para reajustar o salário a partir de uma taxa informada como argumento. 
	public void setSalario(double _salario) {
		this.salario =_salario;
	}
	// método para reajustar o salário a partir de uma taxa informada pelo usuario 
	public void setSalarioDigita() {
		System.out.println("Digite taxa informada: ");
		Scanner  scan = new Scanner(System.in);
		double taxa=scan.nextDouble();
		this.salario =taxa;
	}
	
	public void setDtAd(Data _dtAd) {
		this.dtAd = _dtAd;
	}
	
	//toString
		public String toString() {
			StringBuilder dados = new StringBuilder();
			dados.append(super.toString());
			dados.append(" |Salario: ");
			dados.append(this.salario);
			dados.append(" |Data de Adimissao: ");
			dados.append(this.dtAd);
			return dados.toString();
			
		}
}
