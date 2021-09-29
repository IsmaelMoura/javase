package interacao;

import blocos.Blocos;

public class interacaoBloco {

	public static void main(String[] args) throws InterruptedException {
		Blocos grama = new Blocos();
		grama.resistencia = 10;
		grama.textura = "Grama";
		System.out.println("* " + grama.textura + " *");
		System.out.println("Resistência: " + grama.resistencia);
		grama.minerar();
		grama.construir();
		System.out.println("__________________________");

		Blocos madeira = new Blocos();
		madeira.resistencia = 20;
		madeira.textura = "Tronco de carvalho";
		System.out.println("* " + madeira.textura + " *");
		System.out.println("Resistência: " + madeira.resistencia);
		madeira.minerar();
		madeira.craftar();
		madeira.construir();

	}

}
