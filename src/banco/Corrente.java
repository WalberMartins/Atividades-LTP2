package banco;

public class Corrente extends ContaBancaria implements Imprimivel
{
	private double txSemFundo;
	
	public Corrente()
	{
		this(0, null, 0.0, 0.0);
	}
	
	public Corrente(int numConta, String nomeTitular, double saldo, double txSemFundo)
	{
		super(numConta, nomeTitular, saldo);
		this.txSemFundo = txSemFundo;
	}
	
	public void sacar(double valor) throws NoBalanceException 
	{
		   double saldo = this.getSaldo();
		   if(saldo >= valor) 
		   {
				saldo -= valor;
				super.setSaldo(saldo);
		   }
		   else 
		   {
		        saldo -= this.txSemFundo;
		        super.setSaldo(saldo);
		        throw new NoBalanceException();
		   }
	}
	       
	public void mostrarDados() 
	{
		System.out.println("Conta corrente: "+super.toString()
		                  +",\n\t\tTaxa falta fundos = R$ "+ txSemFundo);
	}

	public double getTxSemFundo() 
	{
		return txSemFundo;
	}

	public void setTxSemFundo(double txSemFundo) 
	{
		this.txSemFundo = txSemFundo;
	}
	
}
