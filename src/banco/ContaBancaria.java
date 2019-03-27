package banco;

public abstract class ContaBancaria 
{
	private int numConta;
	private String nomeTitular;
	private double saldo;
	
	public ContaBancaria(int numConta, String nomeTitular, double saldo)
	{
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}
	
	public void depositar(double valor)
	{
		saldo += valor;
	}
	
	abstract void sacar(double valor) throws NoBalanceException;
	
	public void transferir(double valor, ContaBancaria conta) throws NoBalanceException
	{
		try
		{
			sacar(valor);
			conta.depositar(valor);
		}
		catch(NoBalanceException e) { throw e; };
	}

	public int getNumConta() 
	{
		return numConta;
	}

	public void setNumConta(int numConta) 
	{
		this.numConta = numConta;
	}

	public String getNomeTitular() 
	{
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) 
	{
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() 
	{
		return saldo;
	}

	public void setSaldo(double saldo) 
	{
		this.saldo = saldo;
	}

	@Override
	public String toString() 
	{
		return "Número da Conta = " + numConta + ", Nome do Titular = " + nomeTitular + ", saldo = R$ " + saldo + "";
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		ContaBancaria other = (ContaBancaria) obj;
		if (numConta != other.numConta)
			return false;
		return true;
	}
	
}
