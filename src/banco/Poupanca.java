package banco;

public class Poupanca extends ContaBancaria implements Imprimivel
{
	private double percJuro;
	
	public Poupanca(int numConta, String nomeTitular, double saldo, double percJuro)
	{
		super(numConta, nomeTitular, saldo);
		this.percJuro = percJuro;
	}
	
	public void sacar(double valor) throws NoBalanceException 
	{
		double saldo = this.getSaldo();
		if(saldo >= valor) 
		{
			saldo -= valor;
			this.setSaldo(saldo);
		}
		else 
			throw new NoBalanceException();
	}
	
	public void creditarJuros() 
	{
		double rendimento = this.getSaldo() * percJuro / 100;
		this.setSaldo(this.getSaldo() + rendimento);
	}
	
	
	public void mostrarDados() 
	{
		System.out.println("Conta poupança: "+super.toString()
        			+",\n\t\tTaxa de juros = "+ percJuro+"%");
	}
	
}
