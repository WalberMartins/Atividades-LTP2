package atividades.atividade6g;

import java.util.Scanner;

public class Mdc  //Atividade 1G
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite dois números inteiros: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		int maior = Math.max(num1, num2);
		int menor = Math.min(num1, num2);
		int resto;
		
		do
		{ 
			resto = maior % menor;
			if(resto != 0)
			{
				maior = menor;
				menor = resto;
			}
		}while(resto != 0);
		
		System.out.printf("O M.D.C de (%d, %d) é %d.", num1, num2, menor);
		input.close();
	}

}