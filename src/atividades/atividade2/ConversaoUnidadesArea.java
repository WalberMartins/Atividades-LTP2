package atividades.atividade2;

public class ConversaoUnidadesArea
{
	
	public static double paraM2(double comprimento, double largura)
	{
		return comprimento * largura;
	}
	
	public static double paraPes2(double comprimento, double largura)
	{
		return (paraM2(comprimento, largura) * 10.76f);
	}
	
	public static double paraAcres(double comprimento, double largura)
	{
		return (paraPes2(comprimento, largura) / 43560); 
	}
	
	public static double paraMilha2(double comprimento, double largura)
	{
		return (paraAcres(comprimento, largura) / 640);
	}
	
}
