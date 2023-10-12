public class Banco {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
		cliente.setName("Thiago");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.depositar(10000);
		cc.transferir(5000, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
