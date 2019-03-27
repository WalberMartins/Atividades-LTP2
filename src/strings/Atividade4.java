package strings;

import java.util.Scanner;

public class Atividade4
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String numeros;
		
		System.out.print("Digite um número com 4 digitos: ");
		numeros = input.nextLine().trim();
		
		for(int i = 0; i < numeros.length(); i++)
		{
			switch(numeros.charAt(i))
			{
			case '0':
				System.out.print("zero");
				break;
			case '1':
				System.out.print("um");
				break;
			case '2':
				System.out.print("dois");
				break;
			case '3':
				System.out.print("três");
				break;
			case '4':
				System.out.print("quatro");
				break;
			case '5':
				System.out.print("cinco");
				break;
			case '6':
				System.out.print("seis");
				break;
			case '7': 
				System.out.print("sete");
				break;
			case '8':
				System.out.print("oito");
				break;
			case '9':
				System.out.print("nove");
			}
			
			if(i != numeros.length()-1)
				System.out.print(", ");
			else
				System.out.println(".");		
		}
		input.close();
	}

}
