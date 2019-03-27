package banco;

import java.util.ArrayList;

public class Banco
{
	private ArrayList<ContaBancaria> lista = new ArrayList<>();
	
	public void inserirConta(ContaBancaria conta)
	{
		lista.add(conta);
	}
	
	public boolean removerConta(ContaBancaria conta)
	{
		if(lista.remove(conta))
			return true;
		return false;
	}
	
	public ContaBancaria pesquisarConta(ContaBancaria conta)
	{
		int posicao = lista.indexOf(conta);
		if(posicao != -1)
			return lista.get(posicao);
		return null;
	}
	
	public void calcularJurosPoupanca()
	{
		for(ContaBancaria conta: lista)
		{
			if(conta instanceof Poupanca)
				((Poupanca) conta).creditarJuros();
		}
		
	}
	
}
