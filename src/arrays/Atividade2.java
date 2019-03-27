package arrays;

import java.util.Scanner;

public class Atividade2
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double[] mediaFinal = new double[10];
		int conceitoA = 0;
		int aprovados = 0;
		int reprovados = 0;
		int semRendimento = 0;
		
		for (int i = 0; i < mediaFinal.length; i++)
		{
			System.out.printf("Digite a %dª média: ", i+1);
			mediaFinal[i] = input.nextDouble();
			
			if (mediaFinal[i] >= 9)
				conceitoA++;
			if (mediaFinal[i] >= 5)
				aprovados++;
			if (mediaFinal[i] < 5)
				reprovados++;
			if(mediaFinal[i] == 0)
				semRendimento++;
		}
		System.out.printf("\nMédia da turma: \nConceito A = %d\nAprovados = %d\n"
				+ "Reprovados = %d\nSem Rendimento = %d", conceitoA, aprovados,
				reprovados, semRendimento);
		input.close();
	}

}
