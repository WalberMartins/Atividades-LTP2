package strings;

import java.util.Scanner;

public class Atividade1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String nome;
		
		System.out.print("Digite seu nome completo: ");
		nome = input.nextLine().trim().toUpperCase();
		System.out.println("O tamanho da String � "+nome.length());
		if(nome.contains("A"))
			System.out.println("A primeira ocorrencia do 'a' � na posi��o "+(nome.indexOf("A")+1));
		else
			System.out.println("Seu nome n�o cont�m a letra 'a'.");
		
		input.close();
	}
	
}
