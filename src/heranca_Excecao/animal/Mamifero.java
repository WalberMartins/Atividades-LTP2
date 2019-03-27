package heranca_Excecao.animal;

public abstract class Mamifero extends Animal
{
	private float cotaDiariaLeite;
	private String nomeDono;
	
	public Mamifero(String nome, String nomeDono)
	{
		super(nome);
		this.nomeDono = nomeDono;
	}
	
	public float getCotaDiariaLeite()
	{
		return cotaDiariaLeite;
	}
	
	public void mamar(float cotaDiariaLeite) throws IsDeadException
	{
		if(!super.isVivo())
			throw new IsDeadException();
		this.cotaDiariaLeite += cotaDiariaLeite;	
	}
	
	public void setNomeDono(String nomeDono)
	{
		this.nomeDono = nomeDono;
	}
	
	public String getNomeDono()
	{
		return nomeDono;
	}
	
}
