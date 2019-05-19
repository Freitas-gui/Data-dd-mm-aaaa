
public class Livro {
	private String titulo;
	private String autor;
	private int numeroPaginas;
	private int anoEdicao;
	
	public Livro(String _titulo, String _autor, int _numeroPaginas, int _anoEdicao) {
		this.setTitulo(_titulo);
		this.setAutor(_autor);
		this.setNumeroPaginas(_numeroPaginas);
		this.setAnoEdicao(_anoEdicao);
	}
	
	
	//metodos de interface
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String _titulo) {
		this.titulo = _titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String _autor) {
		this.autor = _autor;
	}

	public int getNumeroPaginas() {
		return this.numeroPaginas;
	}

	public void setNumeroPaginas(int _numeroPaginas) {
		this.numeroPaginas = _numeroPaginas;
	}

	public int getAnoEdicao() {
		return this.anoEdicao;
	}

	public void setAnoEdicao(int anoEdicao) {
		this.anoEdicao = anoEdicao;
	}
	
	
}
