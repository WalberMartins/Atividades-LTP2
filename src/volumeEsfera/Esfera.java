package volumeEsfera;

public class Esfera 
{
	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double volumeDaEsfera()
	{
		double volume = (double) 4 / 3 * Math.PI * Math.pow(raio, 3);
		return volume;
	}
	
}
