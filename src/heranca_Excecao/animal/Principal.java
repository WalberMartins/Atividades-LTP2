package heranca_Excecao.animal;

public class Principal 
{

	public static void main(String[] args) 
	{
		Animal animal;
		Cao cachorro = new Cao("Tody", "Walber");
		cachorro.nascer();
		Gato gato = new Gato("Felix", "Walber");
		gato.nascer();
		
		animal = cachorro;
		try 
		{
			animal.som();
		} 
		catch (IsDeadException e) 
		{
			System.out.println(e);
		}
		
		animal = gato;
		try 
		{
			animal.som();
		} 
		catch (IsDeadException e) 
		{
			System.out.println(e);
		}

	}

}
