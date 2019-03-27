package contaBancaria;

import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		Conta c = new Conta(123, "Maria", 1000.00, 500.00);
		System.out.println("\nSituação da conta");
		System.out.println(c.toString());
		char continuar = 'S';
		char oper;
		Scanner input = new Scanner(System.in);
		do{
			System.out.print("Tecle D (deposito) ou S(saque): ");
			oper = input.next().charAt(0);
			if(oper == 'D' || oper =='d'){
				System.out.print("Informe valor do depósito: ");
				double vrDep = input.nextDouble();
				c.depositar(vrDep);
				System.out.println("Depósito realizado com sucesso. ");
			}
			if(oper == 'S' || oper =='s'){
				System.out.print("Informe valor do saque: ");
				double vrSaq = input.nextDouble();
				if(c.sacar(vrSaq))
					System.out.println("Saque realizado com sucesso. ");
				else
					System.out.println("Não há saldo suficiente. ");
			}
			System.out.println("\nSituação da conta após transação");
			System.out.println(c.toString());
			System.out.print("\nDeseja realizar outra transação?(S/N) ");
			continuar = input.next().charAt(0);
		}while (continuar == 'S' || continuar == 's');
		System.out.print("\nPrograma encerrado. Obrigado!!! ");
		input.close();
	}

}
