package seguros;

import contas.Conta;

public class SeguroPessoaFisica extends Conta {

	public static void main(String[] args) {
		SeguroPessoaFisica cc3 = new SeguroPessoaFisica();
		cc3.setCliente("Jason Momoa");
		cc3.setSaldo(7500);
		System.out.println("Cliente: " + cc3.getCliente());
		cc3.exibirSaldo();
		cc3.sacar(6000);
		cc3.exibirSaldo();
		cc3.depositar(1000);
		cc3.exibirSaldo();

	}
}
