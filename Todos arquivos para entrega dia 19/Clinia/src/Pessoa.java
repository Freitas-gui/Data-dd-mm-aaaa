
public class Pessoa {
public final static double EMPRESTIMO=1000;
public static double emprestimo=EMPRESTIMO;
//campos
 private Data  dtNa;
 private String nome, id;;
 
 //construtor
 public Pessoa(String _nome, String _id , Data _dtNa) {
	 this.setNome(_nome);
	 this.setId(_id);
	 this.setDtNa(_dtNa);
 }
 
 //metodos get
 public String getNome() {
	 return this.nome;
 }
 public String getId() {
	 return this.id;
 }
 public Data getDtNa() {
	 return this.dtNa;
 }
 public double getEmpre() {
	 return Pessoa.emprestimo;
 }
 
 //metodos set
 public void setNome(String _nome) {//nome
	 this.nome=_nome;
 }
 public void setId(String _id) {//Identidade
	 this.id=_id;
 }
 
 public void setDtNa(Data _dtNa) {//Data Nascimento
	 this.dtNa=_dtNa;
 }
 
 public void setEmpre(double _emprestimo) {//modificar o valor máximo de um empréstimo 
	 Pessoa.emprestimo=_emprestimo;
 }
 
 public String toString() {
	 StringBuilder dados = new StringBuilder();
	 dados.append("Nome: ");
	 dados.append(this.nome);
	 dados.append(" |ID: ");
	 dados.append(this.id);
	 dados.append(" |Data de nascimento: ");
	 dados.append(this.dtNa);
	 return dados.toString();
 }
 
 
 
 
 
 
}
