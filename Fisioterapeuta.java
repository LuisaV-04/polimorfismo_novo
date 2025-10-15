package polimorfismo_novo;

public class Fisioterapeuta extends ProfissionalSaude{

	public Fisioterapeuta(String crefito, String nome, String especialidade, int valorConsulta) {
		super(nome, especialidade, valorConsulta);
	}
	
	@Override
	
	public String agendarconsulta(String dataConsulta) {
		// dataConsulta = "Agendamento com Cristina para 14/01";
		return dataConsulta;
	}
}
