package arrays;

import java.util.Random;

public class Atividade3
{

	public static void main(String[] args)
	{
		Random numeros = new Random();
		double[] vetor = new double[20];
		double maior = 0;
		double menor = 0;
		int posMaior = 0;
		int posMenor = 0;
		
		for(int i = 0; i < vetor.length; i++)
		{
			vetor[i] = numeros.nextDouble() * 100;
			
			if ( i == 0)
			{
				menor = vetor[i];
				maior = vetor[i];
			}
			if (maior < vetor[i])
			{
				maior = vetor[i];
				posMaior = i+1;
			}
			if (menor > vetor[i])
			{
				menor = vetor[i];
				posMenor = i+1;
			}
			
		}
		double amplitude = maior - menor;
		
		System.out.print("vetor = [ ");
		for(double valor: vetor)
			System.out.printf("%.1f ", valor);
		System.out.println("]");
		
		System.out.printf("O maior é %.1f e está na posição %d. \n", maior, posMaior);
		System.out.printf("O menor é %.1f e está na posição %d. \n", menor, posMenor);
		System.out.printf("A amplitude é %.1f. \n", amplitude);
		
	}

}
