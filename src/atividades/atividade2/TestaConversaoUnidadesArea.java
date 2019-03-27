package atividades.atividade2;

import java.util.Scanner;

public class TestaConversaoUnidadesArea
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o comprimento e a largura do campo de futebol: [mts] ");
		double comprimento = input.nextDouble();
		double largura = input.nextDouble();
		
		System.out.println("Área: ");
		System.out.printf("	Em m²: %.2fm² \n", ConversaoUnidadesArea.paraM2(comprimento, largura));
		System.out.printf("	Em pés²: %.2fft² \n", ConversaoUnidadesArea.paraPes2(comprimento, largura));
		System.out.printf("	Em Acres: %.2fac \n", ConversaoUnidadesArea.paraAcres(comprimento, largura));
		System.out.printf("	Em Milhas²: %.4fmi² \n", ConversaoUnidadesArea.paraMilha2(comprimento, largura));
		input.close();
	}

}
