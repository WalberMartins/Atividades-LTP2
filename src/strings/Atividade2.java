package strings;

import java.util.Scanner;

public class Atividade2
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String frase;
		
		System.out.print("Digite uma frase: ");
		frase = input.nextLine().trim().toUpperCase();
		System.out.println("A quantidade de caracteres � "+frase.length()+".");
		System.out.println(frase.toUpperCase());
		System.out.println(frase.toLowerCase());
		if(frase.contains("RIO"))
			System.out.println("A string cont�m as letras 'rio'.");
		else
			System.out.println("N�o cont�m as letras 'rio'.");
		
		input.close();
	}

}
