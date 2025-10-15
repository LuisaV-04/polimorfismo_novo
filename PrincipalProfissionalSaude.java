package polimorfismo_novo;

public class PrincipalProfissionalSaude {

	public static void main(String[] args) {
		
			Medico medico = new Medico("123456","Márcio", "Oftalmologia", 250);
			System.out.println(medico.getNome());
			System.out.println(medico.geteEspecialidade());
			System.out.println(medico.getValorConsulta());
			System.out.println(medico.agendarconsulta("Agendamento com Lucia para 10/01"));
			
			System.out.println("");
			
			Dentista dentista = new Dentista("98765","Débora", "Ortodontia", 300);
			System.out.println(dentista.getNome());
			System.out.println(dentista.geteEspecialidade());
			System.out.println(dentista.getValorConsulta());
			System.out.println(dentista.agendarconsulta("Agendamento com Lucia para 10/01"));
			
			System.out.println("");
			
			Fisioterapeuta fisioterapeuta = new Fisioterapeuta ("3/45678-F","Letícia", "traumato-ortopédica", 800);
			System.out.println(fisioterapeuta.getNome());
			System.out.println(fisioterapeuta.geteEspecialidade());
			System.out.println(fisioterapeuta.getValorConsulta());
			System.out.println(fisioterapeuta.agendarconsulta("Agendamento com Lucia para 10/01"));
	}

}
