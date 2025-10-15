package polimorfismo_novo;

public class Comp_Pessoa {
	
	private String nome;
	private Comp_Coracao coracao; // Composição
	
	// Construtor
	public Comp_Pessoa(String nome, int coracao) {
		this.nome = nome;
		this.coracao = new Comp_Coracao(coracao);		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCoracao() {
		return coracao.getBatimentos();
	}
}
