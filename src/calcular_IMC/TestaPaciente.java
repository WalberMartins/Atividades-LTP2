package calcular_IMC;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestaPaciente
{
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		boolean continuar = true;
		
		while(continuar)
		{	
			System.out.print("Digite seu peso [Kg]: ");
			double peso = leDouble();
			System.out.print("Agora digite sua altura [M]: ");
			double altura = leDouble();
			Paciente paciente = new Paciente(peso, altura);
			
			System.out.printf("Seu IMC é %.1f\nDiagnóstico: %S\n", paciente.calcularIMC(),
					paciente.diagnostico());
			
			System.out.print("Deseja executar novamente [s/n]? ");
			char resp = input.next().charAt(0);
			if (resp == 's' || resp == 'S')
				continuar = true;
			else
			{
				continuar = false;
				System.out.println("PROGRAMA TERMINADO!!!");
			}
			
		}
		
	}
	
	private static double leDouble()
	{
		while(true)
		{
			try
			{
				double n = input.nextDouble();
				return n;
			}
			catch (InputMismatchException e)
			{
				System.out.print(e + " - Não é um número real!!!\nTente novamente: ");
				input.nextLine();
			}
			
		}
		
	}
	
}
