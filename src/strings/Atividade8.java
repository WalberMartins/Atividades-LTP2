package strings;

public class Atividade8
{
	public static void main(String[] args)
	{
		String texto = "JAVA";
		
		for(int i = 0; i < texto.length(); i++)
		{
			for(int j = 0; j < i+1; j++)
				System.out.print(texto.charAt(j));
			System.out.println();	
		}
	
	}
	
}