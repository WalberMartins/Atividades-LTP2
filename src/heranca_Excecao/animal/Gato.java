package heranca_Excecao.animal;

public class Gato extends Mamifero
{
	private boolean noMuro;
	
	public Gato(String nome, String nomeDono)
	{
		super(nome, nomeDono);
	}
	
	public Boolean getNoMuro()
	{
		return noMuro;
	}
	
	public void som() throws IsDeadException
	{
		if(!super.isVivo())
			throw new IsDeadException();
		System.out.println("Miau, Miau!");
	}
	
	public void subirMuro() throws IsDeadException
	{
		if(!super.isVivo())
			throw new IsDeadException();
		noMuro = true;
	}
	
	public void decerMuro() throws IsDeadException
	{
		if(!super.isVivo())
			throw new IsDeadException();
		noMuro = false;
	}
	
}
