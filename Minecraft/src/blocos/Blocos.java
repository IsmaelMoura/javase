package blocos;

public class Blocos {
	public int resistencia;
	public String textura;

	public Blocos() throws InterruptedException {
		System.out.print("Iniciando o jogo");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		System.out.println("");
		System.out.println("___  ___                             __ _   ");
		Thread.sleep(220);
		System.out.println("|  \\/  |                            / _| |  ");
		Thread.sleep(220);
		System.out.println("| .  . |_ _ __   ___  ___ _ __ __ _| |_| |_ ");
		Thread.sleep(220);
		System.out.println("| |\\/| | | '_ \\ / _ \\/ __| '__/ _` |  _| __|");
		Thread.sleep(220);
		System.out.println("\\_|  |_/_|_| |_|\\___|\\___|_|  \\__,_|_|  \\__|");
		Thread.sleep(220);
		System.out.println("");
		System.out.println("JOGO INICIADO!");
		System.out.println("");

	}

	/**
	 * construir
	 */
	public void construir() {
		System.out.println("Você colocou um bloco");
	}

	/**
	 * minerar
	 */
	public void minerar() {
		System.out.println("Você minerou um bloco");
	}

	/**
	 * craftar
	 */
	public void craftar() {
		System.out.println("Você craftou um item");
	}

}
