package strings;

import java.util.Scanner;

public class Atividade6
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		char[] inicial = new char[10];
		int c = 1;
		
		System.out.print("Digite seu nome completo: ");
		String nome = input.nextLine().trim().toUpperCase();
		
		for (int i = 0; i < nome.length(); i++)
		{
			if (i == 0)
				inicial[i] = nome.charAt(i);
			if(nome.charAt(i) == ' ')
			{
				inicial[c] = nome.charAt(i+1);
				c++;
			}
			
		}
		
		String iniciais = new String(inicial);
		System.out.print("Suas iniciais são '"+iniciais.trim()+"'.");
		
		input.close();
	}

}
