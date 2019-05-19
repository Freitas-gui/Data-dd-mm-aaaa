//agregacao pois contato nao eh um Email, e sim possui um campo Email
public class Contato {
	private String nome;
	private Email email;
	
	public Contato(String _nome , Email _email) {
		this.setNome(_nome);
		this.setEmail(_email);
	}
	
	public Contato(String _nome) throws Exception{//construtor sobrecarregado "sem Email"
		this.setNome(_nome);
		this.setEmail();
	}
	
	//metodos interface
	
	public String getNome() {
		return this.nome;
	}
	public Email getEmail() {
		return this.email;
	}
	
	public void setNome(String _nome) {
		this.nome=_nome;
	}
	public void setEmail(Email _email) {
		this.email=_email;
	}
	public void setEmail() throws Exception{
		Email e = new Email();
		this.email=e; 
	}
	
	public boolean equals(Object objeto) {
		Contato aux=(Contato)objeto;
		if(this.getNome()==aux.getNome() && this.getEmail()==aux.getEmail())
			return true;
		else
			return false;
	}
	
	public String toString() {
		StringBuilder dados=new StringBuilder();
		dados.append(this.getNome());
		dados.append(" | ");
		dados.append(this.getEmail());
		return dados.toString();
	}
}
