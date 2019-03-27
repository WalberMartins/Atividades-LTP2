package banco;

public class Especial extends Corrente implements Imprimivel
{
	private double limite;
	
	public Especial(int numConta, String titularConta, double saldo, double txSemFundo, double limite)
	{
		super(numConta, titularConta, saldo, txSemFundo);
		this.limite = limite;
	}
	
	public void sacar(double valor) throws NoBalanceException 
	{
		double saldo = super.getSaldo() + this.getLimite();
		if(saldo >= valor) 
			super.setSaldo(super.getSaldo() - valor);
		else 
		{
		   super.setSaldo(this.getSaldo() - super.getTxSemFundo());
		   throw new NoBalanceException();
		}
		
	}
	
	public void mostrarDados() 
	{
		System.out.println("Conta especial: "+super.toString()
		              +", \n\t\tTaxa falta fundos = R$ "+ super.getTxSemFundo()
		              +", \n\t\tLimite de crédito  =  R$ "+ limite);
	}

	public double getLimite() 
	{
		return limite;
	}

	public void setLimite(double limite) 
	{
		this.limite = limite;
	}
	
}
