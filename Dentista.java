package polimorfismo_novo;

public class Dentista extends ProfissionalSaude{
	
	public Dentista(String cro, String nome, String especialidade, int valorConsulta) {
		super(nome, especialidade, valorConsulta);
	}
	
	@Override	
	public String agendarconsulta(String dataConsulta) {
		return dataConsulta;
	}
}