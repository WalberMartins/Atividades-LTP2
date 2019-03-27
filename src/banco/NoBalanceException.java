package banco;

public class NoBalanceException extends Exception
{
	
	private static final long serialVersionUID = 1L;

	public NoBalanceException()
	{
		super("saldo insuficiente");
	}
	
}
