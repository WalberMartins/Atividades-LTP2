package banco;

import java.util.Random;

public class Principal 
{
	public static void main(String[] args)
	{
		Banco banco = new Banco();
		int opcao = 0;
		while(opcao != 5)
		{
			menu();
			opcao = EntradaDados.leInt();
			processaOpcao(opcao, banco);
		}
		
	}
	
	private static void menu()
	{
		System.out.println("\n	1 - Criar conta");
		System.out.println("	2 - Remover conta");
		System.out.println("	3 - Atualizar saldo poupança");
		System.out.println("	4 - Selecionar conta");
		System.out.println("	5 - Encerrar programa");
		System.out.print("	    digite sua opção: ");
		
	}
	
	private static void subMenu()
	{
		System.out.println("\n	1 - Mostrar dados");
		System.out.println("	2 - Depositar");
		System.out.println("	3 - Sacar");
		System.out.println("	4 - Transferir");
		System.out.println("	5 - Voltar ao menu");
		System.out.print("	    Digite sua opção: ");
		
	}
	
	private static void processaOpcao(int opcao, Banco banco)
	{
		switch(opcao)
		{
		case 1:
			criarConta(banco);
			break;
		case 2:
			removerConta(banco);
			break;
		case 3:
			atualizarPoupanca(banco);
			break;
		case 4:
			selecionarConta(banco);
			break;
		case 5:
			System.out.println("Programa encerrado!");
			break;
		default:
			System.out.println("Opção inválida!");
		}
		
	}
	
	private static void criarConta(Banco banco)
	{
		ContaBancaria conta = obtemTipoConta();
		System.out.print("Digite seu nome: ");
		String nome = EntradaDados.leString();
		conta.setNomeTitular(nome);
		banco.inserirConta(conta);
		mostrarConta(conta);
		System.out.println("Criada com sucesso.");
	
	}
	
	private static void removerConta(Banco banco)
	{
		ContaBancaria conta = new Corrente();
		System.out.print("\nQual o número da conta? ");
		int num = EntradaDados.leInt();
		conta.setNumConta(num);
		ContaBancaria contaRemovida = banco.pesquisarConta(conta);
		if(banco.removerConta(contaRemovida))
		{
			mostrarConta(contaRemovida);
			System.out.println("Removida com sucesso.");
		}
		else
			System.out.println("Conta número "+conta.getNumConta()+" não existe.");
	}
	
	private static void atualizarPoupanca(Banco banco)
	{
		banco.calcularJurosPoupanca();
		System.out.println("\nSaldo de conta poupança atualizado.");
		
	}
	
	private static void selecionarConta(Banco banco)
	{
		ContaBancaria conta = new Corrente();
		System.out.print("\nDigite o número da conta: ");
		int opcao = EntradaDados.leInt();
		conta.setNumConta(opcao);
		conta = banco.pesquisarConta(conta);
		if(conta != null)
		{	
			do
			{
				subMenu();
				opcao = EntradaDados.leInt();
				switch(opcao)
				{
				case 1:
					mostrarConta(conta);
					break;
				case 2:
					depositar(conta);
					break;
				case 3:
					sacar(conta);
					break;
				case 4:
					transferir(conta, banco);
					break;
				}
			}while(opcao != 5);
		}
		else
			System.out.println("\nConta não existente!");
	}
	
	private static void depositar(ContaBancaria conta)
	{
		System.out.print("\nQuanto deseja depositar? R$");
		double valor = EntradaDados.leDouble();
		conta.depositar(valor);
		System.out.println("Depósito realizado com sucesso.");
	}
	
	private static void sacar(ContaBancaria conta)
	{
		System.out.print("\nQuanto deseja sacar? R$");
		double valor = EntradaDados.leDouble();
		while(true)
		{
			try
			{
				conta.sacar(valor);
				System.out.println("\nSaque realizado com sucesso.");
				break;
			}
			catch(NoBalanceException e)
			{
				System.out.println("\n"+e);
				System.out.print("Deseja tentar outro valor? [s/n] ");
				char tentar = EntradaDados.leString().toLowerCase().charAt(0);
				if(tentar == 's')
				{
					System.out.print("Digite o valor: R$");
					valor = EntradaDados.leDouble();
				}
				else
					break;
			}
			
		}
		
	}
	
	private static void transferir(ContaBancaria conta, Banco banco)
	{
		System.out.print("\nQuanto deseja transferir? R$");
		double valor = EntradaDados.leDouble();
		System.out.print("Digite o número da conta: ");
		int numConta = EntradaDados.leInt();
		ContaBancaria contaTransferir = new Corrente();
		contaTransferir.setNumConta(numConta);
		contaTransferir = banco.pesquisarConta(contaTransferir);
		try 
		{
			conta.transferir(valor, contaTransferir);
			System.out.println("Transferencia realizada com sucesso.");
		} 
		catch (NoBalanceException e) 
		{
			System.out.println(e);
		}
		
	}
	
	private static ContaBancaria obtemTipoConta()
	{
		String tipo;
		Random numConta = new Random();
		do
		{
			System.out.print("\nQual o tipo de conta ? [corrente, poupança, especial] " );
			tipo = EntradaDados.leString().toLowerCase().trim();
			if(!(tipo.equals("corrente") || tipo.equals("poupança") || tipo.equals("especial")))
				System.out.println("tipo inválido, tente novamente.");
		}
		while(!(tipo.equals("corrente") || tipo.equals("poupança") || tipo.equals("especial")));
		switch(tipo)
		{
		case "corrente":
			Corrente corrente = new Corrente((numConta.nextInt(100)+1), null, 0, 40);
			return corrente;
		case "poupança":
			Poupanca poupanca = new Poupanca((numConta.nextInt(100)+101), null, 0, 1);
			return poupanca;
		case "especial":
			Especial especial = new Especial((numConta.nextInt(100)+201), null, 0, 40, 500);
			return especial;
		}
		return null;
		
	}
	
	private static void mostrarConta(ContaBancaria conta)
	{
		System.out.println();
		if(conta instanceof Corrente)
			((Corrente)conta).mostrarDados();
		else if(conta instanceof Poupanca)
			((Poupanca)conta).mostrarDados();
		else
			((Especial)conta).mostrarDados();
	}
	
}
