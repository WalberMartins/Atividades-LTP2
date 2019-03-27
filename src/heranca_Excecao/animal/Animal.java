package heranca_Excecao.animal;

public abstract class Animal 
{
	private boolean vivo;
	private String nome;
	private int idade;
	
	public Animal(String nome)
	{
		this.nome = nome;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public boolean nascer()
	{
		vivo = true;
		return true;
	}
	
	public boolean morrer()
	{
		vivo = false;
		return false;
	}
	
	public int fazerAniversario() throws IsDeadException
	{
		if(!isVivo())
			throw new IsDeadException();
		idade++;
		return idade;
	}
	
	public boolean isVivo()
	{
		return vivo;
	}
	
	public abstract void som() throws IsDeadException;
	
}
