package atividades.atividade6e;

public class Conversao  //Atividade 1E
{
	
	public static void main (String[] args )
	{
		System.out.println("Tabela de conversão °C para °F: ");
		
		for(int c = 0; c <= 100; c++)
		{
			float f = (float) 9 / 5 * c + 32;
			System.out.printf("%3d °C%4c%8.1f °F\n", c, '=', f);
		}
		
	}
}
