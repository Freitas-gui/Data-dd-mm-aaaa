import java.util.Scanner;

public class Data {
	private int dia,mes,ano;
	
	//construtores sobrecarregados
	public Data(int _dia, int _mes, int _ano)throws Exception {//3 inteiros
		this.setData(_dia, _mes, _ano);
	}
	public Data(int _dia, String _mes, int _ano) throws Exception{//mes eh string
		this.setData(_dia,_mes,_ano);		
	}
	public Data(int _mes, int _ano)throws Exception {//omite dia
		this (1,_mes,_ano);
	}
	public Data(String Data) throws Exception{//dd/mm/aaaa
		this.setData(Data);
	}
	public Data()throws Exception{// usuario digita
		this.digiteData();
	}


	//metodos para acessar valores
	public int getDia() {
		return this.dia;
	}
	public int getMes() {
		return this.mes;
	}
	public int getAno() {
		return this.ano;
	}
	
	//metodo para alterar valores
	public void setData(int _dia, int _mes, int _ano)throws Exception {
		if(isDataValida(_dia, _mes, _ano)==true) {//verificar Datas invalidas
			this.dia= _dia;
			this.mes= _mes;
			this.ano= _ano;
		}
		else //default
			throw new Exception("nota invalida");
		
	}
	
	//metodo incrementa 1 dia
	public void setIncrementaDia() throws Exception{
		this.setData(this.getDia()+1,this.getMes(), this.getAno());
	}
	public void setIncrementaMes() throws Exception{
		this.setData(this.getDia(),this.getMes()+1,this.getAno());
	}
	public void setIncrementaAno() throws Exception{
		this.setData(this.getDia(),this.getMes(),this.getAno()+1);
	}
	
	//metodo incrementa n dias
	public void setIncrementaDia(int _dia) throws Exception{
		while(_dia>0) {
			this.setIncrementaDia();
			_dia--;
		}
	}
	
	//metodo altera digitando via teclado
	public void digiteData()throws Exception{
		System.out.println("Digite dia:");
		Scanner scan = new Scanner(System.in);
		int _dia = scan.nextInt();
		System.out.println("Digite mes:");
		Scanner scan2 = new Scanner(System.in);
		int _mes = scan2.nextInt();
		System.out.println("Digite ano:");
		Scanner scan3 = new Scanner(System.in);
		int _ano = scan3.nextInt();
		this.setData(_dia,_mes,_ano);
	}
	
	//metodo para alterar valor quando mes eh String
	public void setData(int _dia, String _mes,int _ano) throws Exception{
		int i=0;
		if(_mes.equals("janeiro")) i=1;else if (_mes.equals("fevereiro")) i=2 ; else if (_mes.equals("marco")) i=3 ; else if (_mes.equals("abril")) i=4  ; else if (_mes.equals("maio")) i=5  ;else if (_mes.equals("junho")) i=6; else if (_mes.equals("julho")) i=7; else if (_mes.equals("agosto")) i=8  ; else if (_mes.equals("setembro")) i=9  ; else if (_mes.equals("outubro")) i=10 ; else if (_mes.equals("novembro")) i=11  ; else if (_mes.equals("dezembro")) i=12;
		setData(_dia, i , _ano);
	}
	/*public void setSData(int _dia,String _mes,int _ano) {//nao ultilizar, pois ocupa muito espaco de memoria
		int i;
		Smes[0]="janeiro";Smes[1]="fevereiro";Smes[2]="marco";Smes[3]="abril";Smes[4]="maio";Smes[5]="junho";Smes[6]="julho";Smes[7]="agosto";Smes[8]="setembro";Smes[9]="outubro";	Smes[10]="novembro";Smes[11]="dezembro";
		for(i=0;Smes[i]!=_mes;i++) {
		}
		if(this.isDataValida(_dia, i+1, _ano)==true) {
			this.dia= _dia;
			this.mes= i+1;
			this.ano= _ano;
		}
	}*/
	
	//metodo para alterar valor quando dia/mes/Data eh String
	public void setData(String Data)throws Exception {
		int auxDia, auxMes, auxAno, i, j;
		i=Data.indexOf("/");
		j=Data.indexOf("/",i+1);
		auxDia=Integer.parseInt(Data.substring(0,i));
		auxMes=Integer.parseInt(Data.substring(i+1,j));
		auxAno=Integer.parseInt(Data.substring(j+1));
		this.setData(auxDia,auxMes,auxAno);
	}
	/*public void setSSSData(String _SSSData) {//nao usar, pois gasta muito espaco na memoria
		int auxDia, auxMes, auxAno;
		auxDia=_SSSData.indexOf("/");
		if(auxDia==1) {
			auxDia=Integer.parseInt(_SSSData.substring(0,1));
			this.dia= auxDia;
			auxMes=_SSSData.indexOf("/",2);
			if(auxMes==3) {
				auxMes=Integer.parseInt(_SSSData.substring(2,3));
				auxAno=Integer.parseInt(_SSSData.substring(4,8));
			}
			else {
				auxMes=Integer.parseInt(_SSSData.substring(2,4));
				auxAno=Integer.parseInt(_SSSData.substring(4,9));
			}
			this.mes= auxMes;
			this.ano= auxAno;
		}
		else {
			auxDia=Integer.parseInt(_SSSData.substring(0,2));
			this.dia= auxDia;
			auxMes=_SSSData.indexOf("/",3);
			if(auxMes==4) {
				auxMes=Integer.parseInt(_SSSData.substring(3,4));
				auxAno=Integer.parseInt(_SSSData.substring(5,9));
			}
			else {
				auxMes=Integer.parseInt(_SSSData.substring(3,5));
				auxAno=Integer.parseInt(_SSSData.substring(6,10));
			}
			this.mes= auxMes;
			this.ano= auxAno;
		}
	}*/
	
