package volumeEsfera;

import java.util.Scanner;

public class TestaEsfera
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Esfera esfera = new Esfera();
		
		System.out.println("[0 para parar]");
		do
		{
			System.out.print("Informe o raio da esfera: ");
			esfera.setRaio(input.nextDouble());
			if (esfera.getRaio() != 0)
				System.out.printf("Raio = %.2f \nVolume = %.2f \n\n", esfera.getRaio(), esfera.volumeDaEsfera());
			else
				System.out.println("PROGRAMA ENCERRADO!!!");
		}while(esfera.getRaio() != 0.0);
		
		input.close();
	}
	
}
