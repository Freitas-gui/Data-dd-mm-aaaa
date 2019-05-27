package interfaces;
import exercicio19.Ponto;

public interface ObjetoGeometrico {
	public Ponto centro()throws Exception;
	public double calculaArea();
	public double calculaPerimetro();
	public ObjetoGeometrico clona()throws Exception;
}
