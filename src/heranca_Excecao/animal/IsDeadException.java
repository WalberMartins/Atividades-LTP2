package heranca_Excecao.animal;

public class IsDeadException extends Exception
{
	private static final long serialVersionUID = 1L;

	public IsDeadException()
	{
		this("Animal está morto!");
	}
	
	public IsDeadException(String mensagem)
	{
		super(mensagem);
	}
	
}
