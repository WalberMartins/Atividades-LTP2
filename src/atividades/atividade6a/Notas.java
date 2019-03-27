package atividades.atividade6a;

import java.util.Scanner;

public class Notas  //Atividade 1A
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		float[] notas = new float[3];
		boolean continuar = true;
		
		while(continuar)
		{
			for(int n = 0; n < notas.length; n++)
			{
				System.out.printf("Digite a %dª nota: ", n+1);
				notas[n] = input.nextFloat();
			}
			
			float media = (notas[0] * 2 + notas[1] * 4 + notas[2] * 2) / (2 + 4 + 2);
			
			displayNotas(notas, media);
			
			System.out.print("\n\nDeseja calcular novamente [s/n]: ");
			char resp = input.next().charAt(0);
			if (resp == 's')
				continuar = true;
			else
			{
				continuar = false;
				System.out.print("PROGRAMA FINALIZADO!");
			}
			
		}
		input.close();
	}
	
	public static void displayNotas(float[] notas, float media)
	{
		System.out.println("\nNotas:");
		for(int i = 0; i < notas.length; i++)
			System.out.printf("nota%d%4c%8.2f\n", i+1, '=', notas[i]);
		
		System.out.printf("Média%4c%8.2f", '=', media);
	}

}
