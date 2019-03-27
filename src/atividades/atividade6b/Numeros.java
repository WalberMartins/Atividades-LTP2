package atividades.atividade6b;

import java.util.Scanner;

public class Numeros  //Atividade 1B
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		float[] numeros = new float[4];
		boolean continuar = true;
		
		while(continuar)
		{
			for(int n = 0; n < numeros.length; n++)
			{
				System.out.printf("Digite o %d° número real: ", n+1);
				numeros[n] = input.nextFloat();
			}
			
			float soma = numeros[0] + numeros[1];
			float produto = numeros[2] * numeros[3];
			
			if (soma > produto)
				System.out.printf("A soma dos dois primeiros é maior que o produto dos dois últimos.");
			else if (soma < produto)
				System.out.printf("A soma dos dois primeiros é menor que o produto dos dois últimos.");
			else
				System.out.printf("A soma dos dois primeiros é igual a o produto dos dois últimos.");
			
			System.out.printf("\n%.2f + %.2f = %.2f \n%.2f x %.2f = %.2f", 
					numeros[0], numeros[1], soma, numeros[2], numeros[3], produto);
			
			System.out.print("\nDeseja executar o programa novamente [s/n]: ");
			char resp = input.next().charAt(0);
			if(resp == 's')
				continuar = true;
			else
			{
				continuar = false;
				System.out.println("PROGRAMA TERMINADO!");
			}
			
		}
		input.close();
	}

}
