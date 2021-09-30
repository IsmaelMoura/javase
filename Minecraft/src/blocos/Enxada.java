package blocos;

public class Enxada extends Blocos {

	public Enxada() throws InterruptedException {
		super();
	}

	public boolean conquista;

	/**
	 * arar
	 */
	public void arar() {
		System.out.println("Terra arada!");
	}

	/**
	 * minerar
	 */
	public void minerar() {
		System.out.println("Você causou 5 de dano!");
	}

}
