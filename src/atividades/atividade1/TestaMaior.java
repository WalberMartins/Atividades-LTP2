package atividades.atividade1;

import java.util.Random;

public class TestaMaior
{

	public static void main(String[] args)
	{
		Random r = new Random();
		double[] numeros = new double[5];
		
		System.out.print("Dos números: ");
		for(int i = 0; i < numeros.length; i++)
		{
			numeros[i] = r.nextInt(100);
			System.out.print(numeros[i]+(i == numeros.length-1 ? "\n": ", "));
		}
		
		double maior = Maior.maior(numeros[0], numeros[1], numeros[2], numeros[3], numeros[4]);	
		System.out.println("O maior é "+maior+".");
	}

}
