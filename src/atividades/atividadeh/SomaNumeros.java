package atividades.atividadeh;

import java.util.Scanner;

public class SomaNumeros  //Atividade 1H  
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("[0 para Parar]\nDigite um n�mero:");
		
		int num, soma = 0;
		
		do
		{
			num = input.nextInt();
			soma += num;
		}while(num != 0);
		
		System.out.printf("A soma dos n�meros lidos � %d.", soma);
		input.close();
	}
	
}
