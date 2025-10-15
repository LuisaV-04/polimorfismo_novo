package polimorfismo_novo;

public class MainCarro {

	public static void main(String[] args) {
		
		Agre_Motor motor = new Agre_Motor("V8");
		Agre_Carro carro = new Agre_Carro("Mustang", motor);
		
		System.out.println("Carro é: " + carro.getModelo() + "\nMotor " + motor.getTipo());

	}

}
