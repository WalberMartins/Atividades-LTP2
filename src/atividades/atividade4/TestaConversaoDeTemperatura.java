package atividades.atividade4;

import java.util.Scanner;

public class TestaConversaoDeTemperatura
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("De qual escala C [Celsius], F [Fahrenheit] ou K [Kelvin]: ");
		char de = input.next().toUpperCase().charAt(0);
		System.out.print("Digite uma temperatura: ");
		double temperatura = input.nextDouble();
		System.out.print("Deseja converter para qual escala: ");
		char para = input.next().toUpperCase().charAt(0);
		System.out.println();
		
		switch(de)
		{
		case 'C':
			if(para == 'C')
				System.out.printf("%.1f°C", temperatura);
			if(para == 'F')
				System.out.printf("%.1f°C = %.1f°F", temperatura, ConversaoDeTemperatura.cparaF(temperatura));
			if(para == 'K')
				System.out.printf("%.1f°C = %.1f°K", temperatura, ConversaoDeTemperatura.cparaK(temperatura));
			break;
		case 'F':
			if(para == 'C')
				System.out.printf("%.1f°F = %.1f°C", temperatura, ConversaoDeTemperatura.fparaC(temperatura));
			if(para == 'F')
				System.out.printf("%.1f°F", temperatura);
			if(para == 'K')
				System.out.printf("%.1f°F = %.1f°K", temperatura, ConversaoDeTemperatura.fparaK(temperatura));
			break;
		case 'K':
			if(para == 'C')
				System.out.printf("%.1f°K = %.1f°C", temperatura, ConversaoDeTemperatura.kparaC(temperatura));
			if(para == 'F')
				System.out.printf("%.1f°K = %.1f°F", temperatura, ConversaoDeTemperatura.kparaF(temperatura));
			if(para == 'K')
				System.out.printf("%.1f°K", temperatura);
			break;
		}
		input.close();
	}
	
}
