package aeroporto;

import avioes.Aviao;

public class Hangar {

	public static void main(String[] args) {
		Aviao boeing777 = new Aviao();
		boeing777.ano = 2016;
		boeing777.cor = "Branco";
		boeing777.envergadura = 64.8;
		boeing777.tremPouso = false;
		System.out.println("Avião: Boeing-777");
		System.out.println("Ano: " + boeing777.ano);
		System.out.println("Cor: " + boeing777.cor);
		System.out.println("Envergadura: " + boeing777.envergadura);
		boeing777.ligar();
		boeing777.acelerar();
		boeing777.aterrizar();
		if (boeing777.tremPouso == true) {
			boeing777.aterrizar();
		} else {
			System.out.println("ARREMETER!");
		}
		System.out.println("______________________________________");

		Aviao beluga = new Aviao();
		beluga.ano = 1995;
		beluga.cor = "Cinza";
		beluga.envergadura = 44.84;
		System.out.println("Avião: Airbus Beluga");
		System.out.println("Ano: " + beluga.ano);
		System.out.println("Cor: " + beluga.cor);
		System.out.println("Envergadura: " + beluga.envergadura);
		beluga.ligar();
		beluga.acelerar();
		System.out.println("______________________________________");

	}

}
