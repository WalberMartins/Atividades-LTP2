package atividades.atividade4;

public class ConversaoDeTemperatura
{
	public static double cparaF(double c)
	{
		return ((double) 9 / 5 * c + 32);
	}
	
	public static double fparaC(double f)
	{
		return ((double) 5 / 9 * (f - 32));
	}
	
	public static double cparaK(double c)
	{
		return (c + 273.15);
	}
	
	public static double kparaC(double k)
	{
		return (k - 273.15);
	}
	
	public static double fparaK(double f)
	{
		return (cparaK(fparaC(f)));
	}
	
	public static double kparaF(double k)
	{
		return (cparaF(kparaC(k)));
	}
	
}
