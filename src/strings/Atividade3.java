package strings;

import java.util.Scanner;

public class Atividade3
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String frase;
		
		System.out.print("Digite uma frase: ");
		frase = input.nextLine().trim().toUpperCase();
		
		for(int i = 0; i < frase.length(); i++)
		{
			if(frase.charAt(i) != ' ')
				System.out.println(frase.charAt(i));
		}
		input.close();
	}

}
