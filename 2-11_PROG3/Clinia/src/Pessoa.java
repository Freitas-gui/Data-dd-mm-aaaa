
public class Pessoa {
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
 
 //metodos set
 public void setNome(String _nome) {
	 this.nome=_nome;
 }
 public void setId(String _id) {
	 this.id=_id;
 }
 
 public void setDtNa(Data _dtNa) {
	 this.dtNa=_dtNa;
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
