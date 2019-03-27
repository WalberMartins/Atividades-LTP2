package arrays;

import java.util.Random;

public class Atividade4
{
	public static void main(String[] args)
	{
		int[] vetor = new int[10];
		Random numeros = new Random();
		
		System.out.print("vetor = [");
		for(int i = 0; i < vetor.length; i++)
		{
			vetor[i] = numeros.nextInt(10);
			System.out.print(vetor[i]);
			System.out.print(""+(i<vetor.length-1?", ":""));
		}
		System.out.println("]");
		
		int aux, j = 0;
		for(int n = vetor.length-1; n >= vetor.length/2; n--)
		{
				aux = vetor[j];
				vetor[j] = vetor[n];
				vetor[n] = aux;
				if(j < vetor.length/2)
					j++;
		}
			
		System.out.print("\nvetor reposicionado:\n");
		System.out.print("vetor = [");
		for(int i = 0; i < vetor.length; i++)
		{
			System.out.print(vetor[i]);
			System.out.print(""+(i<vetor.length-1?", ":""));
		}
		System.out.println("]");
		
	}
	
}