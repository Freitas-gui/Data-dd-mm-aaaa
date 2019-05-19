public class Aluno {
  	private String nome;
  	private double nota1, nota2, media, pontos;
  	private final static int limiteSuperior=10;
  	private static int limiteSup=Aluno.limiteSuperior;
  	// quatro construtores sobrecarregados
   	public Aluno(String _nome,double _nota1,double _nota2,double _pontos) throws Exception {
        	this.setNome(_nome);
        	this.setNotas(_nota1, _nota2, _pontos);
  	}
  	public Aluno(double _nota1, double _nota2, double _pontos) throws Exception {
        	this("sem nome", _nota1, _nota2, _pontos);
  	}
  	public Aluno(double _nota1, double _nota2) throws Exception {
        	this(_nota1, _nota2, 0.0);
  	}
  	public Aluno() throws Exception {
        	this(0.0,0.0);
  	}
 
  	// m�todos de interface para acesso aos campos privados
  	public String getNome() {      	
        	return this.nome;  	
  	}
 	public double getNota1() {
    	return this.nota1; 	
	}
	public double getNota2() {
    	return this.nota2; 	
	}
	public double getMedia() {
    	return this.media; 	
	}

  	public void setNome(String _nome) {
        	this.nome = _nome; 	
  	}
 
  	public double getPontos()  {
        	return this.pontos;	
  	}
  	public void setPontos(double _pontos)throws Exception {
        	this.pontos = _pontos;
        	this.calculaMedia(Aluno.getLimiteSup());
  	}
 
  	// tratamento de erros, escopo do programador de classes (comandos throw  e throws)
  	public void setNotas(double _nota1, double _nota2,double _pontos)throws Exception {
        	this.pontos = _pontos;
        	if(_nota1>=0  && _nota2>=0 && !Aluno.ultrapassaNota(_nota1,_nota2) ) {
              	this.nota1 = _nota1;
              	this.nota2 = _nota2;
              	this.calculaMedia(Aluno.getLimiteSup());
        	}
        	else
         	// O comando throw desvia o processamento para o interior do catch que possui 
         	// a classe do tipo do objeto lan�ado
         	// Se for da categoria Exception (erro verificado) ent�o o uso de try-catch 
    	 	// � obrigat�rio, ou ent�o, deve-se passar essa obrigatoriedade adiante com 
             // o comando throws no cabe�alho do m�todo
              	throw new Exception("nota invalida");
         	// Se for da categoria RuntimeException, n�o h� obrigatoriedade do tratamento
  	}
  	
  	public void setNotas(double _nota1, double _nota2)throws Exception {
        	this.setNotas(_nota1, _nota2, 0);
  	}
 

  	// m�todo para calcular a m�dia. Privado pois o uso � apenas interno a classe
  	private double calculaMedia() {
        	this.media = (this.getNota1() + this.getNota2() + this.getPontos())/2;
        	return this.media;
  	}
  	public void setLimiteSup(int _limite)throws Exception {
  		limiteSup=_limite;
  	}
  	public static int getLimiteSup() {
  		return limiteSup;
  	}
  	// sobrecarregamento do c�lculo da m�dia para limitar o valor m�ximo
  	private double calculaMedia(int _limite)throws Exception {
        	this.calculaMedia();
        	if(this.media > Aluno.getLimiteSup())
              	this.media = Aluno.getLimiteSup();
        	return this.media;
  	}
  	
  	
  	public boolean equals(Object objeto) {
    	Aluno aux = (Aluno)objeto;
    	if (this.getNome().equals(aux.getNome()) &&
                	this.getNota1() == aux.getNota1() &&
                	this.getNota2() == aux.getNota2() &&
                	this.getPontos() == aux.getPontos())
          	return true;
    	return false;
	} 
  	public static boolean ultrapassaNota(double _nota1,double _nota2) {
  		if (_nota1>Aluno.getLimiteSup() ||_nota2>Aluno.getLimiteSup())
  			return true;
  		else
  			return false;
  	}
 
  	// n�o � adequado que o m�todo toString exiba mensagens, pois
  	// � comum considerar que o programador de classes n�o conhece o usu�rio final
    	// Evita-se tamb�m textos retornados, escritos em uma determinada l�ngua. 
  	public String toString(){
        StringBuilder dados = new StringBuilder();
        dados.append("Nome: ");
    	dados.append(this.getNome());
        dados.append("  ");
        dados.append("Nota1: ");
    	dados.append(this.getNota1());
    	dados.append("  ");
    	dados.append("Nota2: ");
    	dados.append(this.getNota2());
    	dados.append("  ");
    	dados.append("Pontos: ");
    	dados.append(this.getPontos());
    	dados.append("  ");
    	dados.append("Media: ");
    	dados.append(this.getMedia());
    	return dados.toString();
     }  

}