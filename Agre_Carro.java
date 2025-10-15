package polimorfismo_novo;

public class Agre_Carro {
	
	private String modelo;
	private Agre_Motor motor; //Agregação
	
	public Agre_Carro(String modelo, Agre_Motor motor) {
		this.modelo = modelo;
		this.motor = motor;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
