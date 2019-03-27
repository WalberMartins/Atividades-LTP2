package calcular_IMC;

public class Paciente
{
	private double peso;
	private double altura;
	
	public Paciente(double peso, double altura)
	{
		this.peso = peso;
		this.altura = altura;
	}
	
	public double getPeso()
	{
		return peso;
	}

	public void setPeso(double peso)
	{
		this.peso = peso;
	}

	public double getAltura()
	{
		return altura;
	}

	public void setAltura(double altura)
	{
		this.altura = altura;
	}

	public double calcularIMC()
	{
		double IMC = peso / Math.pow(altura, 2);
		return IMC;
	}
	
	public String diagnostico()
	{
		double IMC = calcularIMC();
		if (IMC < 16)
			return "Baixo peso muito grave";
		else if (IMC < 17)
			return "Baixo peso grave";
		else if (IMC < 18.5)
			return "Baixo peso";
		else if (IMC < 25)
			return "Peso normal";
		else if (IMC < 30)
			return "Sobrepeso";
		else if (IMC < 35)
			return "Obsidade grau 1";
		else if (IMC < 40)
			return "Obesidade grau 2";
		else
			return "Obesidade Mórbida";
	}
	
}
