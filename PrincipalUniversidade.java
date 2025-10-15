package polimorfismo_novo;

public class PrincipalUniversidade {

	public static void main(String[] args) {
		
		Ass_Universidade universidade = new Ass_Universidade("USP");
		
		ExAssossiacao_Estudante estudante = new ExAssossiacao_Estudante("João", universidade);
		
		System.out.println("Estudante: " + estudante.getNome() + "/n Universidade" + universidade.getNome());
	}
}
