
public class Main {

	public static void main(String[] args) {
		
		 Banco bancoInicial = new Banco(); //instancia novo banco

	        bancoInicial.setNome("Dio Bank"); //insere nome do banco

	        Cliente JoaoSilva = new Cliente("João Silva", bancoInicial);  //criado novo cliente carla
	         JoaoSilva.setNome("João Silva"); //insere o nome do cliente

	        Conta ccorrente = new ContaCorrente(JoaoSilva); //instanciada nova conta corrente

	        ccorrente.depositar(100); //criado um deposito em conta corrente

	        Cliente Ricardo = new Cliente("Ricardo Santos", bancoInicial);  //instancia novo cliente
	        Conta cpoupanca = new ContaPoupanca(Ricardo);  //instanciada nova conta poupanca

	        ccorrente.imprimirExtrato();  //imprime extrato de ccorrente Joao
	        cpoupanca.imprimirExtrato();  //imprime estrato de cpoupanca Ricardo

	        ccorrente.transferir(40, cpoupanca);  //faz tranferencia de ccorrente carla pra cpoupanca alisson

	        ccorrente.imprimirExtrato(); //imprime extrato atualizado de ccorrente Joao
	        cpoupanca.imprimirExtrato(); //imprime extrato atualizado de cpoupanca Ricardo
	        bancoInicial.mostrarClientes(); //mostra lista de clientes

	        Cliente Marcos = new Cliente("Marcos", bancoInicial);  //instancia novo cliente carolina
	        Conta ccorrente2 = new ContaCorrente(Marcos); //instancia nova ccorrente2 de carolina
	        ccorrente2.imprimirExtrato();  //imprime  ccorrente2 de carolina
	        bancoInicial.mostrarClientes(); //mostra lista atualizada de clientes do banco
	    }
	}