	//static, pois nao precisa de um objeto criado
	private static boolean isDataValida(int _dia, int _mes, int _ano) {
		if(_dia<1 ||_mes<1 || _mes>12)
			return false;
		else if((_mes==4 ||_mes==6 || _mes==9 || _mes==11) && _dia>30)
			return false;
		else if((_mes==1 || _mes==3 || _mes==5 || _mes==7 || _mes==8 || _mes==10 || _mes==12) && (_dia>31))
			return false;
		else if(_ano<1582)
			return false;
		else if(_mes==2 && isBissexto(_ano) && _dia>29 )
			return false;
		else if(_mes==2 && !isBissexto(_ano) && _dia>28 )
			return false;
		else
			return true;
	}
	

	//static, pois nao precisa de um objeto criado
	private static boolean isBissexto(int _ano) {
		if(( _ano %4 ==0 && _ano %100 !=0)||(_ano %400 ==0))
			return true;
		else
			return false;
	}
	
	//nao static, pois esta sem argumentos, e  por isso verifica a data de um objeto previamente criado
	private boolean isDataValida() {//nao eh util pois qnd o objeto foi criado, o setData, ja verifica se a data eh valida, portando em todos os casos onde o objeto ja foi criado, a data eh valida
		if(this.dia<1 ||this.mes<1 || this.mes>12)
			return false;
		else if((this.mes==4 ||this.mes==6 || this.mes==9 || this.mes==11) && this.dia>30)
			return false;
		else if((this.mes==1 || this.mes==3 || this.mes==5 || this.mes==7 || this.mes==8 || this.mes==10 || this.mes==12) && (this.dia>31))
			return false;
		else if(this.ano<1582)
			return false;
		else if(this.mes==2 && isBissexto(this.ano)==true && this.dia>29 )
			return false;
		else if(this.mes==2 && isBissexto(this.ano)==false && this.dia>28 )
			return false;
		else
			return true;
	}
	
	//nao static, pois esta sem argumentos, e  por isso verifica a data de um objeto previamente criado
	private boolean isBissexto() {
		if(( this.ano %4 ==0 && this.ano %100 !=0)||(this.ano %400 ==0))
			return true;
		else
			return false;
	}
	
	//verifica se a Data eh valida, e ultilisa um construtor para criar uma Data, retorna a Data criada
	public static Data verificaECriaData(int _dia,int _mes, int _ano)throws Exception {
		if(Data.isDataValida(_dia, _mes, _ano)==true) {
			Data x= new Data(_dia, _mes, _ano);
			return x;
		}
		else 
			return null;
	}
	public int compareTo(Data dt) {
		if(this.ano>dt.ano) return 1;
		else if(this.ano<dt.ano) return -1;
		else if(this.ano==dt.ano && this.mes>dt.mes)return 1;
		else if(this.ano==dt.ano && this.mes<dt.mes)return -1;
		else if(this.ano==dt.ano && this.mes==dt.mes && this.dia>dt.dia)return 1;
		else if(this.ano==dt.ano && this.mes==dt.mes && this.dia<dt.dia)return -1;
		else return 0;
	}
	
	//Imprime 2 datas ordenadas de formas crescente
	public static void imprimeMenorMaior(Data dt1,Data dt2) {
		if (dt1.compareTo(dt2)==1)
			System.out.println(dt2+" "+dt1);
		else
			System.out.println(dt1+" "+dt2);
	}
	
	//Imprime um vetor Data crescente
	/*public static void imprime4DatasCrescente(Data f[],int tam) throws Exception{
		int i=0,j=0;
		Data aux=new Data(1,1,1900);
		while(j<tam) {
			for (i=0;i<tam;i++) {
				if(f[i].compareTo(f[i+1])==1) {
					aux.setData(f[i].getDia(),f[i].getMes(),f[i].getAno());
					f[i].setData(f[i+1].getDia(),f[i+1].getMes(),f[i+1].getAno());
					f[i+1].setData(aux.getDia(),aux.getMes(),aux.getAno());
				}
				else i++;
			}
			j++;
		}
		for (i=0;i<tam;i++) {
			System.out.println(" "+f[i]);
		}
	}*/
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.getDia());
		dados.append("/");
		dados.append(this.getMes());
		dados.append("/");
		dados.append(this.getAno());
		return dados.toString();
	}
	public boolean equals (Object objeto) {
		Data aux=(Data)objeto;
		if(this.getDia()==aux.getDia() &&
		this.getMes()==aux.getMes() &&
		this.getAno()==aux.getAno())
			return true;
		return false;
	}
}