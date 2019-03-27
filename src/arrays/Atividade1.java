package arrays;

import java.util.Scanner;

public class Atividade1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] vetor = new int[8];
		int maior = 0;
		int menor = 0;
		
		for(int i = 0; i < vetor.length; i++)
		{
			System.out.printf("Digite o %d° número: ", i+1);
			vetor[i] = input.nextInt();
			
			if (i == 0)
			{
				maior = vetor[i];
				menor = vetor[i];
			}
			if (maior < vetor[i])
				maior = vetor[i];
			if (menor > vetor[i])
				menor = vetor[i];
		}
		System.out.println("\nO maior número é "+maior+", e o menor é "+menor+'.');
		input.close();
	}
	
}
