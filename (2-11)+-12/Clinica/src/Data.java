public class Data {
	private int dia,mes,ano;
	
	//construtores sobrecarregados
	public Data(int _dia, int _mes, int _ano) throws Exception{//3 inteiros
		this.setData(_dia, _mes, _ano);
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
		public void setData(int _dia, int _mes, int _ano)throws Exception{
			if(isDataValida(_dia, _mes, _ano)) {//verificar Datas invalidas
				this.dia= _dia;
				this.mes= _mes;
				this.ano= _ano;
			}
			else //default
				throw new Exception("Data invalida");
		}
		
		//verefica se a data eh valida
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
		
		//Verifica se o ano eh bissexto
		private static boolean isBissexto(int _ano) {
			if(( _ano %4 ==0 && _ano %100 !=0)||(_ano %400 ==0))
				return true;
			else
				return false;
		}
		
		//exemplo a ser impresso: 16/04/1999
		public String toString() {
			StringBuilder dados = new StringBuilder();
			dados.append(this.getDia());
			dados.append("/");
			dados.append(this.getMes());
			dados.append("/");
			dados.append(this.getAno());
			return dados.toString();
		}
}