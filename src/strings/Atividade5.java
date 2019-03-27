package strings;

import java.util.Scanner;

public class Atividade5
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String frase;
		int palavras = 0;
		
		System.out.print("Digite um frase: ");
		frase = input.nextLine().trim();
		
		for(int i = 0; i < frase.length(); i++)
		{
			if(frase.charAt(i) == ' ' || i == frase.length()-1)
				palavras++;
			
		}
		
		System.out.println("Essa frase '"+frase+"' tem "+palavras+" "+(palavras>1 ? "palavras." : "palavra."));
		
		input.close();
	}

}
