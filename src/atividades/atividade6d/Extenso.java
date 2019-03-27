package atividades.atividade6d;

import java.util.Scanner;

public class Extenso  //Atividade 1D
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		boolean continuar = true;
		
		
		while(continuar)
		{
			System.out.print("Digite um número entre 0 e 5: ");
			int num = input.nextInt();
			
			switch (num)
			{
				case 0:
					System.out.print("Zero");
					break;
				case 1:
					System.out.print("Um");
					break;
				case 2:
					System.out.print("Dois");
					break;
				case 3:
					System.out.print("Três");
					break;
				case 4:
					System.out.print("Quatro");
					break;
				case 5:
					System.out.print("Cinco");
					break;
				default:
					if(num < 0)
						System.out.print("Número negativo!");
					if(num > 5)
						System.out.print("Número maior que cinco!");
			}
			
			System.out.print("\nDeseja executar novamente [s/n]? ");
			char resp = input.next().charAt(0);
			if(resp == 's')
				continuar = true;
			else
			{
				continuar = false;
				System.out.println("PROGRAMA TERMINADO!!!");
			}
			
		}
		input.close();
	}

}