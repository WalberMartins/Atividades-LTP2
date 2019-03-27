package heranca_Excecao.animal;

public class Cao extends Mamifero
{
	private boolean vigiando;
	
	public Cao(String nome, String nomeDono)
	{
		super(nome, nomeDono);
	}
	
	public Boolean getVigiando()
	{
		return vigiando;
	}
	
	public void som() throws IsDeadException
	{
		if(!super.isVivo())
			throw new IsDeadException();
		System.out.println("AU! AU!");
	}
	
	public void vigiar() throws IsDeadException
	{
		if(!super.isVivo())
			throw new IsDeadException();
		vigiando = true;
	}
	
	public void relaxar() throws IsDeadException
	{
		if(!super.isVivo())
			throw new IsDeadException();
		vigiando = false;	
	}
	
}
