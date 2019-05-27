package interfaces;
import exercicio19.Ponto3D;

public interface ObjetoTridimensional extends ObjetoGeometrico {
	public Ponto3D centro()throws Exception;//retorna um ponto no centro do objeto 3D
	public double calculaSuperficie();//calcula e retorna a área de superfície do objeto tridimensional
	public double calculaVolume();// que calcula e retorna o volume do objeto tridimensional.

}
