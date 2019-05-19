package item;

public interface ItemDeBiblioteca {
	public boolean isEmprestado();
	public boolean empresta();
	public void devolve();
	public void localiza();
	public String apresentaDescriçao();
}
