package atividades.atividade6c;

import java.util.Scanner;

public class Maior  //Atividade 1C
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] numeros = new int[3];
		boolean continuar = true;
		
		while(continuar)
		{
			for(int n = 0; n < numeros.length; n++)
			{
				System.out.printf("Digite o %d° número inteiro: ", n+1);
				numeros[n] = input.nextInt();
			}
			
			int maior = Math.max(numeros[0], Math.max(numeros[1], numeros[2]));
			
			System.out.printf("Entre os números %d, %d e %d o maior é %d.", numeros[0], numeros[1], numeros[2], maior);
			
			System.out.print("\nDeseja verificar novamente [s/n]? ");
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
