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
		
		System.out.println("�rea: ");
		System.out.printf("	Em m�: %.2fm� \n", ConversaoUnidadesArea.paraM2(comprimento, largura));
		System.out.printf("	Em p�s�: %.2fft� \n", ConversaoUnidadesArea.paraPes2(comprimento, largura));
		System.out.printf("	Em Acres: %.2fac \n", ConversaoUnidadesArea.paraAcres(comprimento, largura));
		System.out.printf("	Em Milhas�: %.4fmi� \n", ConversaoUnidadesArea.paraMilha2(comprimento, largura));
		input.close();
	}

}
