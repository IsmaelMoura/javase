package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.setCliente("Leandro Ramos");
		cc1.setSaldo(10000);
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		cc1.sacar(1000);
		cc1.exibirSaldo();
		cc1.depositar(1000);
		cc1.exibirSaldo();
		System.out.println("___________________________________");

		Conta cc2 = new Conta();
		cc2.setCliente("Airlton Santos");
		cc2.setSaldo(5000);
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirSaldo();
		cc2.sacar(1000);
		cc2.exibirSaldo();
		cc2.depositar(7000);
		cc2.exibirSaldo();
		System.out.println("___________________________________");
		System.out.println("Transfer�ncia");
		cc1.transferir(cc2, 2000);
		System.out.println("");
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		System.out.println("Favorecido: " + cc2.getCliente());
		cc2.exibirSaldo();
		
		

	}

}
