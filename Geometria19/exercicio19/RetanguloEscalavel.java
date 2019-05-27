package exercicio19;

import interfaces.Escalavel;
import interfaces.ObjetoGeometrico;

public class RetanguloEscalavel implements ObjetoGeometrico,Escalavel {
	//campos
		Ponto p1,p2;
		
		//construtores
		public RetanguloEscalavel(Ponto _p1, Ponto _p2)throws Exception {
			this.setP1(_p1);
			this.setP2(_p2);
		}
		public RetanguloEscalavel(double x1, double y1, double x2, double y2) throws Exception{
			this.setP1(x1,y1);
			this.setP2(x2,y2);
		}
		public RetanguloEscalavel()throws Exception {
			this (0,0,0,0);
		}
		
		//metodos interface get
		
		public Ponto getP1() {
			return this.p1;
		}
		public Ponto getP2() {
			return this.p2;
		}
		
		//metodos interface set
		
		//modifica a classe Ponto passada como argumento
		public void setP1(Ponto _p1) throws Exception{
			Ponto aux =new Ponto();
			aux.setX(_p1.getX());
			aux.setY(_p1.getY());
			this.p1=aux;
			
		}
		public void setP2(Ponto _p2) throws Exception{
			Ponto aux =new Ponto();
			aux.setX(_p2.getX());
			aux.setY(_p2.getY());
			this.p2=aux;
		}
		//cria novos Pontos a partir de coordenadas
		public void setP1(double x1, double y1) throws Exception{
			Ponto _p1=new Ponto(x1,y1);
			this.setP1(_p1);
		}
		public void setP2(double x2, double y2) throws Exception{
			Ponto _p2=new Ponto(x2,y2);
			this.setP2(_p2);
		}
		
		//calculo de valores geometricos
		
		//calcula largura, lado x
		public double larguraX() {
			double comp;
			comp= this.p2.getX()-this.p1.getX();
			return comp;
		}
		//calcula altura, lado y
		public double aulturaY() {
			double comp;
			comp= this.p1.getY()-this.p2.getY();
			return comp;
		}
		
		
		
		//comparacoes entre 2 retangulos
		
		//verifica se dois retangulos possuem as mesmas coordenadas
		public boolean equals(RetanguloEscalavel _r) {
			if(this.p1.equals(_r.getP1()) && this.p2.equals(_r.getP2()))
				return true;
			else 
				return false;
		}
		//verifica se dois retangulos possuem o msm valor de area
		public boolean equalsArea(RetanguloEscalavel _r) {
			if(this.calculaArea()==_r.calculaArea())
				return true;
			else 
				return false;
		}
		//verifica se o retangulo da chamada é maior ou menor que o retornando passado como argumento, retorna 1 se for maior, -1 se for menor e 0 se forem iguais
		public int compareTo(RetanguloEscalavel _r) {
			if(this.calculaArea()>_r.calculaArea())
				return 1;
			else if(this.calculaArea()>_r.calculaArea())
				return -1;
			else return 0;
		}
		 
				
		
		//usa o toString  da clase Ponto, printa "(x1,y1)-(x2,y2)"

		public String toString() {
			StringBuilder dados =new StringBuilder();
			dados.append(this.getP1());
			dados.append("-");
			dados.append(this.getP2());
		  	return dados.toString();
		   }
		
		public void amplia(double escala) {//adiciona 1/4 da escala em cada coordenada, para ampliar o retangulo
			double p1x,p1y,p2x,p2y;
		
			p1y=this.getP1().getY() +escala/4; // coordenada Superior
			p2y=this.getP2().getY() -escala/4; // coordenada Inferior
			
			p1x=this.getP1().getX() -escala/4; // coordenada Esquerda
			p2x=this.getP2().getX() +escala/4; // coordenada Direita

			try{
				this.setP1(p1x, p1y); //recebe novas coordenadas ampliadas
				this.setP2(p2x, p2y);
			}catch(Exception e){
				System.out.println("Erro");
			}
		}
		public void espelha() {//reflete as coordenadas horizontais
			double p1x,p1y,p2x,p2y;
			p1x=this.getP1().getX();   // coordenada Esquerda
			p1y=this.getP1().getY();   // coordenada Superior
			p2x=this.getP2().getX();   // coordenada Direita
			p2y=this.getP2().getY();  // coordenada Inferior
			try{
				this.setP1(p1x*(-1), p1y);// aqui
				this.setP2(p2x*(-1), p2y);// trroca horizontais
			}catch(Exception e){
				System.out.println("Erro");
			}
		}
	
		public Ponto centro()throws Exception {
			double px,py;
			px=this.getP1().getX()+this.larguraX()/2;
			py=this.getP2().getY()+this.aulturaY()/2;
			Ponto c = new Ponto(px,py);
			return c;
		}
		public double calculaArea() {
			return this.larguraX()*this.aulturaY();
		}
		public double calculaPerimetro() {
			return this.aulturaY()*2 + this.larguraX()*2;
		}
		
		public ObjetoGeometrico clona() throws Exception{
			return new RetanguloEscalavel(this.getP1(), this.getP2());
		}
}
