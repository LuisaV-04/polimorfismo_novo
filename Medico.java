package polimorfismo_novo;

public class Medico extends ProfissionalSaude{
	
	public Medico(String crm, String nome, String especialidade, int valorConsulta) {
		super(nome, especialidade, valorConsulta);
	}
	
	@Override
	
	public String agendarconsulta(String dataConsulta) {
		// dataConsulta = "Agendamento com Lucia para 10/01";
		return dataConsulta;
	}
}