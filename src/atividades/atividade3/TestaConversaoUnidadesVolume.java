package atividades.atividade3;

import java.util.Scanner;

public class TestaConversaoUnidadesVolume
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite respectivamente a largura, o comprimento e a altura da piscina: [mts] ");
		double largura = input.nextDouble();
		double comprimento = input.nextDouble();
		double altura = input.nextDouble();

		System.out.printf("A piscina tem %.2fm² ", ConversaoUnidadesVolume.paraM3(largura, comprimento, altura));
		System.out.printf("e tem capacidade para %.2f litros. \n", ConversaoUnidadesVolume.paraLitros(largura, comprimento, altura));
		System.out.printf("Para encher a piscina é preciso de %.2f galões.", 
				ConversaoUnidadesVolume.paraGalao(largura, comprimento, altura));
		input.close();
	}

}
