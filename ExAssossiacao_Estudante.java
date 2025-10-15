package polimorfismo_novo;

public class ExAssossiacao_Estudante {
	
	private String nome;
	private Ass_Universidade universidade;
	
	public ExAssossiacao_Estudante(String nome, Ass_Universidade universidade) {
		this.nome = nome;
		this.universidade = universidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
