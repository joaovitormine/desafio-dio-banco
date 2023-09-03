
public class Main {

	public static void main(String[] args) {
		Cliente joao = new Cliente();
		joao.setNome("Joao Vitor");
		
		Conta cc = new ContaCorrente(joao);
		cc.depositar(100);
		
		
		Conta poupanca = new ContaPoupanca(joao);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
