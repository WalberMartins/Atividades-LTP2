package atividades.atividade6f;

public class Multiplos  //Atividade 1F
{

	public static void main(String[] args)
	{
		System.out.println("Múltiplos de 3 e 4 entre 10 e 200: ");
		
		for(int m = 10; m <= 200; m++)
		{
			if(m % 3 == 0 && m % 4 == 0)
				System.out.printf("%d\n", m);
		}

	}

}
