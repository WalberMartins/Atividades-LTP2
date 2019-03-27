package strings;

import java.util.Scanner;

public class Atividade7
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String frase;
		String palavra;
		String troca;
		String novaFrase;
		
		System.out.print("Digite uma frase: ");
		frase = input.nextLine().trim();
		System.out.print("Agora digite a palavra que será trocada: ");
		palavra = input.nextLine().trim();
		System.out.print("Por qual palavra: ");
		troca = input.nextLine().trim();
		
		novaFrase = frase.replace(palavra, troca);
	
		System.out.println("A nova frase é '"+novaFrase+"'.");
		
		input.close();
	}

}
