package atividades.atividade3;

public class ConversaoUnidadesVolume
{
	public static double paraM3(double largura, double comprimento, double altura)
	{
		return largura * comprimento * altura;
	}
	
	public static double paraLitros(double largura, double comprimento, double altura)
	{
		return (paraM3(largura, comprimento, altura) * 1000);
	}
	
	public static double paraGalao(double largura, double comprimento, double altura)
	{
		return (paraLitros(largura, comprimento, altura) / 3.785);
	}
	
}
