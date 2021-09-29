package garagem;

import carros.Carro;

public class Patio {

	public static void main(String[] args) {
		Carro camaro = new Carro();
		camaro.ano = 2007;
		camaro.cor = "Amarelo";
		System.out.println("Carro: Camaro");
		System.out.println("Ano: " + camaro.ano);
		System.out.println("Cor: " + camaro.cor);
		camaro.ligar();
		camaro.desligar();
		System.out.println("____________________________________");

		Carro cayman = new Carro();
		cayman.ano = 2021;
		cayman.cor = "Prata";
		System.out.println("Carro: Porsche Cayman");
		System.out.println("Ano: " + cayman.ano);
		System.out.println("Cor: " + cayman.cor);
		cayman.ligar();
		cayman.desligar();
		System.out.println("____________________________________");
	}

}
