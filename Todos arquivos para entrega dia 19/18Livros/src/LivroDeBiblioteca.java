import item.ItemDeBiblioteca;
//falta implementar os metodos obrigatorios da classe de Interface
public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{
	
	private boolean statusEmprestimo;
	private int localizacao;
	private String descricao;
	
	public LivroDeBiblioteca(String _titulo, String _autor, int _numeroPaginas, int _anoEdicao, boolean _statusEmprestimo, int _localizacao, String _descricao) {
		super(_titulo,_autor, _numeroPaginas, _anoEdicao);
		this.setStatusEmprestimo(_statusEmprestimo);
		this.setLocalizacao(_localizacao);
		this.setDescricao(_descricao);
	}

	public boolean getStatusEmprestimo() {
		return this.statusEmprestimo;
	}

	public void setStatusEmprestimo(boolean _statusEmprestimo) {
		this.statusEmprestimo = _statusEmprestimo;
	}

	public int getLocalizacao() {
		return this.localizacao;
	}

	public void setLocalizacao(int _localizacao) {
		this.localizacao = _localizacao;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String _descricao) {
		this.descricao = _descricao;
	}
	
	public boolean isEmprestado() {
		
	}
	
	
}
