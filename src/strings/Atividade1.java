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
		System.out.println("O tamanho da String é "+nome.length());
		if(nome.contains("A"))
			System.out.println("A primeira ocorrencia do 'a' é na posição "+(nome.indexOf("A")+1));
		else
			System.out.println("Seu nome não contém a letra 'a'.");
		
		input.close();
	}
	
}
