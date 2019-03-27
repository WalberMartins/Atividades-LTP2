package atividades.atividade1;

public class Maior
{
	public static double maior(double num1, double num2)
	{
		return (num1 > num2) ? num1: num2;
	}
	
	public static double maior(double num1, double num2, double num3)
	{
		double maior = maior(num1, num2);
		return (maior > num3) ? maior: num3;
	}
	
	public static double maior(double num1, double num2, double num3, double num4)
	{
		double maior = maior(num1, num2, num3);
		return (maior > num4) ? maior: num4;
	}
	
	public static double maior(double num1, double num2, double num3, double num4, double num5)
	{
		double maior = maior(num1, num2, num3, num4);
		return (maior > num5) ? maior: num5;
	}
	
}
