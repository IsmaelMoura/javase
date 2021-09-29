package interacao;

import blocos.Enxada;

public class interacaoEnxada {

	public static void main(String[] args) throws InterruptedException {
		Enxada enxada = new Enxada();
		enxada.conquista = true;

		if (enxada.conquista == true) {
			enxada.arar();
			System.out.println("- Conquista desbloquada : Hora de Plantar!");
		} else {
			enxada.minerar();
		}
	}
}
