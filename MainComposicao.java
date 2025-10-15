package polimorfismo_novo;

public class MainComposicao {

	public static void main(String[] args) {

		Comp_Pessoa pessoa = new Comp_Pessoa("João", 80);
		
		System.out.println(pessoa.getNome() + " tem a média de " + pessoa.getCoracao() + " batimentos");

	}

}
