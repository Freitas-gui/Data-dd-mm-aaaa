
public class Email {
	private String login;
	
	
	public Email(String _login)throws Exception {
		this.setLogin(_login);
	}
	public Email()throws Exception {
		this ("@");
	}
	
	
	
	//metodos de interface
	public String getLogin() {
		return this.login;
	}
	public void setLogin(String _login)throws Exception {//so permite se houver @
		if(_login.indexOf('@') != -1)
			this.login=_login;
		else
			throw new Exception ("Login nao contem @");
	}
	
	
	public boolean equals(Object objeto) {//compara se dois login sao iguais
		Email aux=(Email)objeto;
		if(this.getLogin()==aux.getLogin())
			return true;
		else
			return false;
	}
	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("Login: ");
		dados.append(this.getLogin());
		return dados.toString();
	}
	
	
	
	
}
